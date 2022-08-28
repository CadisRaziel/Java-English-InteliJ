package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        // static -> modifier. a single copy of a variable/method is created and shared.
        // static -> the class "owns" the static member
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);

        Friend.displayFriend();
    }
}
