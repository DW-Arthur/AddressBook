import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook extends BuddyInfo{
    private  ArrayList<BuddyInfo> buddyInfoList =new ArrayList<BuddyInfo>();
    //String name = "test";
    //public ArrayList<BuddyInfo> buddyInfoList = new ArrayList<BuddyInfo>();

    public AddressBook(String name) {

        super(name);
        buddyInfoList= new ArrayList<>();
    }


    public static void main(String[] args) {
        //Scanner myObj = new Scanner(System.in);
        //String nameAdd = myObj.nextLine();
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook addressBook = new AddressBook("new");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        //String nameDelete = myObj.nextLine();

        System.out.println("test");
        System.out.println("Online Editor test");
        

    }
    public void addBuddy(BuddyInfo buddy){
        //String test;
        if(buddy != null){
            buddyInfoList.add(buddy);
        }

        //String test = Arrays.toString(myObj.toArray());
        System.out.println(buddyInfoList.toString());
        ;

    }
    public BuddyInfo removeBuddy(int index){
        //String test;
        if(index >=0 && index < buddyInfoList.size())
            buddyInfoList.remove(index);
        System.out.println(buddyInfoList.toString());

        return null;
    }
}
