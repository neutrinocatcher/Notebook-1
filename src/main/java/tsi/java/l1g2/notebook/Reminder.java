package tsi.java.l1g2.notebook;

import asg.cliche.Command;

public class Reminder extends Note {
    private String time;

    @Command
    public String getTime() {
        return time;
    }

    @Command
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
