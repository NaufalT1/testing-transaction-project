package main;

import model.person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static List<String> history = new ArrayList<>();
    public static void main(String[] args) {
        String[] listName = {"Robert","Downey","Chris","Tony"};


        person [] listPerson = new person[listName.length];

        for (int i = 0; i < listName.length; i++) {
            listPerson[i] = new person(listName[i],i,50);
        }

        getAllUserName(listPerson);

        transaction(listPerson[0],listPerson[1],10);
        transaction(listPerson[1],listPerson[2],10);

        readHistory();

//        System.out.println(main.main.history);
//        System.out.println(main.main.history.get(0));


    }
    public static void readHistory(){
        for (String item:main.history
        ) {
            System.out.println(item);
        }
    }
    public static void getAllUserName(person[] person){
        for (person human: person) {
            System.out.println(human.getName());
        }
    }
    public static void transaction(person sender, person receiver, int amount){
        // check balance
        int senderPoint = sender.getPoint();
        if (senderPoint < amount){
            System.out.println("Insufficient Sender's Point");
            return;
        }
        // reduce sender balance
        sender.setPoint(senderPoint-amount);

        // increase receiver balance
        int receiverPoint = receiver.getPoint();
        receiver.setPoint(receiverPoint+amount);

        // Record to transaction History
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);

        // Append list
        main.history.add(strDate+", "+sender.getName()+", "+String.valueOf(amount)+", "+receiver.getName());

    }
}