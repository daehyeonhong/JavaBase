public class ChildClass extends Inheritance {
    private String childField1;
    private String childField2;
    private String childField3;

    public ChildClass(final String parentField1, final String parentField2, final String parentField3, final String childField1, final String childField2, final String childField3) {
        super(parentField1, parentField2, parentField3);
        this.childField1 = childField1;
        this.childField2 = childField2;
        this.childField3 = childField3;
    }

    public String getChildField1() {
        return childField1;
    }

    public void setChildField1(final String childField1) {
        this.childField1 = childField1;
    }

    public String getChildField2() {
        return childField2;
    }

    public void setChildField2(final String childField2) {
        this.childField2 = childField2;
    }

    public String getChildField3() {
        return childField3;
    }

    public void setChildField3(final String childField3) {
        this.childField3 = childField3;
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "childField1='" + childField1 + '\'' +
                ", childField2='" + childField2 + '\'' +
                ", childField3='" + childField3 + '\'' +
                ", parentField1='" + parentField1 + '\'' +
                ", parentField2='" + parentField2 + '\'' +
                ", parentField3='" + parentField3 + '\'' +
                '}';
    }
}
