public class BuddyInfo {
    public String getName() {
        return name;
    }

    public BuddyInfo(String name) {
        this.name = name;
    }

    private String name;

    public static void main(String[] args) {
        BuddyInfo myObj = new BuddyInfo("Daniel");
        System.out.print("Hello " + myObj.getName());
    }
}
