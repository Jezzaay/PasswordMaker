package com.jeremy.passwordmaker;



/**
 * Created by Jeremy on 20/06/2017.
 */

public class RngPass {

 // Random Pass Gen

    final String[] letters = {"a","b","c","d","e","f","g","h","i","j","l","m","n","p","y","o","u","q","w","z","x",
            "A","B","C","D","E","F","G","H","I","J","L","M","N","P","O","U","Y","Q","W","Z","X"
            ,"ö","æ","Ö","ô","Ä","ÿ","ù","Ü","Ø","ì","î","ï","á"};

    final String[] symbols = {"'",";","'","!","£","$","%","^","&","*","(",")","-","]","[",
                "}","{","#","~","@","/",":","?",".",",",">","<","|","`","¬","¦","-", "+","€"};

    final String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};

    private String pass;
    private String newString;

    public  String newPass(String password){
    pass = "";
        newString = "";

        for (int x = 0; x< 14; x++){


            int random  = (int)(Math.random() * 49 );
            int randomSym = (int)(Math.random() * 30);
            int randomNum = (int)(Math.random() * 10);


                int rand = (int)(Math.random() * 6);

                if (rand == 0)
                {
                    newString += letters[random];
                }
                else if (rand == 1){
                    newString += numbers[randomNum];

                }
                else if(rand == 5)
                {
                    newString += letters[random];

                }
                else{
                    newString += symbols[randomSym];


            }

          //  pass += letters[random] + symbols[randomSym] + numbers[randomNum];


        }


        return password = newString;
    }

}
