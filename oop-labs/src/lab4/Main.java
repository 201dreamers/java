package lab4;

import java.util.Random;
import java.util.Comparator;
import java.util.Arrays;


class SportEquipment{
  private String gameName;
  private int count;
  private int price;
  private String title;
  private String color;

  SportEquipment(int count, int price, String title, String color, String gameName){
    this.gameName = gameName;
    this.count = count;
    this.price = price;
    this.title = title;
    this.color = color;
  }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//SportEquipment

public class Main{
  public static void main(String[] args){
    String [] titleArray = {"ball", "bite", "hoop", "racuet", "net"};
    String [] colorArray = {"blue", "red", "green", "yellow", "black"};
    String [] gameNameArray = {"football", "basketball", "tennis", "baseball", "american football"};
    SportEquipment [] array = new SportEquipment[5];
    Random rand = new Random();
    
    for (int i = 0; i < array.length; i++){
      array[i] = new SportEquipment(rand.nextInt(49)+1, rand.nextInt(49)+1, titleArray[rand.nextInt(titleArray.length)], colorArray[rand.nextInt(colorArray.length)], gameNameArray[rand.nextInt(gameNameArray.length)]);
    }//for

    Arrays.sort(array, Comparator.comparing(SportEquipment::getPrice));
	
	for (int i = 0; i < array.length; i++){
      System.out.println("##########\nGame name - " + array[i].getGameName());
      System.out.println("Color - " + array[i].getColor());
      System.out.println("Tile - " + array[i].getTitle());
      System.out.println("Count - " + array[i].getCount());
      System.out.println("Price - " + array[i].getPrice() + "\n");
    }
	System.out.println("REVERSE\n");

	Arrays.sort(array, Comparator.comparing(SportEquipment::getGameName).reversed());

    for (int i = 0; i < array.length; i++){
      System.out.println("##########\nGame name - " + array[i].getGameName());
      System.out.println("Color - " + array[i].getColor());
      System.out.println("Tile - " + array[i].getTitle());
      System.out.println("Count - " + array[i].getCount());
      System.out.println("Price - " + array[i].getPrice() + "\n");
    }
  }//main()
}//Main class

