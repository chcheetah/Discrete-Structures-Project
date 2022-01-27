import BinarySearchTreeAlgos.BinarySearchTree;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.*;
public class Main{
    static BinarySearchTree bst = new BinarySearchTree();
    public static void about(){
        JFrame xe = new JFrame();
        xe.setLayout(new FlowLayout());
        String[] nms = {"Project for Discrete Structures in C.S \n \n ","\n Made by \n", "\n Anish Srivastava 2020A7PS0058U", "\n Ashutosh Pandey 2020A7PS0234U","\n Harshiv Chandra 2020A7PS0085U \n", "\n for \n", "\n Prof. Dr. Baskaran S.\n"};
        String id = "";
        for(String i : nms){
            id = id + i;
        }
        JTextArea d = new JTextArea(id);
        d.setBackground(Color.BLACK);
        d.setForeground(Color.green);
        d.setEditable(false);
        xe.add(d);
        xe.getContentPane().setBackground(Color.BLACK);

        xe.setBounds(250,250,250,250);
        xe.setResizable(false);
        xe.setVisible(true);
    }
    public static void searc(int s, boolean l){
        JLabel empty = new JLabel("");
        if (l) {
            JFrame j = new JFrame("Item found");
            j.setResizable(false);
            JLabel u = new JLabel("Item found at Node");
            j.getContentPane().setBackground(Color.BLACK);
            u.setForeground(Color.green);
            int f = bst.searchpos(s);
            JLabel y = new JLabel(String.valueOf(f));
            y.setForeground(Color.green);
            j.setLayout(new FlowLayout(FlowLayout.CENTER));
            j.add(u);
            j.add(y);
            j.setVisible(true);
            j.setBounds(300,300,100,100);
        }
        else{
            String sqas = String.valueOf(s);
            JFrame k = new JFrame();
            k.setResizable(false);
            JLabel de = new JLabel("Element ' " + sqas + " ' does not exist in Binary Search Tree");
            JButton w = new JButton("Add Element");
            w.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    bst.insert(s);
                    JOptionPane.showMessageDialog(w,"Element '" + sqas + " ' has been added successfully to the Binary Search Tree");
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    w.setBackground(Color.green);
                    w.setForeground(Color.white);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    w.setForeground(Color.black);
                    w.setBackground(Color.lightGray);
                }
            });
            k.setLayout(new FlowLayout(FlowLayout.CENTER));
            k.setBounds(150,150,310,150);
            k.add(de);
            k.add(empty);
            k.add(w);
            k.setVisible(true);
            k.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
    public static void finouttrav(){
        String travop = "\t\t" +"Traversals (in, pre, post)"+'\n'+ "In-Order" + "\t : " + bst.inor + '\n' + "Pre-Order" + "\t : " + bst.preor + '\n' + "Post-Order" + "\t : " + bst.postor;

        JFrame ju = new JFrame("Traversal of Given Binary Tree");
        JLabel u = new JLabel("Selected Traversal Orders:");
        JTextArea ki = new JTextArea( travop);
        ki.setEditable(false);
        ju.add(ki);
        ju.setBounds(350,350,500,110);
        ju.setVisible(true);
        ju.setResizable(false);
    }
    public static String post(){
        bst.postorder();
        return bst.postor;
    }
    public static String in(){
        bst.inorder();
        return bst.inor;
    }
    public static String pre(){
        bst.preorder();
        return bst.preor;
    }
    public static void travers(){
        JFrame g = new JFrame();
        g.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                g.invalidate();
                g.validate();
                g.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

                g.invalidate();
                g.validate();
                g.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                g.invalidate();
                g.validate();
                g.repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                g.invalidate();
                g.validate();
                g.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {

                g.invalidate();
                g.validate();
                g.repaint();
            }
        });
        g.getContentPane().setForeground(Color.green);
        g.getContentPane().setBackground(Color.BLACK);
        g.setBounds(200,200,200,200);
        g.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel o = new JLabel("Type of Traversal Algorithm?");
        o.setForeground(Color.green);
        JCheckBox inor = new JCheckBox("Inorder Traversal");
        inor.setBackground(Color.black);
        inor.setForeground(Color.green);
        JCheckBox preor = new JCheckBox("Preorder Traversal");
        preor.setBackground(Color.black);
        preor.setForeground(Color.green);
        JCheckBox postor = new JCheckBox("Postorder Traversal");
        postor.setBackground(Color.black);
        postor.setForeground(Color.green);
        inor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1){
                    in();

                }
                else{
                    bst.inor = " ";
                }
            }
        });
        postor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1){
                    post();
                }
                else{
                    bst.postor =  " ";
                }
            }
        });
        preor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1){
                    pre();
                }
                else{
                    bst.preor = " ";
                }
            }
        });
        JButton conti = new JButton("Continue");
        conti.setForeground(Color.black);
        conti.setBackground(Color.lightGray);
        conti.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                finouttrav();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                conti.setBackground(Color.green);
                conti.setForeground(Color.white);

            }

            @Override
            public void mouseExited(MouseEvent e) {

                conti.setForeground(Color.black);
                conti.setBackground(Color.lightGray);

            }
        });
        g.add(o);
        g.add(inor);
        g.add(postor);
        g.add(preor);
        g.add(conti);
        g.setVisible(true);
        g.setResizable(false);
    }
    public static void main(String[] args){
        // predefined binary tree as question already mentions it
        int[] x = {8,5,9,3,7,11,2,6,54,76,99,33};
        for(int i:x){
            bst.insert(i);
        }
        JFrame a = new JFrame("Discrete Structures Project");
        a.getContentPane().setBackground(Color.BLACK);
        a.getContentPane().setForeground(Color.green);
        JLabel m = new JLabel("Binary Search Tree : Formation, Insertion, Retrieval");
        m.setForeground(Color.green);
        m.setLayout(new FlowLayout());
        a.setLayout(new FlowLayout(FlowLayout.CENTER));
        a.setBounds(400,400,400,200);
        a.add(m);
        a.setResizable(false);
        JPanel wq = new JPanel();
        wq.setBackground(Color.black);
        wq.setForeground(Color.green);
        JPanel esq = new JPanel();
        esq.setBackground(Color.black);
        JTextField o = new JTextField("Input Element");
        o.setEditable(false);
        JButton traversal = new JButton("Print traversal");
        JButton about = new JButton("About Program");
        JButton search = new JButton("Search for element");
        wq.add(o);
        a.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a.invalidate();
                a.validate();
                a.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

                a.invalidate();
                a.validate();
                a.repaint();

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                a.invalidate();
                a.validate();
                a.repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Runnable r = () -> {
                    a.invalidate();
                    a.validate();
                    a.repaint();
                };
                SwingUtilities.invokeLater(r);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                a.invalidate();
                a.validate();
                a.repaint();

            }
        });
        o.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String l = o.getText();
                if( l.equalsIgnoreCase("Input Element")) {
                    o.setText("");
                }
                o.setEditable(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                o.setBackground(Color.cyan);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                o.setBackground(Color.white);
            }
            @Override
            public void mouseEntered(MouseEvent e){}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        traversal.setForeground(Color.black);
        traversal.setBackground(Color.lightGray);
        search.setForeground(Color.black);
        search.setBackground(Color.lightGray);
        about.setForeground(Color.black);
        about.setBackground(Color.lightGray);
        traversal.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                travers();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        a.invalidate();
                        a.validate();
                        a.repaint();
                        traversal.setBackground(Color.green);
                        traversal.setForeground(Color.white);
                    }
                };
                SwingUtilities.invokeLater(runnable);


            }

            @Override
            public void mouseExited(MouseEvent e) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        a.invalidate();
                        a.validate();
                        a.repaint();
                        traversal.setForeground(Color.black);
                        traversal.setBackground(Color.lightGray);
                    }
                };
                SwingUtilities.invokeLater(runnable);


            }
        });
        search.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int y = Integer.parseInt(o.getText());
                System.out.println(y);
                boolean tre = bst.search(y);
                a.invalidate();
                a.validate();
                a.repaint();
                searc(y,tre);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        a.invalidate();
                        a.validate();
                        a.repaint();
                        search.setBackground(Color.green);
                        search.setForeground(Color.white);
                    }
                };
                SwingUtilities.invokeLater(runnable);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        a.invalidate();
                        a.validate();
                        a.repaint();
                        search.setForeground(Color.black);
                        search.setBackground(Color.lightGray);
                    }
                };
                SwingUtilities.invokeLater(runnable);
            }
        });
        about.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                about();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        a.invalidate();
                        a.validate();
                        a.repaint();
                        about.setBackground(Color.green);
                        about.setForeground(Color.white);
                    }
                };
                SwingUtilities.invokeLater(runnable);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        a.invalidate();
                        a.validate();
                        a.repaint();
                        about.setForeground(Color.black);
                        about.setBackground(Color.lightGray);
                    }
                };
                SwingUtilities.invokeLater(runnable);

            }
        });
        wq.setLayout(new FlowLayout());
        wq.add(search);
        esq.add(traversal);
        esq.add(about);
        a.add(wq);
        a.add(esq);

        a.setVisible(true);
        UIManager U = new UIManager();
        U.put("OptionPane.background", Color.black);
        U.put("OptionPane.foreground", Color.green);

        a.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = showOptionDialog(
                        null, "Are you sure you want to quit?",
                        "Confirmation", YES_NO_OPTION,
                        QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    System.exit(0);
                }
            }
        };
        a.addWindowListener(exitListener);



    }
}
