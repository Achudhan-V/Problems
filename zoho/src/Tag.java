/*
import java.util.*;
public class Tag {
    public static void main(String args[]){
        String a;
     //   a="<h1>hello<h1>achudhan</h1></h1>";

     a="<h1><xml>hello<h1>welcome<p>bye</xml></h1><o>last</o><k>actual</k></h1>";
     // a="<h>hello</h><p>welcome</p><a>aaa<a><l><p>ll</p>zz<l>";
       // a="<p><h1>aaa</h1>bcd</p>";
       //a="<h1>aaaaa<p>pppp</p></h1>";
   //   a="<p><h1>aaa</h1>bcd</p>";
        // <p><h1>aaa<h1>bcd</p>

        Stack<String> s=new Stack<>();
        Stack<String> w=new Stack<>();

        String[] ans=new String[a.length()];
        boolean order[]=new boolean[a.length()];

        int k=0;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='<'){
                String elt="";
                while(i<a.length() && a.charAt(i)!='>'){
                    elt+=a.charAt(i);
                    i++;
                }
                elt+='>';


                if(elt.charAt(1)!='/') s.push(elt);

                else {
                    if (s.isEmpty()) continue;
                    String real=elt.charAt(0)+"";
                    for(int m=2;m<elt.length();m++) real+=elt.charAt(m);

                    if (s.peek().equals(real)) {
                        //  while(!w.isEmpty())
                        // System.out.print(w.pop()+" ");
                        // ans[k++]=w.pop();
                        // order[o++]=w.pop();
                       // int size = w.size();

                        for (int z = 0; z < ans.length; z++) {
                            if (ans[z] != null && !w.isEmpty() && ans[z].equals(w.peek())) {
                                order[z] = true;
                                w.pop();
                                break;
                            }
                        }

                        s.pop();
                    }
                }
            }
            else if(isAlpha(a.charAt(i))){
                String word="";
                while(i<a.length() && isAlpha(a.charAt(i))){
                    word+=a.charAt(i);
                    i++;
                }
                i--;
                ans[k++]=word;

                w.push(word);
            }
        }

        for(int i=0;i<order.length;i++){
            if(order[i] && ans[i]!=null){
                System.out.print(ans[i]+" ");
            }
        }


    }
    static boolean isAlpha(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
}*/

import java.util.*;
public class Tag {
    public static void main(String[] args){
        String a;
       a="<h1>hello<p>test<x>hii<x></p></h1><kk>mmm<kk><jj>welcome</jj>";
        ArrayList<String> s=new ArrayList<>();  //tags
        ArrayList<String> w=new ArrayList<>();  //words
        ArrayList<String> ans=new ArrayList<>();  //ans

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='<'){
                String strt="";
                while(i<a.length() && a.charAt(i)!='>'){
                    strt+=a.charAt(i);
                    i++;
                }
                strt+='>';

                if(strt.charAt(1)!='/') {
//                    if(!s.isEmpty() && s.get(s.size()-1).equals(strt)){
//                        s.remove(s.size()-1);
//                        continue;
//                    }
                    s.add(strt);
                }

                else {
                    if (s.isEmpty()) continue;

                    String end=strt.charAt(0)+"";
                    for(int m=2;m<strt.length();m++) end+=strt.charAt(m);

                   boolean remove=true;
                   while(!s.get(s.size()-1).equals(end)){
                       s.remove(s.size()-1);
                       if(!w.isEmpty() && remove) {
                           w.remove(w.size()-1);
                           remove=!remove;
                       }
                   }

                    if (s.get(s.size()-1).equals(end)) {
                        if(!w.isEmpty()) ans.add(w.get(w.size()-1));

                        s.remove(s.size()-1);

                        if(!w.isEmpty()) w.remove(w.size()-1);

                        if(s.isEmpty()){
                            for(int j=ans.size()-1;j>=0;j--){
                                System.out.print(ans.get(j)+" ");
                            }
                            ans=new ArrayList<>();
                        }
                    }
                }
            }
            else if(isAlpha(a.charAt(i))){
                String word="";
                while(i<a.length() && isAlpha(a.charAt(i))){
                    word+=a.charAt(i);
                    i++;
                }
                i--;
                w.add(word);
            }
        }
        if(!s.isEmpty()){
            for(int j=ans.size()-1;j>=0;j--){
                System.out.print(ans.get(j)+" ");
            }
        }
    }
    static boolean isAlpha(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
/*
(or)
        List<String> words = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        int openTags = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '<') {
                StringBuilder tag = new StringBuilder();
                while (i < a.length() && a.charAt(i) != '>') {
                    tag.append(a.charAt(i));
                    i++;
                }
                tag.append('>');

                if (tag.charAt(1) != '/') {
                    openTags++;
                } else {
                    openTags--;
                    if (!words.isEmpty()) answer.add(words.get(words.size() - 1));
                    words.remove(words.size() - 1);

                    if(openTags==0){
                        if (openTags == 0) {
                            for (int j = answer.size() - 1; j >= 0; j--) {
                                System.out.print(answer.get(j) + " ");
                            }
                        }
                        answer=new ArrayList<>();
                    }
                }

            } else if (isAlpha(a.charAt(i))) {
                StringBuilder word = new StringBuilder();
                while (i < a.length() && isAlpha(a.charAt(i))) {
                    word.append(a.charAt(i));
                    i++;
                }
                i--;
                words.add(word.toString());
            }
        }

        if (openTags == 0) {
            for (int j = answer.size() - 1; j >= 0; j--) {
                System.out.print(answer.get(j) + " ");
            }
        }
    }
    static boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
*/
}

