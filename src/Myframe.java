// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello,  first Java app!");
//     }
// }

import javax.swing.*;

public class Myframe{
    public static void main(String[] args){
        JFrame frame = new JFrame("My First GUI App");
        JButton Jnmew=new JButton("Hello");
        frame.add(Jnmew);
        frame.setSize(400, 300);
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}