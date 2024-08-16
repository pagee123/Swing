import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndshowGUI();
            }
       });;
    }
    private static void createAndshowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame=new JFrame("HellowWorldSwing");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hellow World");
        frame.getContentPane().add(label);
        
        //frame.pack(); //自動是配視窗大小
        frame.setVisible(true);
    }
}
