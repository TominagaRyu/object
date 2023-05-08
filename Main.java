package Object;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("ヒガ","沖縄","2001/04/25");
        User user2 = new User("タナカ","東京","2002/03/26");
        User user3 = new User("ヒガ","沖縄","2001/04/25");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
    }
}
