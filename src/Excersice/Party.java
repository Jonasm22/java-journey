package Excersice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Party {

    private List<Gast>gastList = new ArrayList<>();



    public void inviteGuest(Gast... people){
       for(Gast gast : people){
           if(!alreadyInvited(gast)){
               gastList.add(gast);
           }
       }

    }

    public boolean alreadyInvited(Gast gast){
        for(Gast g  :  gastList){
            if(g.getEmail().equalsIgnoreCase(gast.getEmail())){
                return true ;
            }
        }
        return false;
    }



    public List<Gast> getGastList() {
        return Collections.unmodifiableList(gastList);
    }


}


class register{

    public static void tryRegister(Party party , Gast... gasts){

        for (Gast gast1 :gasts){
            if(party.alreadyInvited(gast1)){
                System.out.println(gast1.getEmail() + "Error-Email already exist");

            }else{
                party.inviteGuest(gast1);
                System.out.println(gast1.getEmail() + " has been added :D .");
            }
        }


    }


}