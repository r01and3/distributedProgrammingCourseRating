package server;

import java.util.ArrayList;
import java.util.Collections;

public class LabWorks {
    private int nextId;
    private ArrayList<LabWork> works;

    public LabWorks() {
        this.nextId = -1;
        this.works = new ArrayList<>();
    }

    public int addWork(String name, byte[] work) {
        nextId += 1;
        works.add(new LabWork(nextId, name, work));
        return nextId;
    }

    public ArrayList<LabWork> getWorks() {
        return works;
    }

    public ArrayList<Integer> getIdsRandomWorks() {
        ArrayList<LabWork> tmp = works;
        ArrayList<Integer> ids = new ArrayList<>();
        Collections.sort(tmp);
        int count = tmp.size() > 3 ? 3 : tmp.size();
        for (int i = 0; i < count; i++) {
            ids.add(tmp.get(i).getId());
        }
        return ids;
    }

    public byte[] getWork(int id) {
        if (id > works.size() - 1) return null;
        return works.get(id).getWork();
    }

    public void setMark(int id, String name, int mark) {
        if (id > works.size() - 1 || mark < 2 || mark > 5) return;
        works.get(id).setMark(name, mark);
    }

    public ArrayList<Mark> getAllMarks(int id) {
        if (id > works.size() - 1) return null;
        return works.get(id).getMarks();
    }

    public double getAverageMark(int id) {
        if (id > works.size() - 1) return -1.0;
        return works.get(id).getAverageMark();
    }
}
