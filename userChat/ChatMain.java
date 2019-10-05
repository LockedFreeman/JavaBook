package homework.userChat;

import java.util.Date;
import java.util.Scanner;


public class ChatMain implements Command {
    static UserStorage us = new UserStorage();
    static MassageStorage ms = new MassageStorage();
    static Scanner scanner = new Scanner(System.in);
    static boolean isRun = true;
    static User carrentUser = null;
    static FriendStorage fs = new FriendStorage();


    public static void main(String[] args) {

        while (isRun) {
            try {
                printcommands();
                int command = Integer.parseInt(scanner.nextLine());

                switch (command) {
                    case EXIT:
                        isRun = false;
                        System.out.println("ctesutyun");
                        break;
                    case LOGIN:
                        userLogin();
                        break;
                    case REGISTER:
                        registration();
                        break;
                    default:
                        System.out.println("nman hraman chka");

                }
            } catch (NumberFormatException e) {
                System.out.println("havaqeq canki miji tveric");
            }
        }


    }

    private static void registration() {
        System.out.println("mutqagreq name,surname,gender,email,password");
        try {
            String userDataStr = scanner.nextLine();
            String[] userData = userDataStr.split(",");
            if (userData.length != 5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            User user = new User();
            user.setName(userData[0]);
            user.setSurname(userData[1]);
            user.setGender(userData[2]);
            user.setEmail(userData[3]);
            user.setPassword(userData[4]);
            us.add(user);
            System.out.println("duq hajoxutyamb grancvel eq");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("sxal mutq");
        }

    }

    private static void userLogin() {
        System.out.println("mutqagreq email ev password");
        try {
            String login = scanner.nextLine();
            String[] userDat = login.split(",");
            if (userDat.length != 2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            carrentUser = us.logUser(userDat[0], userDat[1]);

            if (carrentUser == null) {
                throw new UserNotFoundException();
            } else {
                while (isRun) {
                    userPrintCommands();
                    int userCommand = Integer.parseInt(scanner.nextLine());
                    switch (userCommand) {
                        case EXIT:
                            isRun = false;
                            break;
                        case LOGOUT:
                            carrentUser = null;
                            break;
                        case MY_NEW_MASSAGES:
                            myNewMessages();

                            break;
                        case MY_ALL_MASSAGES:
                            myAllMessages();
                            break;
                        case MY_ALL_SENT_MESSAGES:
                            myAllSentMessages();
                            break;
                        case SEND_MESSAGE:
                            sendMessage();
                            break;
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("havaqeq canki miji tveric");
        } catch (UserNotFoundException e) {
            System.out.println("nman ogtater chka");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("sxal mutq");
        }


    }

    private static void sendMessage() {
        Date date = new Date();
        System.out.println("um");
        try {
            String toEmail = scanner.nextLine();
            String[] messData = toEmail.split(",");
            if (messData.length != 2) {
                throw new ArrayIndexOutOfBoundsException();
            }

            Massage massage = new Massage();
            massage.setFromEmail(carrentUser.getEmail());
            massage.setToEmail(messData[0]);
            massage.setText(messData[1]);
            massage.setSendDate(date);
            massage.setSeen(true);
            ms.add(massage);
            System.out.println("namak@ uxarkvel e");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("sxal mutq");
        }
    }

    private static void myAllSentMessages() {
        ms.myAllSentMessages(carrentUser.getEmail());
    }

    private static void myAllMessages() {
        ms.myAllMessages(carrentUser.getEmail());
    }

    private static void myNewMessages() {
        ms.myNewMessages(carrentUser.getEmail());

    }

    public static void printcommands() {

        System.out.println("Press " + EXIT + " durs galu hamar");
        System.out.println("Press" + LOGIN + " mutq gorcelu hamar");
        System.out.println("Press " + REGISTER + " grancvelu hamar");

    }

    public static void userPrintCommands() {
        System.out.println("Press " + EXIT + " cragir@ pakelu hamar");
        System.out.println("Press " + LOGOUT + " durs galu hamar");
        System.out.println("Press " + MY_NEW_MASSAGES + " nor namakner@ tesnelu hamar");
        System.out.println("Press " + MY_ALL_MASSAGES + " bolor namakner@ tesnelu hamar");
        System.out.println("Press " + MY_ALL_SENT_MESSAGES + " bolor uxarkvac namakner@ tesnelu hamar");
        System.out.println("Press " + SEND_MESSAGE + " namak uxarkelu hamar");

    }

    public static void addFriendCommands() {
        System.out.println("Press " + SEND_REQUEST + "to send request");
        System.out.println("Press " + ADD_FRIEND + "to add friand");
        System.out.println("Press " + IGNORED + "to ignored request");
    }

}
