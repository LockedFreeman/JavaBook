package homework.userChat;

public class UserStorage {

    User[] users = new User[10];
    int size = 0;

    public void add(User user) {
        if (size == users.length) {
            extend();
        } else {
            users[size++] = user;
        }

    }

    private void extend() {
        User[] us = new User[users.length + 9];
        System.arraycopy(users, 0, us, 0, users.length);
        users = us;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User logUser (String email,String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }  return null;
    }
}