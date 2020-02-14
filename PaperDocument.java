public class PaperDocument implements PaperDocumentInterface {
    private String type;
    private String title;
    private String content;

    public PaperDocument() {
    }

    public PaperDocument(String type, String title, String content) {
        this.type = type;
        this.title = title;
        this.content = content;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PaperDocument { " +
                "type = '" + type + '\'' +
                ", title = '" + title + '\'' +
                ", content = '" + content + '\'' +
                '}';
    }
}
