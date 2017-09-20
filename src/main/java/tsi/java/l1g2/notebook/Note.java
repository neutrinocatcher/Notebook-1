package tsi.java.l1g2.notebook;

import asg.cliche.Command;
import asg.cliche.Param;

public class Note extends Record {
    private String text;

    @Command
    public String getText() {
        return text;
    }

    @Command
    public void setText( String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + text + '\'' +
                '}';
    }
}
