package Object;

import java.util.Objects;

public class User {
    private final String name;
    private final String from;
    private final String birthday;

    public User(String name, String from, String birthday) {
        this.name = name;
        this.from = from;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object ojc) {
        if (this == ojc) {
            return true;
        }
        if (!(ojc instanceof User)) {
            return false;
        }
        User user = (User) ojc;
        return Objects.equals(name, user.name) && Objects.equals(from, user.from) && Objects.equals(birthday, user.birthday);
    }
        @Override
    public int hashCode() {
        return Objects.hash(name, from, birthday);
    }


    @Override
    public String toString(){
        return "名前：" + name + ", 出身地：" + from + ", 生年月日：" + birthday;
    }
}