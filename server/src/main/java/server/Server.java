package server;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Server {
    private LabWorks works;

    public Server() {
        this.works = new LabWorks();
    }

    @WebMethod
    public int addWork(String name, byte[] work) {
        return works.addWork(name, work);
    }

    @WebMethod
    public ArrayList<Work> getWorks() {
        ArrayList<LabWork> allworks = works.getWorks();
        ArrayList<Work> res = new ArrayList<>();
        for (LabWork work : allworks) {
            res.add(new Work(work.getName(), work.getId()));
        }
        return res;
    }

    @WebMethod
    public ArrayList<Integer> getIdsRandomWorks() {
        return works.getIdsRandomWorks();
    }

    @WebMethod
    public byte[] getWork(int id) {
        return works.getWork(id);
    }

    @WebMethod
    public void setMark(int id, String name, int mark) {
        works.setMark(id, name, mark);
    }

    @WebMethod
    public ArrayList<Mark> getAllMarks(int id) {
        return works.getAllMarks(id);
    }

    @WebMethod
    public double getAverageMark(int id) {
        return works.getAverageMark(id);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/server", new Server());
    }
}
