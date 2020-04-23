package katas.fizzBuzz;

public class FizzBuzz {

    public String getFizzBuzz(int value){

       switch (getMultiplier(value)){
           case 3:{
               return "Fizz";
           }
           case 5:{
               return "Buzz";
           }
           case 15:{
               return "FizzBuzz";
           }
           default: return String.valueOf(value);
       }
    }

    private int getMultiplier(int value) {

        if(value % 3 == 0 && value % 5 == 0){
            return 15;
        } else if (value % 3 == 0){
            return 3;
        } else if (value % 5 == 0) {
            return 5;
        }
        return  value;
    }

}
