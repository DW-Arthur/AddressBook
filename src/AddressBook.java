import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook extends BuddyInfo{
    private static ArrayList<BuddyInfo> buddyInfoList =new ArrayList<BuddyInfo>();
    //String name = "test";
    //public ArrayList<BuddyInfo> buddyInfoList = new ArrayList<BuddyInfo>();

    public AddressBook(String name) {
        super(name);
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String nameAdd = myObj.nextLine();
        addBuddy(nameAdd);
        String nameDelete = myObj.nextLine();
        removeBuddy(nameDelete);
        System.out.println("test");


    }
    public static ArrayList<BuddyInfo> addBuddy(String name){
        //String test;
        BuddyInfo myObj = new BuddyInfo(name);
        buddyInfoList.add(myObj);
        //String test = Arrays.toString(myObj.toArray());
        String listString = buddyInfoList.stream().map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println(listString);

        return buddyInfoList;

    }
    public static ArrayList<BuddyInfo>removeBuddy(String name){
        String test;
        BuddyInfo myObj = new BuddyInfo(name);
        buddyInfoList.remove(myObj);
        System.out.println(buddyInfoList.toString());
        return buddyInfoList;
    }
}
