package Week6Problem.assignment_problems;

public class ExaHallTicket {
    static class HallTicket{
        String studentName;
        int seatNumber;

        HallTicket(String studentName, int seatNumber){
            this.studentName = studentName;
            this.seatNumber = seatNumber;
        }
    }
    public static void main(String[] args) {
      HallTicket ticket1 = new HallTicket("priya",0);
      HallTicket copy = ticket1;
      copy.seatNumber = 45;
      HallTicket ticket2 = new HallTicket("priya",45);
        System.out.println("Priya's seatNumber (via first variable): " + ticket1.seatNumber);
        System.out.println("copy == Priya: " + (copy == ticket1));
        System.out.println("ticket2 == ticket1: " + (ticket2 == ticket1));

    }
    
}
