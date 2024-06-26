package code.name.monkey.toolbelt;

class FakeData {
    private final String title;
    private final String description;
    private final String imageUrl;

    public FakeData(String title, String description, String imageUrl) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}