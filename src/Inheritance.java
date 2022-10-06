public class Inheritance {
    protected String parentField1;
    protected String parentField2;
    protected String parentField3;

    public Inheritance(final String parentField1, final String parentField2, final String parentField3) {
        this.parentField1 = parentField1;
        this.parentField2 = parentField2;
        this.parentField3 = parentField3;
    }

    public String getParentField1() {
        return parentField1;
    }

    public void setParentField1(final String parentField1) {
        this.parentField1 = parentField1;
    }

    public String getParentField2() {
        return parentField2;
    }

    public void setParentField2(final String parentField2) {
        this.parentField2 = parentField2;
    }

    public String getParentField3() {
        return parentField3;
    }

    public void setParentField3(final String parentField3) {
        this.parentField3 = parentField3;
    }
}
