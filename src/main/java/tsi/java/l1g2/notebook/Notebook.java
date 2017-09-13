package tsi.java.l1g2.notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private final List<Record> records = new ArrayList<>();

    @Command
    public void create(String firstName, String lastName, String phone) {
        Record r = new Record();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.setPhone(phone);
        records.add(r);
    }

    @Command
    public List<Record> list() {
        return records;
    }
}
