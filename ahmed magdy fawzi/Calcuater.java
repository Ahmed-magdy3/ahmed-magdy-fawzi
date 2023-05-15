
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Calcuater {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame ("calculater" );
        JPanel page = new JPanel(new GridLayout (3,1));
        JPanel panel1 = new JPanel (new GridLayout(1,2));

        JTextField num1 = new JTextField ("");
        JTextField num2 = new JTextField ("");
        panel1.add(num1);
        panel1.add(num2);
        
        JPanel panel2 = new JPanel (new GridLayout (1,5));
        JButton addButton = new JButton("+");
        JButton subButton = new JButton ("-");
        JButton multButton = new JButton ("*");
        JButton devButton = new JButton ("/");
        JButton clearButton = new JButton ("clear");
        
        panel2.add(addButton);
        panel2.add(subButton);
        panel2.add(multButton);
        panel2.add(devButton);
        panel2.add(clearButton);
        
        JPanel panel3 = new JPanel(new GridLayout (1,1));
        JTextArea result = new JTextArea ("0");
        panel3.add(result);
        
        page.add(panel1);
        page.add(panel2);
        page.add(panel3);
        frame.add(page);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800 , 600));
    
        frame.setVisible(true);
        addButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
              Double oldResult = Double.parseDouble(result.getText())     ;
              Double userNum1 = Double.parseDouble(num1.getText());
              Double userNum2 = Double.parseDouble(num2.getText());
              
              String userResult = Double.toString(oldResult + userNum1 + userNum2);
              
              result.setText(userResult);

            }
       });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              Double userNum1 = Double.parseDouble(num1.getText());
              Double userNum2 = Double.parseDouble(num2.getText());
              
              String userResult = Double.toString((userNum1 - userNum2) );
              
              result.setText(userResult);
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
              Double userNum1 = Double.parseDouble(num1.getText());
              Double userNum2 = Double.parseDouble(num2.getText());
              String userResult = Double.toString((userNum1 * userNum2));
              
                
              result.setText(userResult);
                }
                 
            

        });
        devButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              Double userNum1 = Double.parseDouble(num1.getText());
              Double userNum2 = Double.parseDouble(num2.getText());
              
              String userResult = Double.toString((userNum1 / userNum2));
              
              result.setText(userResult);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            Double oldResult = 0.0   ;
            String userResult = Double.toString(oldResult );
              result.setText(userResult);
            }
        });
    }
    
}
