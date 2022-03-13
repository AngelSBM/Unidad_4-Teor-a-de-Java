
class Person {
 
    private int ageYears = 20;
    private long ageDays;
    private long ageageMinutes;
    private long ageSeconds;

    public void calculateAge(){
        System.out.println("AGE IN DAYS:" + ageYears * 365 );
        System.out.println("AGE IN MINUTES:" + (((ageYears * 365) * 24) * 60) );
        System.out.println("AGE IN SECONDS:" + ((((ageYears * 365) * 24) * 60) * 60) );
    }

}

class  PersonTest{
    public static void main(String[] args) {
        Person bobby = new Person();
        bobby.calculateAge();
    }
}