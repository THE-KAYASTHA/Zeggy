public class Restaurants {
          static int totalPrice;

            String bill="";





     static class Burger extends Restaurants {


         public Burger(int quantity, boolean veg) {
             if(veg==true){
                 super.totalPrice+=100*quantity;
                 super.bill+=quantity +" Veg Burger -100 rs each Total-"+100*quantity+"\n";
             }
             else{
                 super.totalPrice+=150*quantity;
                 super.bill+=quantity +" Non-Veg Burger -150 rs each Total- "+150*quantity+"\n";
             }
         }


         public void  addExtraCheese(){
             super.totalPrice+=30;
             super.bill+= "ExtraCheese -30 rs"+"\n";


         }
         public void menu(){
             System.out.println("Veg Burger - 100");
             System.out.println("Non-Veg Burger - 150");
             System.out.println("Extra Cheese - 30");





         }


     }
   static class Pizza extends Restaurants {





        public   Pizza(int quantity,boolean veg){
            if(veg==true){
                super.totalPrice+=150*quantity;
                super.bill+=quantity +" Veg Pizza -150 rs each Total-"+150*quantity+"\n";
            }
            else{
                super.totalPrice+=200*quantity;
                super.bill+=quantity +" Non-Veg Pizza -150 rs each Total-"+200*quantity+"\n";
            }

        }
        public void  addExtraCheese(){
            super.totalPrice+=30;
            super.bill+= "ExtraCheese -30 rs"+"\n";


        }
        public void addToppings(){
            super.totalPrice+=40;
            super.bill+=" ExtraToppings - 40 rs"+"\n";
        }
        public void menu(){
            System.out.println("Veg pizza - 150");
            System.out.println("Non-Veg pizza - 200");
            System.out.println("Extra Cheese - 30");
            System.out.println("ExtraToppings -40");




        }


    }

   static class CholeBhature extends Restaurants {

        public  CholeBhature(int plate,boolean paneer){
             if(paneer==true){
                 super.totalPrice+=120*plate;
                 super.bill+=plate +" plate Paneer chole bhature - 120 rs each "+120*plate+"\n";
             }
             else{
                 super.totalPrice+=80*plate;
                 super.bill+=plate +" plate chole bhature - 80 rs each "+80*plate+"\n";

             }
        }
        public void raita(){
            super.totalPrice+=10;
            super.bill+= "Raita - 10 rs "+"\n";
        }




        public void menu(){
            System.out.println("Chole bhature  - 80");
            System.out.println("Paneer wale chole bhature - 120");
            System.out.println("Raita - 10");




        }


    }
    static class Biryani extends Restaurants {

        public   Biryani(int plate,boolean veg){
            if(veg==false){
                super.totalPrice+=120*plate;
                super.bill+=plate +" Chicken biryani - 120 rs each "+120*plate+"\n";
            }
            else{
                super.totalPrice+=80*plate;
                super.bill+=plate +" Veg-biryani - 80 rs each "+120*plate+"\n";

            }
        }





        public void menu(){
            System.out.println("Veg-biryani  - 80");
            System.out.println("Chicken biryani - 120");





        }


    }
    public void getBill(String dateandtime,int deliveryCharges){
         System.out.println(this.bill);
         System.out.println("Delivery charges is "+deliveryCharges);
        int newPrice=this.totalPrice+deliveryCharges;
         System.out.println("Total price is "+ newPrice);

         System.out.println("Your order has been place at "+dateandtime);
         System.out.println("Your order will be delivered within 45 minutes");
         System.out.println("Thanks for ordering with us");

    }
}
