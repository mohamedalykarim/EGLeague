package bm.mohalim.egleague.ui.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import bm.mohalim.egleague.R;
import bm.mohalim.egleague.data.model.MainPageItem;
import bm.mohalim.egleague.ui.fragment.MainPageItemFragment;

public class MainPagerAdapter extends FragmentPagerAdapter {

    private static final int ITEMS_COUNT = 4;
    private static final String ARGS = "args";


    private static final String EG_LEAGUE = "https://www.google.com/search?q=%D8%A7%D9%84%D8%AF%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%8A&oq=%D8%A7%D9%84%D8%AF%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%8A&aqs=chrome..69i57j46i433j0i433j0l2j0i433j0l2j0i131i433j46.4952j0j7&sourceid=chrome&ie=UTF-8#sie=lg;/g/11m79mtpm4;2;/m/092b7b;st;fp;1;;";
    private static final String PREMIER_LEAGUE = "https://www.google.com/search?q=%D8%A7%D9%84%D8%AF%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D9%86%D8%AC%D9%84%D9%8A%D8%B2%D9%8A&sxsrf=ALeKk02YWuhpMKuy12ZgHfXXKmQUk79ZqQ%3A1616195212247&ei=jC5VYKXVDpiZ1fAPx9WS6A0&oq=%D8%A7%D9%84%D8%AF%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D9%86%D8%AC%D9%84%D9%8A%D8%B2%D9%8A&gs_lcp=Cgdnd3Mtd2l6EAMyCAguELEDEJMCMgUIABCxAzIFCAAQsQMyAgguMggIABCxAxCDATICCC4yBQgAELEDMgIIADICCAAyAggAOgcIIxCwAxAnOgcILhCwAxBDOgcIABCwAxBDOgQIIxAnOgcILhCxAxBDOgQILhBDOgkIIxAnEEYQ_QE6CAguELEDEIMBOgUILhCxAzoLCC4QsQMQgwEQkwJQtMgCWPXYAmDq2wJoA3ACeACAAYYCiAG3GJIBBjAuMTYuMZgBAKABAaoBB2d3cy13aXrIAQrAAQE&sclient=gws-wiz&ved=0ahUKEwily42svL3vAhWYTBUIHceqBN0Q4dUDCA0&uact=5#sie=lg;/g/11j4y8fvpd;2;/m/02_tc;st;fp;1;;";
    private static final String LA_LIGA = "https://www.google.com/search?q=%D8%A7%D9%84%D8%AF%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B3%D8%A8%D8%A7%D9%86%D9%8A&oq=%D8%A7%D9%84%D8%AF%D9%88%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B3%D8%A8%D8%A7%D9%86%D9%8A&aqs=chrome..69i57j46i433j46j0i433j0l3j46j0j46.5682j0j9&sourceid=chrome&ie=UTF-8#sie=lg;/g/11j0y2m458;2;/m/09gqx;st;fp;1;;";
    private static final String CAF = "https://www.cafonline.com/";
    private Context mContext;


    public MainPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return pagerInstance(mContext.getResources().getString(R.string.egypt_league), EG_LEAGUE, R.drawable.egypt_league);

            case 1:
                return pagerInstance(mContext.getResources().getString(R.string.premeir_league), PREMIER_LEAGUE, R.drawable.premier_league);

            case 2:
                return pagerInstance(mContext.getResources().getString(R.string.la_liga), LA_LIGA, R.drawable.la_liga);

            case 3:
                return pagerInstance(mContext.getResources().getString(R.string.caf), CAF,  R.drawable.caf);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return ITEMS_COUNT;
    }




    private MainPageItemFragment pagerInstance(String name, String url, int imageRes){
        MainPageItem mainPageItem = new MainPageItem();
        mainPageItem.setTitle(name);
        mainPageItem.setImage(imageRes);
        mainPageItem.setUrl(url);


        Bundle args = new Bundle();
        args.putParcelable(ARGS, mainPageItem);

        return MainPageItemFragment.newInstance(args);

    }
}
