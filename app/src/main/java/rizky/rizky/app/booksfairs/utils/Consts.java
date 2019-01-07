package rizky.rizky.app.booksfairs.utils;
import pop.vindi.app.booksfairs.BuildConfig;

public class Consts{
    public static final String POPULAR = "popular";
    public static final String NOW_PLAYING = "now_playing";
    public static final String UPCOMING = "upcoming";

    public static String loadBookBanner(String filename){
        return BuildConfig.IMG_URL + filename;
    }
}