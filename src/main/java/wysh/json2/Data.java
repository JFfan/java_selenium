package wysh.json2;

public class Data {
    private Page pageVo;
    private Person[] result;

    public Data() {
    }

    public Page getPageVo() {
        return pageVo;
    }

    public void setPageVo(Page pageVo) {
        this.pageVo = pageVo;
    }

    public Person[] getResult() {
        return result;
    }

    public void setResult(Person[] result) {
        this.result = result;
    }
}
