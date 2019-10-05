package homework.userChat;

import java.util.Date;
import java.util.Objects;

public class Massage {

    private String fromEmail;
    private String toEmail;
    private String text;
    private Date sendDate;
    private boolean isSeen;


    public Massage(String fromEmail, String toEmail, String text, Date sendDate, boolean isSeen) {
        this.fromEmail = fromEmail;
        this.toEmail = toEmail;
        this.text = text;
        this.sendDate = sendDate;
        this.isSeen = isSeen;
    }

    public Massage() {
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Massage massage = (Massage) o;
        return isSeen == massage.isSeen &&
                Objects.equals(fromEmail, massage.fromEmail) &&
                Objects.equals(toEmail, massage.toEmail) &&
                Objects.equals(text, massage.text) &&
                Objects.equals(sendDate, massage.sendDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromEmail, toEmail, text, sendDate, isSeen);
    }

    @Override
    public String toString() {
        return "Massage{" +
                "fromEmail='" + fromEmail + '\'' +
                ", toEmail='" + toEmail + '\'' +
                ", text='" + text + '\'' +
                ", sendDate=" + sendDate +
                ", isSeen=" + isSeen +
                '}';
    }
}
