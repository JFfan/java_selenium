package wysh.json2;

public class Page {
    private int likeCount;
    private int pageViewCount;

    public Page() {
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getPageViewCount() {
        return pageViewCount;
    }

    public void setPageViewCount(int pageViewCount) {
        this.pageViewCount = pageViewCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "likeCount=" + likeCount +
                ", pageViewCount=" + pageViewCount +
                '}';
    }
}
