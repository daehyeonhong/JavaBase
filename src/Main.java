public class Main {
    public static void main(String[] args) {
        final ChildClass childClass = new ChildClass("1", "2", "3", "4", "5", "6");
        final String parentField1 = childClass.getParentField1();
        System.out.println("parentField1 = " + parentField1);
        System.out.println("childClass = " + childClass);
    }
}
