/*
import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String name,gender;
    private int age;
    Person father,mother;
    Person(String name,String gender,int age,Person f,Person m){
        this.name=name;
        this.gender=gender;
        this.age=age;
        father=f;
        mother=m;
    }

     void putAge(int a){
        this.age=a;
    }
    void putFather(Person f){
        this.father=f;
    }
     void putMother(Person m){
        this.mother=m;
    }

    String getName(){
        return this.name;
    }

}


public class Family {
    static ArrayList<Person> all=new ArrayList<>();

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=4;

        for(int i=1;i<=n;i++){
            String fathername=s.next();
            String mothername=s.next();
            String childname=s.next();
            String gender=s.next();
            int age=s.nextInt();

            Person father=contains(fathername,"male");
            Person mother=contains(mothername,"female");

            boolean flag=false;
            for(Person x : all){
                if(x.getName().equals(childname)){
                    x.putAge(age);
                    x.putFather(father);
                    x.putMother(mother);
                    flag=true;
                    break;
                }
            }

            if(!flag){
                Person child=new Person(childname,gender,age,father,mother);
                all.add(child);
            }

        }

        System.out.println();
       // for(Person l:all) System.out.print(l.name+" , ");
      //  System.out.println();

//        for(Person p : all){
//            if(p.father!=null)
//           System.out.println(">"+p.name+" "+p.father.name+" "+p.mother.name+" "+p.age+" "+p.gender);
//        }


        System.out.print("Enter name:");
        String inpName=s.next();
        Person person=getPerson(inpName);
        if (person!=null) {
         //   if(person.mother.father!=null)System.out.print(person.mother.father.name); //father.name);
            for(Person p : all){
                if(p.getName().equals(person.mother.father.getName())){
                   // System.out.print(p.name+" thata");
                    String thata=p.getName();

                    for(Person mama : all){
                        if(mama.father!=null && mama.father.getName().equals(thata)){
                            String uncle=mama.getName();

                            for(Person sibling : all){
                                if(sibling.father!=null && sibling.father.getName().equals(uncle)){
                                    System.out.print(sibling.getName() + " is mama pasanga of " + inpName);
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Person not found.");
        }

    }
    static Person contains(String name,String gender){
        for(Person p : all){
            if(p.getName().equals(name)){
                return p;
            }
        }
        Person p=new Person(name,gender,0,null,null);
        all.add(p);
        return p;
    }

    private static Person getPerson(String name) {
        for(Person p:all){
            if(p.getName().equals(name)){
                return p;
               }
        }
        return null;
    }
}


//raj rani arun male 15
//rahul sita rani female 35
//rahul sita mani male 30
//mani priya akash male 10

//sugan malar vimal male 10
//ramesh priya raju male 12
//ram sita malar female 15
//ram sita ramesh male 20
 */



import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String name,gender;
    private int age,id;
    Person father,mother;
    Person(String name,String gender,int age,Person f,Person m,int id){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.father=f;
        this.mother=m;
        this.id=id;
    }

    void putAge(int a){
        this.age=a;
    }
    void putFather(Person f){
        this.father=f;
    }
    void putMother(Person m){
        this.mother=m;
    }

    String getName(){
        return this.name;
    }
    int getId(){
        return id;
    }

}


public class Family {
    static ArrayList<Person> all=new ArrayList<>();

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=4;

        for(int i=1;i<=n;i++){
            String fathername=s.next();
            int fid=s.nextInt();
            String mothername=s.next();
            int mid=s.nextInt();
            String childname=s.next();
            int cid=s.nextInt();
            String gender=s.next();
            int age=s.nextInt();

            Person father=contains(fathername,"male",fid);
            Person mother=contains(mothername,"female",mid);

            boolean flag=false;
            for(Person x : all){
                if(x.getName().equals(childname) && x.getId()!=cid) break;
                if(x.getName().equals(childname)){
                    x.putAge(age);
                    x.putFather(father);
                    x.putMother(mother);
                    flag=true;
                    break;
                }
            }

            if(!flag){
                Person child=new Person(childname,gender,age,father,mother,cid);
                all.add(child);
            }

        }

        System.out.println();
         for(Person l:all) System.out.print(l.getName()+" , ");
         System.out.println();

        for(Person p : all){
            if(p.father!=null)
           System.out.println(">"+p.getName()+" id: "+p.getId()+" "+p.father.getName()+" "+p.mother.getName()+" ");
        }


        System.out.print("Enter name:");
        String inpName=s.next();
        int inpid=s.nextInt();
        Person person=getPerson(inpName,inpid);
        if (person!=null) {
            //   if(person.mother.father!=null)System.out.print(person.mother.father.name); //father.name);
          //  System.out.print(person.getId()+".");
            for(Person p : all){
                if(person.mother.father!=null && p.getName().equals(person.mother.father.getName())){
                    System.out.print(p.getName()+" thata");
                    String thata=p.getName();

                    for(Person mama : all){
                        if(mama.father!=null && mama.father.getName().equals(thata)){
                            String uncle=mama.getName();

                            for(Person sibling : all){
                                if(sibling.father!=null && sibling.father.getName().equals(uncle)){
                                    System.out.print(sibling.getName() + " is mama pasanga of " + inpName);
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Person not found.");
        }

    }
    static Person contains(String name,String gender,int id){
        for(Person p : all){
            if(p.getName().equals(name)){
                return p;
            }
        }
        Person p=new Person(name,gender,0,null,null,id);
        all.add(p);
        return p;
    }

    private static Person getPerson(String name,int id) {
        for(Person p:all){
            if(p.getName().equals(name) && p.getId()==id){
                return p;
            }
        }
        return null;
    }
}




//raj 1 rani 2 arun 3 male 15
//rahul 4 sita 5 rani 6 female 35
//rahul 7 sita 8 mani 9 male 30
//mani 10 priya 11 akash 12 male 10
//
//sugan malar vimal male 10
//ramesh priya raju male 12
//ram sita malar female 15
//ram sita ramesh male 20


