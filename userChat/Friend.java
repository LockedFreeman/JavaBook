package homework.userChat;

import java.util.Objects;

public class Friend {

    private String addFriend;
    private String ignored;
    private String request;
    private String Id;

    public Friend(String addFriend, String ignor, String request, String id) {
        this.addFriend = addFriend;
        this.ignored = ignored;
        this.request = request;
        Id = id;
    }

    public Friend() {
    }

    public String getAddFriend() {
        return addFriend;
    }

    public void setAddFriend(String addFriend) {
        this.addFriend = addFriend;
    }

    public String getIgnor() {
        return ignored;
    }

    public void setIgnor(String ignor) {
        this.ignored = ignor;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Objects.equals(addFriend, friend.addFriend) &&
                Objects.equals(ignored, friend.ignored) &&
                Objects.equals(request, friend.request) &&
                Objects.equals(Id, friend.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addFriend, ignored, request, Id);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "addFriend='" + addFriend + '\'' +
                ", ignor='" + ignored + '\'' +
                ", request='" + request + '\'' +
                ", Id='" + Id + '\'' +
                '}';
    }
}
