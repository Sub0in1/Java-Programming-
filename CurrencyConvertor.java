import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CurrencyConvertor
 {
    //Function to convert from rupee
    //to the doller and vice-versa
    //using Java Swing 
    public static void converter()
    {
        //Creating a new frame using JFrame
        JFrame f = new JFrame("CONVERTER");

        //Creating two labels
        JLabel l1, l2;

        //Creating two text fields.
        //One for rupee and one for
        //the dollar
        JTextField t1,t2;

        //Creating three buttons
        JButton b1,b2,b3;
        
        //Namming the labels and setting
        // the bounds for the labels
        l1 = new JLabel("Rupees");
        l1.setBounds(20,40,60,30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(170,40,60,30);

        //Ininializing the text fields with
        //0 by default and setting the
        //bounds for the text fields
        t1 = new JTextField("0");
        l1.setBounds(80,40,50,30);
        t2 = new JTextField("0");
        l2.setBounds(240,40,50,30);

        //Creating the button for INR,
        //one button for the dollar
        //and one button for close 
        //and setting the bounds
        b1 = new JButton("INR");
        b1.setBounds(50,80,60,15);
        b2 = new JButton("Doller");
        b2.setBounds(190,80,60,15);
        b3 = new JButton("close");
        b3.setBounds(150,150,60,30);
        
        //Adding action listener
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                //Converting to double 
                double d
                  =Double.parseDouble(t1.getText());

                //Coverting rupees to dollars
                double d1 = (d/83.69);

                //Getting the starting value of the 
                //calculated value 
                String str1 = String.valueOf(d1);

                //Placing it in the text box
                t2.setText(str1); 
            }
        });
        //Adding action listener 
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              //Coverting to double
              double d2
                =Double.parseDouble(t2.getText());  

                //converting Doller to rupees
                double d3 = (d2*83.69);

                //Getting the string value of the 
                //calculated value
                String str2 = String.valueOf(d3);

                //Placing it in the text box
                t1.setText(str2);
            }
        });

        //Action listener to close tha form
        b3.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
             f.dispose();
           }
        });
        //Default method for closing the frame
        f.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e)
           {
             System.exit(0);
           } 
        });

        //Adding the created objects
        // to the form
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    //Driver code
    public static void main(String srgs[])
    {
       converter();
    }




    
}