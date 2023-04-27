import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class HW4 {
   public static void main (String[] args) {
    ArrayList<String> list1 = new ArrayList<>();
    Scanner scan = new Scanner(System.in);      // Петрова Наталья Александровна 25 Ж

    ArrayList<String> family = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> soname = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<String> gender = new ArrayList<>();
    ArrayList<Integer> index = new ArrayList<>();

    String in = scan.nextLine();
    int id =0;

    while (!in.equals("q")){
        System.out.println(in);
        String[] st = new String[5];
        st = in.split(" ");
        list1.add(in);
        family.add(st[0]);
        name.add(st[1]);
        soname.add(st[2]);
        age.add(Integer.parseInt(st[3]));
        gender.add(st[4]);
        index.add(id);
        in = scan.nextLine();
        id ++;
    }
    System.out.println(family);
    System.out.println(name);
    System.out.println(soname);
    System.out.println(age);
    System.out.println(gender);
    System.out.println(index);

    // сортировка
    int temp = 0;
    boolean flag = true;
    while (flag) {
        for (int g = 0; g < age.size()-1; g++){
            flag = false;
            if (age.get(g) >= age.get(g+1)); {
            temp = age.get(g);
            age.set(g,age.get(g+1));
            age.set(g+1, temp);
            temp = index.get(g);
            index.set( g,index.get(g+1));
            index.set( g + 1, temp);
            flag = true;

            }
       }
    }

    System.out.println(family);
    System.out.println(name);
    System.out.println(soname);
    System.out.println(age);
    System.out.println(gender);
    System.out.println(index);

    for (int i: index){
        System.out.println(list1.get(i));
    }  
   }
}  

