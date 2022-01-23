package utils;

public class Enumerations {

    public enum URL {
        MOVIES("http://www.omdbapi.com/"),
        KEY("&apikey=9d24961e");

        private final String url;

        URL(String envUrl) {
            this.url = envUrl;
        }

        public String getUrl() {
            return url;
        }
    }
}
