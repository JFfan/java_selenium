package wysh.json3;

public class Industry {
    private int industry;
    private int twoIndustryId;
    private String oneIndustryName;
    private String twoIndustryName;

    public Industry() {
    }

    @Override
    public String toString() {
        return "Industry{" +
                "industry=" + industry +
                ", twoIndustryId=" + twoIndustryId +
                ", oneIndustryName='" + oneIndustryName + '\'' +
                ", twoIndustryName='" + twoIndustryName + '\'' +
                '}';
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public int getTwoIndustryId() {
        return twoIndustryId;
    }

    public void setTwoIndustryId(int twoIndustryId) {
        this.twoIndustryId = twoIndustryId;
    }

    public String getOneIndustryName() {
        return oneIndustryName;
    }

    public void setOneIndustryName(String oneIndustryName) {
        this.oneIndustryName = oneIndustryName;
    }

    public String getTwoIndustryName() {
        return twoIndustryName;
    }

    public void setTwoIndustryName(String twoIndustryName) {
        this.twoIndustryName = twoIndustryName;
    }
}
