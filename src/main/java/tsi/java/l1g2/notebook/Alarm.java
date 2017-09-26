package tsi.java.l1g2.notebook;

import asg.cliche.Command;

import java.time.LocalTime;

public class Alarm extends Note implements Expirable {
    private String time;

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Command
    public String getTime() {
        return time;
    }

    @Command
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean contains(String str) {
        if(super.contains(str)) {
            return true;
        }

        return time.toLowerCase().contains(str.toLowerCase());
    }
}
