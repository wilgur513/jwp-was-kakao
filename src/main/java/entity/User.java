package entity;

import java.util.Objects;

public class User {
    private final String userId;
    private final String password;
    private final String name;
    private final String email;

    private User(String userId, String password, String name, String email) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
    }
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder{

        private String userId;
        private String password;
        private String name;
        private String email;

        public UserBuilder userId(String userId){
            this.userId=userId;
            return this;
        }
        public UserBuilder password(String password){
            this.password=password;
            return this;
        }
        public UserBuilder name(String name){
            this.name=name;
            return this;
        }
        public UserBuilder email(String email){
            this.email=email;
            return this;
        }

        public User build(){
            return new User(userId, password, name, email);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(password, user.password)
                && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password, name, email);
    }
}