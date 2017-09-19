package tsi.java.l1g2.notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

}
