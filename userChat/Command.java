package homework.userChat;

public interface Command {
    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;
    int LOGOUT = 1;
    int MY_NEW_MASSAGES = 2;
    int MY_ALL_MASSAGES = 3;
    int MY_ALL_SENT_MESSAGES = 4;
    int SEND_MESSAGE = 5;
    int ADD_FRIEND = 99;
    int SEND_REQUEST = 9;
    int IGNORED = 90;
}
