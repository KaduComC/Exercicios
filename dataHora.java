import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dataHora {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(d + "\n" + t + "\n" + "\n" + ldt);
        int i;
        for (i = 0; i < 5; i++) {
            if (++i % 3 == 0) {
                break;
            }
        }
        System.out.println(i);
    }
}