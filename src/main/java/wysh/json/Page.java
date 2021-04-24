package wysh.json;

public class Page {
    private int pageViewCount;

    private int likeCount;

    public Page() {
    }

    public Page(int pageViewCount, int likeCount) {
        this.pageViewCount = pageViewCount;
        this.likeCount = likeCount;
    }

    public int getPageViewCount() {
        return pageViewCount;
    }

    public void setPageViewCount(int pageViewCount) {
        this.pageViewCount = pageViewCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
