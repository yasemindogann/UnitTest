package day3.mocking.sample1;

public class UserManager {

    public String getUserName(int userId){

        if(userId == 1){
            return "Ali Can";
        }else if(userId == 2){
            return "Veli Han";
        }else{
            return "Unknown";
        }

    }


}
