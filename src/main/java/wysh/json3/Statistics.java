package wysh.json3;

public class Statistics {
    private int contentId;
    private int pageViewCount;
    private int likeCount;
    private int pageDownloadCount;
    private int favouriteCount;
    private int commentCount;
    private int userViewCount;
    private int userDownloadCount;
    private int shareCount;
    private int questionFocusCount;

    public Statistics() {
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "contentId=" + contentId +
                ", pageViewCount=" + pageViewCount +
                ", likeCount=" + likeCount +
                ", pageDownloadCount=" + pageDownloadCount +
                ", favouriteCount=" + favouriteCount +
                ", commentCount=" + commentCount +
                ", userViewCount=" + userViewCount +
                ", userDownloadCount=" + userDownloadCount +
                ", shareCount=" + shareCount +
                ", questionFocusCount=" + questionFocusCount +
                '}';
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
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

    public int getPageDownloadCount() {
        return pageDownloadCount;
    }

    public void setPageDownloadCount(int pageDownloadCount) {
        this.pageDownloadCount = pageDownloadCount;
    }

    public int getFavouriteCount() {
        return favouriteCount;
    }

    public void setFavouriteCount(int favouriteCount) {
        this.favouriteCount = favouriteCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getUserViewCount() {
        return userViewCount;
    }

    public void setUserViewCount(int userViewCount) {
        this.userViewCount = userViewCount;
    }

    public int getUserDownloadCount() {
        return userDownloadCount;
    }

    public void setUserDownloadCount(int userDownloadCount) {
        this.userDownloadCount = userDownloadCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getQuestionFocusCount() {
        return questionFocusCount;
    }

    public void setQuestionFocusCount(int questionFocusCount) {
        this.questionFocusCount = questionFocusCount;
    }
}

