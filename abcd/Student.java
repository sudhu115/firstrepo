public class Student 
{
    

    int test1 = 0;
    int test2 = 0;
    int test3 = 0;
    int avg2;
    int error = 0;

    public void setTestScore(int testNum, int score)
    {
        if (testNum == 1)
            test1 = score;
        else if (testNum == 2)
            test2 = score;
        else if (testNum == 3)
            test3 = score;
    }

    public int getTestScore(int testNum)
    {
        if (testNum == 1)
            return test1;
        else if (testNum == 2)
            return test2;
        else if (testNum == 3)
            return test3;
        else
             return error;
    }

    public int average(int test1, int test2, int test3)
    {
        int avg2 = ((test1 + test2 + test3)/3);
        return avg2;
    }

    private String firstName, lastName;

    private Address homeAddress, schoolAddress;

    public Student (String first, String last, Address home, Address school) 
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    public Student (String first, String last, Address home, Address school, int test11, int test22, int test33) 
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test11 = test1;
        test22 = test2;
        test33 = test3;
    }

    public String toString() 
    {
        String result;
        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Average=" + avg2 + " with Tests: " + test1 + ", " + test2 + ", " + test3;
        return result;
    }

}

class Address
{
    private String streetAddress, city, state;
    private long zipCode;

    public Address(String street, String town, String st, long zip)
    {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

    public String toString()
    {
        String result;
        result = streetAddress + "\n";
        result += city + "," + state + " " + zipCode;
        return result;
    }
}    