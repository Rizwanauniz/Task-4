class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(101, "Alice", 20);
            System.out.println("Voter created: " + voter1.getName() + ", Age: " + voter1.getAge());

            // This will throw an exception
            Voter voter2 = new Voter(102, "Bob", 16);
        } catch (InvalidAgeForVoterException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}