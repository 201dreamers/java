package lab8;

import lab6.PopMusic;
import lab7.CustomSet;

public class Main {
    public static void main(String[] args) {
        String name = null;

        try {
            new CustomSet().add(new PopMusic("Jerry", -23, "pop"));
            System.out.println("All is ok");
        } catch (WrongNameOfTrackException ex) {

        } catch (WrongLengthOfTrackException ex) {
            System.out.println(ex.getMessage());
        } catch (WrongStyleNameException ex){
            System.out.println(ex.getMessage());
        }

        try {
            new CustomSet().add(new PopMusic(name, 23, "classic"));
            System.out.println("All is ok");
        } catch (WrongNameOfTrackException ex) {

        } catch (WrongLengthOfTrackException ex) {
            System.out.println(ex.getMessage());
        } catch (WrongStyleNameException ex){
            System.out.println(ex.getMessage());
        }

        try {
            new CustomSet().add(new PopMusic("Jerry", 23, "rockyst"));
            System.out.println("All is ok");
        } catch (WrongNameOfTrackException ex) {

        } catch (WrongLengthOfTrackException ex) {
            System.out.println(ex.getMessage());

        } catch (WrongStyleNameException ex){

        }

    }

    static void myMethod() {
        throw new NullPointerException();
    }
}
