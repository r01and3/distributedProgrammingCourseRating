package server;

import java.util.ArrayList;

public class LabWork implements Comparable {
    private int id;
    private String name;
    private byte[] work;
    private ArrayList<Mark> marks;

    public LabWork(int id, String name, byte[] work) {
        this.id = id;
        this.name = name;
        this.work = work;
        this.marks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte[] getWork() {
        return work;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public double getAverageMark() {
        if (marks.isEmpty()) return 0.0;
        double average = 0;
        for (Mark mark : marks) {
            average += mark.mark;
        }
        return average / marks.size();
    }

    public void setMark(String name, int mark) {
        marks.add(new Mark(name, mark));
    }

    @Override
    public int compareTo(Object obj) {
        LabWork tmp = (LabWork)obj;
        return this.marks.size() - tmp.marks.size();
    }
}
