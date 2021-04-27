package wysh.json3;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Data {
    private String creator;
    private int contentId;
    private String title;
    private String profile;
    private String content;
    private int[] scopeCollection;
    private String solutionStatusStr;
    private Statistics statistics;
    private Industry industry;

    public Data() {
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int[] getScopeCollection() {
        return scopeCollection;
    }

    public void setScopeCollection(int[] scopeCollection) {
        this.scopeCollection = scopeCollection;
    }

    public String getSolutionStatusStr() {
        return solutionStatusStr;
    }

    public void setSolutionStatusStr(String solutionStatusStr) {
        this.solutionStatusStr = solutionStatusStr;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Industry getIndustry() {
        return industry;
    }

    @Override
    public String toString() {
        return "Data{" +
                "creator='" + creator + '\'' +
                ", contentId=" + contentId +
                ", title='" + title + '\'' +
                ", profile='" + profile + '\'' +
                ", content='" + content + '\'' +
                ", scopeCollection=" + Arrays.toString(scopeCollection) +
                ", solutionStatusStr='" + solutionStatusStr + '\'' +
                ", statistics=" + statistics +
                ", industry=" + industry +
                '}';
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }
}
