package student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import webservice.service.Server;
import webservice.service.ServerService;

public class App {
    public static void main(String[] args) throws MalformedURLException {
        Server serverPort = new ServerService(new URL("http://localhost:8080/server?wsdl")).getServerPort();
        Scanner in = new Scanner(System.in);
        int work = 1;
        while (work != 0) {
            System.out.println("Choose an action:\n1. Add work\n2. Get random ids\n3. Get work\n4. Set mark\n5. Get average mark");
            System.out.println("Input 0 to exit");
            work = in.nextInt();
            in.nextLine();
            switch (work) {
                case 1: {
                    System.out.println("Input your name");
                    String name = in.nextLine();
                    System.out.println("Input file path");
                    String path = in.nextLine();
                    File file = new File(path);
                    byte[] lab = new byte[(int) file.length()];
                    FileInputStream fileInputStream;
                    try {
                        fileInputStream = new FileInputStream(file);
                        fileInputStream.read(lab);
                        fileInputStream.close();
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    System.out.println("LabWork id: " + serverPort.addWork(name, lab));
                    break;
                }
                case 2: {
                    ArrayList<Integer> ids = new ArrayList<>(serverPort.getIdsRandomWorks());
                    if (ids.isEmpty()) {
                        System.out.println("No lab work");
                        break;
                    }
                    String works = "Check these works: ";
                    for (int id : ids) {
                        works += id + " ";
                    }
                    System.out.println(works);
                    break;
                }
                case 3: {
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
                case 4: {
                    System.out.println("Input id work");
                    int id = in.nextInt();
                    System.out.println("Input name");
                    in.nextLine();
                    String name = in.nextLine();
                    System.out.println("Input mark");
                    int mark = in.nextInt();
                    serverPort.setMark(id, name, mark);
                    break;
                }
                case 5: {
                    System.out.println("Input id work");
                    int id = in.nextInt();
                    double avg = serverPort.getAverageMark(id);
                    if (avg == -1.0) {
                        System.out.println("There is no lab with this id");
                        break;
                    }
                    System.out.println("Average mark: " + avg);
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
