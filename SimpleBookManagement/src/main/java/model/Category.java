package model;

public enum Category {
    Comics("Comics"), Technology("Technology"), Health("Health"), History("History"), Science("Science");

    private final String brandName;

    private Category(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return this.brandName;
    }

    public static Category getCategory(String str){

        switch (str.toLowerCase()) {
            case "comics":
                return Comics;
            case "technology":
                return Technology;
            case "health":
                return Health;
            case "history":
                return History;
            case "science":
                return Science;
            default:
                return null;
        }
    }

}
