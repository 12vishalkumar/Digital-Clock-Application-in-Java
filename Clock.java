//******************************* Importing required libararies ***************************
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


//******************************* Clock class and inherited the JFrame class ***************
public class Clock extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    //*************************** clock function **************************************
    Clock() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 220);
        this.setResizable(true);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd MMMMM, yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 59));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setOpaque(true);
        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.BOLD,34));
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.BOLD,30));

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        //****************************** timer function call *********************************
        setTimer();
    }

    //********************************** Timer function ***************************************
    public void setTimer() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    //***************************** Main function *****************************
    public static void main(String[] args) {
        //************************* clock function call ***********************
        new Clock();
    }
}