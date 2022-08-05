package teacher;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import webservice.service.Mark;
import webservice.service.Server;
import webservice.service.ServerService;
import webservice.service.Work;

public class App {
    public static void main(String[] args) throws MalformedURLException {
        Server serverPort = new ServerService(new URL("http://localhost:8080/server?wsdl")).getServerPort();
        Scanner in = new Scanner(System.in);
        int work = 1;
        while (work != 0) {
            System.out.println("Choose an action:\n1. Get all works\n2. Get work\n3. Get all marks");
            System.out.println("Input 0 to exit");
            work = in.nextInt();
            in.nextLine();
            switch (work) {
                case 1: {
                    ArrayList<Work> works = new ArrayList<>(serverPort.getWorks());
                    for (Work w : works) {
                        System.out.println("Name: " + w.getName() + " - id: " + w.getId());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Input id work");
                    int id = in.nextInt();
                    byte[] lab = serverPort.getWork(id);
                    if (lab == null) {
                        System.out.println("There is no lab with this id");
                        break;
                    }
                    try {
                        FileOutputStream out = new FileOutputStream(id + ".txt");
                        out.write(lab);
                        out.close();
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    } catch (IOException e) {
                        System.out.println(e);
                    }   
                    break;
                }
                case 3: {
                    System.out.println("Input id work");
                    int id = in.nextInt();
                    ArrayList<Mark> marks = new ArrayList<>(serverPort.getAllMarks(id));
                    if (marks.isEmpty()) {
                        System.out.println("Work not yet rated");
                        break;
                    }
                    for (Mark mark : marks) {
                        System.out.println("Name: " + mark.getName() + " - mark: " + mark.getMark());
                    }
                    break;
                }
                default: {
                    break;
                }
            }
        }
        in.close();
    }
}
