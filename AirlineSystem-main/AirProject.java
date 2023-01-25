package airlineSystem;

 import java.util.Scanner;

 class AirProject {                               //use any name for class
public void harshitRagini() {        //main funct . just for running purpose
            //scanner

    System.out.println("Our services are only accross these cities: ");         
    System.out.println(" 1-DELHI \n 2-MUMBAI \n 3-LUCKNOW");

    int x=1;
    while(x==1){
        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);

    System.out.println("Enter the Arrival Location: ");                 //user input
    String arr = sc.next();
    
    System.out.println("Enter the Departure Location: ");           //user input
    String dep = sc.next();


    if(arr.equals("DELHI") && dep.equals("MUMBAI")){                        //if for all the lists.
        System.out.println("Flights from " +arr+ " to " +dep+ "are: ");
        System.out.println("1:- DM-4648 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("2:- DM-4024 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("3:- DM-4036 \n  \t = Economy Class\n \t = Business Class");
        
        System.out.println("Which flight you want to choose : ");           //inserting switch for booking and price showing.
        int dm = sc.nextInt();                                             //
        switch(dm) {
                        case 1:
                        int rate =2000; 
                        System.out.println("Flight Timing is \n 5:00-7:30 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int dm48 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dm48class = sc.nextInt();
                        if(dm48class==2){
                            rate  = 2500;
                        }
                        if (dm48==1){
                            System.out.println("How many tickets you want to Book:");
                            int dm48book = sc.nextInt();  
                            int dm48rate = dm48book*rate;  //COST OF DM48 IS 2000    //NUMBER OF BOOKED TICKETS FOR DM48.
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +dm48book+ " TICKETS ");
                            System.out.println(  "Your total fare is : " +dm48rate+ "  Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                        case 2 : 
                        int rate2= 1800;
                        System.out.println("Flight Timing is \n 10:00-11:30 AM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int dm24 = sc.nextInt(); //dm is routecode and 24 is the digit code
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dm24class = sc.nextInt();
                        if(dm24class==2){
                            rate2  = 2300;
                        }
                        if (dm24==1){
                            System.out.println("How many tickets you want to Book:");
                            int dm24book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR DM24.
                            int dm24rate = dm24book*rate2;            //PRICE OF DM24 is 2500              
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +dm24book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +dm24rate+ "  Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;


                        case 3 : 
                        int rate3 = 2200;
                        System.out.println("Flight Timing is \n 9:30-11:00 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int dm36 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dm36class = sc.nextInt();
                        if(dm36class==2){
                            rate3  = 2700;
                        }
                        if (dm36==1){
                            System.out.println("How many tickets you want to Book:");
                            int dm36book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR DM24.
                            int dm36rate = dm36book*rate3;             //COST OF DM36 IS 3000            
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +dm36book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +dm36rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                  }
    }
     else if(arr.equals("DELHI") && dep.equals("LUCKNOW")){
        System.out.println("Flights from " +arr+ " to " +dep+ "are: ");
        System.out.println("1:- DL-4381 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("2:- DL-4796 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("3:- DL-4177 \n  \t = Economy Class\n \t = Business Class");
        System.out.println("Which flight you want to choose : ");           //inserting switch for booking and price showing.
        int dl = sc.nextInt();                                             //
        switch(dl) {
                        case 1: 
                        int rate4 = 3300;
                        System.out.println("Flight Timing is \n 4:00-6:30 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int dl81 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dl81class = sc.nextInt();
                        if(dl81class==2){
                            rate4  = 3500;
                        }
                        if (dl81==1){
                            System.out.println("How many tickets you want to Book:");
                            int dl81book = sc.nextInt();  
                            int dl81rate = dl81book*rate4;  //COST OF DL81 IS 4000    //NUMBER OF BOOKED TICKETS FOR DL81.
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +dl81book+ " TICKETS ");
                            System.out.println(  "Your total fare is : " +dl81rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                        case 2 : 
                        int rate5 =2950;
                        System.out.println("Flight Timing is \n 8:00-9:30 AM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int dl96 = sc.nextInt(); //dl is routecode and 96 is the digit code
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dl96class = sc.nextInt();
                        if(dl96class==2){
                            rate5  = 3400;
                        }
                        if (dl96==1){
                            System.out.println("How many tickets you want to Book:");
                            int dl96book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR DL96.
                            int dl96rate = dl96book*rate5;            //PRICE OF DL96 is 2200              
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +dl96book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +dl96rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;


                        case 3 : 
                        int rate6 = 3250;
                        System.out.println("Flight Timing is \n 9:30-11:00 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int dl77 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dl77class = sc.nextInt();
                        if(dl77class==2){
                            rate6  = 3400;
                        }
                        if (dl77==1){
                            System.out.println("How many tickets you want to Book:");
                            int dl77book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR DL77.
                            int dl77rate = dl77book*rate6;             //COST OF DL77 IS 3500            
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +dl77book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +dl77rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                  }
    }


     else if(arr.equals("LUCKNOW") && dep.equals("MUMBAI")){
        System.out.println("Flights from " +arr+ " to " +dep+ "are: ");
        System.out.println("1:- LM-3280 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("2:- LM-3476 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("3:- LM-3098 \n \t = Economy Class\n \t = Business Class");
        int lm = sc.nextInt();                                             //
        switch(lm) {
                        case 1: 
                        int rate7 = 2650;
                        System.out.println("Flight Timing is \n 3:00-5:30 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int lm80 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int lm80class = sc.nextInt();
                        if(lm80class==2){
                            rate7  = 2900;
                        }
                        if (lm80==1){
                            System.out.println("How many tickets you want to Book:");
                            int lm80book = sc.nextInt();  
                            int lm80rate = lm80book*rate7;  //COST OF LM80 IS 2800    //NUMBER OF BOOKED TICKETS FOR DL81.
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +lm80book+ " TICKETS ");
                            System.out.println(  "Your total fare is : " +lm80rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                        case 2 : 
                        int rate8 = 2400;
                        System.out.println("Flight Timing is \n 6:00-8:30 AM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int lm76 = sc.nextInt(); //dl is routecode and 96 is the digit code
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dm48class = sc.nextInt();
                        if(dm48class==2){
                            rate8  = 2700;
                        }
                        if (lm76==1){
                            System.out.println("How many tickets you want to Book:");
                            int lm76book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR LM76.
                            int lm76rate = lm76book*rate8;            //PRICE OF LM76 is 2700              
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +lm76book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +lm76rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;


                        case 3 : 
                        int rate9 = 3200;
                        System.out.println("Flight Timing is \n 9:30-11:00 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int lm98 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int lm98class = sc.nextInt();
                        if(lm98class==2){
                            rate9  = 3500;
                        }
                        if (lm98==1){
                            System.out.println("How many tickets you want to Book:");
                            int lm98book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR LM98.
                            int lm98rate = lm98book*rate9;             //COST OF LM98 IS 3400            
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +lm98book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +lm98rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                  }

    }

     else if(arr.equals("LUCKNOW")  && dep.equals("DELHI")){
        System.out.println("Flights from " +arr+ " to " +dep+ "are: ");
        System.out.println("1:- LD-3975 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("2:- LD-3769 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("3:- LD-3133 \n \t = Economy Class\n \t = Business Class");
        System.out.println("Which flight you want to choose : ");           //inserting switch for booking and price showing.
        int ld = sc.nextInt();                                             //
        switch(ld) {
                        case 1: 
                        int rate10 = 2300;
                        System.out.println("Flight Timing is \n 2:00-4:30 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int ld75= sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int ld75class = sc.nextInt();
                        if(ld75class==2){
                            rate10  = 2500;
                        }
                        if (ld75==1){
                            System.out.println("How many tickets you want to Book:");
                            int ld75book = sc.nextInt();  
                            int ld75rate = ld75book*rate10;  //COST OF LD75 IS 2300    //NUMBER OF BOOKED TICKETS FOR LD75.
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +ld75book+ " TICKETS ");
                            System.out.println(  "Your total fare is : " +ld75rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                        case 2 : 
                        int rate11 = 2000;
                        System.out.println("Flight Timing is \n 8:00-9:30 AM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int ld69 = sc.nextInt(); //dl is routecode and 96 is the digit code
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int ld69class = sc.nextInt();
                        if(ld69class==2){
                            rate11  = 2900;
                        }
                        if (ld69==1){
                            System.out.println("How many tickets you want to Book:");
                            int ld69book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR LD69.
                            int ld69rate = ld69book*rate11;            //PRICE OF LD69 is 2100              
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +ld69book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +ld69rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;


                        case 3 : 
                        int rate12 = 2700;
                        System.out.println("Flight Timing is \n 8:30-10:30 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int ld33 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int ld33class = sc.nextInt();
                        if(ld33class==2){
                            rate12  = 3000;
                        }
                        if (ld33==1){
                            System.out.println("How many tickets you want to Book:");
                            int ld33book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR LD33
                            int ld33rate = ld33book*rate12;             //COST OF LD33 IS 2500            
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +ld33book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +ld33rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                  }
    
    }


     else if(arr.equals("MUMBAI") && dep.equals("DELHI")){
        System.out.println("Flights from " +arr+ " to " +dep+ "are: ");
        System.out.println("1:- MD-5376 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("2:- MD-5798 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("3:- MD-5015 \n \t = Economy Class\n \t = Business Class");
        System.out.println("Which flight you want to choose : ");           //inserting switch for booking and price showing.
        int md = sc.nextInt();                                             //
        switch(md) {
                        case 1: 
                        int rate13 = 2000;
                        System.out.println("Flight Timing is \n 6:30-7:30 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int md76 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int dm48class = sc.nextInt();
                        if(dm48class==2){
                            rate13  = 2700;
                        }
                        if (md76==1){
                            System.out.println("How many tickets you want to Book:");
                            int md76book = sc.nextInt();  
                            int md76rate = md76book*rate13;  //COST OF MD76 IS 1000    //NUMBER OF BOOKED TbICKETS FOR MD76.
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +md76book+ " TICKETS ");
                            System.out.println(  "Your total fare is : " +md76rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                        case 2 : 
                        int rate14 = 2800;
                        System.out.println("Flight Timing is \n 9:30-11:30 AM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int md98= sc.nextInt(); //dm is routecode and 24 is the digit code
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int md98class = sc.nextInt();
                        if(md98class==2){
                            rate14  = 2500;
                        }
                        if (md98==1){
                            System.out.println("How many tickets you want to Book:");
                            int md98book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR DM24.
                            int md98rate = md98book*rate14;            //PRICE OF MD98 is 2900              
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +md98book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +md98rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;


                        case 3 : 
                        int rate15 = 3250;
                        System.out.println("Flight Timing is \n 9:30-11:00 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int md15 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int md15class = sc.nextInt();
                        if(md15class==2){
                            rate15  = 3780;
                        }
                        if (md15==1){
                            System.out.println("How many tickets you want to Book:");
                            int md15book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR MD15.
                            int md15rate = md15book*rate15;             //COST OF MD15 IS 3100            
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +md15book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +md15rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                  }
    
    }
     else if(arr.equals("MUMBAI") && dep.equals("LUCKNOW")){
        System.out.println("Flights from " +arr+ " to " +dep+ "are: ");
        System.out.println("1:- ML-5498 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("2:- ML-5262 \n  \t = Economy Class \n \t = Business Class");
        System.out.println("3:- ML-5016 \n \t = Economy Class\n \t = Business Class");
        System.out.println("Which flight you want to choose : ");           //inserting switch for booking and price showing.
        int ml = sc.nextInt();                                             //
        switch(ml) {
                        case 1:
                        int rate16 = 2200; 
                        System.out.println("Flight Timing is \n 6:30-7:30 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int ml98 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int ml98class = sc.nextInt();
                        if(ml98class==2){
                            rate16  = 2500;
                        }
                        if (ml98==1){
                            System.out.println("How many tickets you want to Book:");
                            int ml98book = sc.nextInt();  
                            int ml98rate = ml98book*rate16;  //COST OF ML98 IS 1100    //NUMBER OF BOOKED TbICKETS FOR MD76.
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +ml98book+ " TICKETS ");
                            System.out.println(  "Your total fare is : " +ml98rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                        case 2 : 
                        int rate17 = 1850;
                        System.out.println("Flight Timing is \n 9:30-11:30 AM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int mL62= sc.nextInt(); //dm is routecode and 24 is the digit code
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int ml62class = sc.nextInt();
                        if(ml62class==2){
                            rate17  = 2500;
                        }
                        if (mL62==1){
                            System.out.println("How many tickets you want to Book:");
                            int mL62book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR DM24.
                            int mL62rate = mL62book*rate17;            //PRICE OF MD98 is 1900              
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +mL62book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +mL62rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;


                        case 3 : 
                        int rate18 = 1900;
                        System.out.println("Flight Timing is \n 8:30-10:00 PM \n Press 1 to Book Tickets \n Press 0 to last MENU.");
                        int ml16 = sc.nextInt();
                        System.out.println("Press \n 1:-ECONOMY \n 2:-BUSINESS");
                        int ml16class = sc.nextInt();
                        if(ml16class==2){
                            rate18  = 2500;
                        }
                        if (ml16==1){
                            System.out.println("How many tickets you want to Book:");
                            int ml16book = sc.nextInt();             //NUMBER OF BOOKED TICKETS FOR ML16.
                            int ml16rate = ml16book*rate18;             //COST OF ML16 IS 1800            
                            System.out.println("CONGRATULATIONS : \n YOU HAVE SUCCESFULLY BOOKED " +ml16book+ " TICKETS. ");
                            System.out.println(  "Your total fare is : " +ml16rate+ " Rupees Only.\n PLEASE BE ON TIME.");
                        }
                        break;

                  }
    
    }
     else {                                                                         //else when the given input doesnt match any criteria.
        System.out.println("No Services Available at your entered Location.");
     }
     
     System.out.println("Press:- \n 0 to EXIT TO THE MAIN MENU. \n 1 to CONTINUE.");    ///input taken from user to close loop.
     // HERE ZERO WILL FINALLY CLOSE THE FUNTION
     int run = sc.nextInt();
    
     if(run==0){            //CONDITION TO close loop.
         x++;
     }
    } //close of while loop.
  }
}