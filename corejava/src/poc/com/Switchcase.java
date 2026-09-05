package poc.com;

import java.util.Scanner;

public class Switchcase {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        double vegPrice = 0;
	        double nonVegPrice = 0;
	        double total;
	        double gst;
	        double deliveryCharge;
	        double discount = 0;

	        String invoice = "";

	        System.out.println("=========================================");
	        System.out.println(" Welcome to Mehfil Online Food Delivery");
	        System.out.println("=========================================");

	        System.out.print("Enter your name : ");
	        String name = sc.nextLine();

	        int mainChoice;

	        do {

	            System.out.println("\n----------- MAIN MENU -----------");
	            System.out.println("1. Veg");
	            System.out.println("2. Non Veg");
	            System.out.println("3. View Bill");
	            System.out.println("4. Checkout");
	            System.out.print("Enter your choice : ");

	            mainChoice = sc.nextInt();

	            switch (mainChoice) {

	                // VEG
	                case 1 -> {

	                    int more;

	                    do {

	                        System.out.println("\n------------- VEG MENU -------------");
	                        System.out.println("pb  - Paneer Biryani       ₹220");
	                        System.out.println("vp  - Veg Pizza            ₹300");
	                        System.out.println("pm  - Paneer Momos         ₹170");
	                        System.out.println("mc  - Mushroom Curry       ₹240");
	                        System.out.println("cc  - Chilli Paneer        ₹210");
	                        System.out.println("vn  - Veg Noodles          ₹160");
	                        System.out.println("vwp - Veg White Pasta      ₹250");

	                        System.out.print("Enter item code : ");
	                        String item = sc.next();

	                        System.out.print("Enter quantity : ");
	                        int qty = sc.nextInt();

	                        switch (item) {

	                            case "pb" -> {
	                                double price = 220;
	                                double amount = price * qty;

	                                vegPrice += amount;

	                                invoice += "Paneer Biryani   " + qty
	                                        + " x ₹220 = ₹" + amount + "\n";
	                            }

	                            case "vp" -> {
	                                double price = 300;
	                                double amount = price * qty;

	                                vegPrice += amount;

	                                invoice += "Veg Pizza        " + qty
	                                        + " x ₹300 = ₹" + amount + "\n";
	                            }

	                            case "pm" -> {
	                                double price = 170;
	                                double amount = price * qty;

	                                vegPrice += amount;

	                                invoice += "Paneer Momos     " + qty
	                                        + " x ₹170 = ₹" + amount + "\n";
	                            }

	                            case "mc" -> {
	                                double price = 240;
	                                double amount = price * qty;

	                                vegPrice += amount;

	                                invoice += "Mushroom Curry   " + qty
	                                        + " x ₹240 = ₹" + amount + "\n";
	                            }

	                            case "cc" -> {
	                                double price = 210;
	                                double amount = price * qty;

	                                vegPrice += amount;

	                                invoice += "Chilli Paneer    " + qty
	                                        + " x ₹210 = ₹" + amount + "\n";
	                            }

	                            case "vn" -> {
	                                double price = 160;
	                                double amount = price * qty;

	                                vegPrice += amount;

	                                invoice += "Veg Noodles      " + qty
	                                        + " x ₹160 = ₹" + amount + "\n";
	                            }

	                            case "vwp" -> {
	                                double price = 250;
	                                double amount = price * qty;

	                                vegPrice += amount;

	                                invoice += "Veg White Pasta  " + qty
	                                        + " x ₹250 = ₹" + amount + "\n";
	                            }

	                            default -> {
	                                System.out.println("Invalid item code!");
	                            }
	                        }

	                        System.out.println("\nDo you want to order more Veg items?");
	                        System.out.println("1. Yes");
	                        System.out.println("2. No");
	                        System.out.print("Enter choice : ");

	                        more = sc.nextInt();

	                    } while (more == 1);
	                }

	                // NON VEG
	                case 2 -> {

	                    int more;

	                    do {

	                        System.out.println("\n----------- NON VEG MENU -----------");
	                        System.out.println("cb - Chicken Biryani       ₹280");
	                        System.out.println("cf - Chicken Fried Rice    ₹240");
	                        System.out.println("cp - Chicken Pizza         ₹420");
	                        System.out.println("mb - Mutton Biryani        ₹350");
	                        System.out.println("fg - Fish Grill             ₹390");
	                        System.out.println("tc - Tandoori Chicken      ₹450");
	                        System.out.println("pr - Prawns Fry             ₹410");
	                        System.out.println("eb - Egg Biryani            ₹200");

	                        System.out.print("Enter item code : ");
	                        String item = sc.next();

	                        System.out.print("Enter quantity : ");
	                        int qty = sc.nextInt();

	                        switch (item) {

	                            case "cb" -> {
	                                double price = 280;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Chicken Biryani " + qty
	                                        + " x ₹280 = ₹" + amount + "\n";
	                            }

	                            case "cf" -> {
	                                double price = 240;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Chicken Fried Rice " + qty
	                                        + " x ₹240 = ₹" + amount + "\n";
	                            }

	                            case "cp" -> {
	                                double price = 420;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Chicken Pizza    " + qty
	                                        + " x ₹420 = ₹" + amount + "\n";
	                            }

	                            case "mb" -> {
	                                double price = 350;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Mutton Biryani   " + qty
	                                        + " x ₹350 = ₹" + amount + "\n";
	                            }

	                            case "fg" -> {
	                                double price = 390;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Fish Grill        " + qty
	                                        + " x ₹390 = ₹" + amount + "\n";
	                            }

	                            case "tc" -> {
	                                double price = 450;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Tandoori Chicken " + qty
	                                        + " x ₹450 = ₹" + amount + "\n";
	                            }

	                            case "pr" -> {
	                                double price = 410;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Prawns Fry        " + qty
	                                        + " x ₹410 = ₹" + amount + "\n";
	                            }

	                            case "eb" -> {
	                                double price = 200;
	                                double amount = price * qty;

	                                nonVegPrice += amount;

	                                invoice += "Egg Biryani       " + qty
	                                        + " x ₹200 = ₹" + amount + "\n";
	                            }

	                            default -> {
	                                System.out.println("Invalid item code!");
	                            }
	                        }

	                        System.out.println("\nDo you want to order more Non Veg items?");
	                        System.out.println("1. Yes");
	                        System.out.println("2. No");
	                        System.out.print("Enter choice : ");

	                        more = sc.nextInt();

	                    } while (more == 1);
	                }

	                case 3 -> {

	                    total = vegPrice + nonVegPrice;

	                    System.out.println("\n========== CURRENT BILL ==========");
	                    System.out.println(invoice);
	                    System.out.println("----------------------------------");
	                    System.out.println("Veg Total     : ₹" + vegPrice);
	                    System.out.println("Non Veg Total : ₹" + nonVegPrice);
	                    System.out.println("Total         : ₹" + total);
	                    System.out.println("==================================");
	                }

	                case 4 -> {

	                    total = vegPrice + nonVegPrice;

	                    if (total == 0) {

	                        System.out.println("\nYour cart is empty!");

	                    } else {

	                        gst = total * 0.05;

	                        if (total >= 500) {
	                            deliveryCharge = 0;
	                        } else {
	                            deliveryCharge = 40;
	                        }

	                        System.out.print("\nDo you have a coupon? (yes/no) : ");
	                        String coupon = sc.next();

	                        if (coupon.equalsIgnoreCase("yes")) {

	                            System.out.print("Enter coupon code : ");
	                            String code = sc.next();

	                            if (code.equalsIgnoreCase("SAVE50")) {

	                                discount = 50;
	                                System.out.println("₹50 discount applied!");

	                            } else {

	                                System.out.println("Invalid coupon code!");
	                            }
	                        }

	                        double finalAmount =
	                                total + gst + deliveryCharge - discount;


	                        System.out.println("\n\n==========================================");
	                        System.out.println("              MEHFIL INVOICE");
	                        System.out.println("==========================================");

	                        System.out.println("Customer Name : " + name);

	                        System.out.println("------------------------------------------");

	                        System.out.print(invoice);

	                        System.out.println("------------------------------------------");

	                        System.out.println("Veg Total       : ₹" + vegPrice);
	                        System.out.println("Non Veg Total   : ₹" + nonVegPrice);
	                        System.out.println("Subtotal        : ₹" + total);
	                        System.out.println("GST (5%)        : ₹" + gst);
	                        System.out.println("Delivery Charge : ₹" + deliveryCharge);
	                        System.out.println("Discount        : ₹" + discount);

	                        System.out.println("------------------------------------------");

	                        System.out.println("Final Amount    : ₹" + finalAmount);

	                        System.out.println("==========================================");
	                        System.out.println("       Thank you for ordering!");
	                        System.out.println("             Visit Again!");
	                        System.out.println("==========================================");

	                    }
	                }

	                default -> {

	                    if (mainChoice != 1 &&
	                        mainChoice != 2 &&
	                        mainChoice != 3 &&
	                        mainChoice != 4) {

	                        System.out.println("Invalid choice!");
	                    }
	                }
	            }

	        } while (mainChoice != 4);

	        sc.close();
	    }
	}}