package homework.userChat;

public class FriendStorage {

    User u = new User();

    Friend[] fr = new Friend[3];
    int size = 0;

    public void add(Friend friend) {
        if (size == fr.length) {
            extend();
        } else {
            fr[size++] = friend;
        }
    }

    private void extend() {
        Friend[] f = new Friend[10 + fr.length];
        System.arraycopy(fr, 0, f, 0, fr.length);
        fr = f;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(fr[i]);
        }
    }

    public void sendRequest(String id) {
        for (int i = 0; i < size; i++) {
            if (fr[i].getId().contains(u.getId())) {
                System.out.println(fr[i]);
            }
        }


    }


}
