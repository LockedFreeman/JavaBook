package homework.userChat;

public class MassageStorage {

    Massage[] mass = new Massage[15];
    int size = 0;

    public void add(Massage massage){
        if (size==mass.length){
            extend();
        } else{
            mass[size++] = massage;
        }
    }

    private void extend() {
        Massage[] m = new Massage[10 + mass.length];
        System.arraycopy(mass,0,m,0,mass.length);
        mass = m;
    }

    public void myAllMessages(String email) {
        for (int i = 0; i < size; i++) {
            if (mass[i].getToEmail().equals(email)){
                System.out.println(mass[i]);
            }
        }
        
    }

    public void myAllSentMessages(String email) {
        for (int i = 0; i < size; i++) {
            if (mass[i].getFromEmail().equals(email)){
                System.out.println(mass[i]);
            }
        }
    }

    public void myNewMessages(String email) {
        for (int i = 0; i < size; i++) {
            if (mass[i].getToEmail().equals(email)&&mass[i].isSeen()==false){
                System.out.println(mass[i]);
                mass[i].setSeen(true);

            }
        }
    }
}
