public class Film {
    private String name;
    private int publicationYear;
    private String type;
    private double ImbdScore;

    public Film(String name, int publicationYear, String type, double imbdScore) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.type = type;
        ImbdScore = imbdScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getImbdScore() {
        return ImbdScore;
    }

    public void setImbdScore(double imbdScore) {
        ImbdScore = imbdScore;
    }

    @Override
    public String toString() {
        return name + " (" + publicationYear + ") - " + type + " - IMDb: " + ImbdScore;
    }
}