/*
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    String name, gender;
    int age;
    Person father, mother;

    Person(String n, String g, int a, Person f, Person m) {
        this.name = n;
        this.gender = g;
        this.age = a;
        this.father = f;
        this.mother = m;
    }
}

public class Family {
    static ArrayList<Person> all = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5; // Assuming you want to input 5 family members

        // Input for each family member
        for (int i = 0; i < n; i++) {
            String fatherName = s.next();
            String motherName = s.next();
            String childName = s.next();
            String childGender = s.next();
            int childAge = s.nextInt();

            // Creating father and mother persons if they don't exist
            Person father = getOrCreatePerson(fatherName, "male", -1, null, null);
            Person mother = getOrCreatePerson(motherName, "female", -1, null, null);

            // Creating child person
            Person child = new Person(childName, childGender, childAge, father, mother);

            // Adding the child to the family
            all.add(child);
        }

        // Print uncle's children for a given person
        System.out.print("Enter the name of the person: ");
        String personName = s.next();
        Person person = findPersonByName(personName);
        if (person != null) {
            printUncleChildren(person);
        } else {
            System.out.println("Person not found.");
        }
    }

    // Method to get or create a person if they don't exist
    private static Person getOrCreatePerson(String name, String gender, int age, Person father, Person mother) {
        for (Person person : all) {
            if (person.name.equals(name)) {
                return person;
            }
        }
        // If person doesn't exist, create and return
        Person newPerson = new Person(name, gender, age, father, mother);
        all.add(newPerson);
        return newPerson;
    }

    // Method to find a person by name
    private static Person findPersonByName(String name) {
        for (Person person : all) {
            if (person.name.equals(name)) {
                return person;
            }
        }
        return null;
    }

    // Method to print the children of the siblings of the person's parents (uncle's children)
    private static void printUncleChildren(Person person) {
        if (person.father != null && person.father.father != null) {
            System.out.println("Uncle's children for " + person.name + ":");
            Person uncle = person.father.father;
            for (Person sibling : all) {
                if (sibling.father == uncle || sibling.mother == uncle) {
                    System.out.println("- " + sibling.name);
                }
            }
        } else {
            System.out.println(person.name + " does not have an uncle.");
        }
    }
}

 */

/*
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    String name, gender;
    int age;
    Person father, mother;

    Person(String n, String g, int a, Person f, Person m) {
        this.name = n;
        this.gender = g;
        this.age = a;
        this.father = f;
        this.mother = m;
    }
}

public class Family {
    static ArrayList<Person> all = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5; // Assuming you want to input 5 family members

        // Input for each family member
        for (int i = 0; i < n; i++) {
            String fatherName = s.next();
            String motherName = s.next();
            String childName = s.next();
            String childGender = s.next();
            int childAge = s.nextInt();

            // Creating father and mother persons if they don't exist
            Person father = getOrCreatePerson(fatherName, "male", -1, null, null);
            Person mother = getOrCreatePerson(motherName, "female", -1, null, null);

            // Creating child person
            Person child = new Person(childName, childGender, childAge, father, mother);

            // Adding the child to the family
            all.add(child);
        }

        // Print uncle's children for a given person
        System.out.print("Enter the name of the person: ");
        String personName = s.next();
        Person person = findPersonByName(personName);
        if (person != null) {
            printUncleChildren(person);
        } else {
            System.out.println("Person not found.");
        }
    }

    // Method to get or create a person if they don't exist
    private static Person getOrCreatePerson(String name, String gender, int age, Person father, Person mother) {
        for (Person person : all) {
            if (person.name.equals(name)) {
                return person;
            }
        }
        // If person doesn't exist, create and return
        Person newPerson = new Person(name, gender, age, father, mother);
        all.add(newPerson);
        return newPerson;
    }

    // Method to find a person by name
    private static Person findPersonByName(String name) {
        for (Person person : all) {
            if (person.name.equals(name)) {
                return person;
            }
        }
        return null;
    }

    // Method to print the children of the siblings of the person's parents (uncle's children)
    private static void printUncleChildren(Person person) {
        if (person.father != null && person.father.father != null) {
            System.out.println("Uncle's children for " + person.name + ":");
            Person uncle = person.father.father;
            for (Person sibling : all) {
                if (sibling.father == uncle || sibling.mother == uncle) {
                    System.out.println("- " + sibling.name);
                }
            }
        } else {
            System.out.println(person.name + " does not have an uncle.");
        }
    }
}

 */