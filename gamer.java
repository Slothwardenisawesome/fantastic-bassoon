

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageObserver;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gamer  extends
 JPanel  implements KeyListener, ImageObserver  {
    private int x = 600;
    // Initial player position
    // Initial player position
    private final int y = 720;
          static int hearts = 10;
          static int time = 0;
          static int locy = -100;
          static int locy2 = -200;
          static int locy3 = -300;
          static int locy4 = -400;
          static int locx4 = 40;
          boolean bulletGam = true;
          boolean bulletGam2 = true;
          boolean moverGam = true;
          int locx = 10;
          int locx2 = 20;
          int locx3 = 30;
          static JLabel labe = new JLabel();
          
          static JLabel timer = new JLabel();
        static boolean gam = true;  

   
                    static JLabel label = new JLabel("Hearts: " + hearts);
                    static JLabel score1 = new JLabel("0 - 40000: Noob");
                    static JLabel score2 = new JLabel("40000 - 50000: Average");
                    static JLabel score3 = new JLabel("50000 - 75000: Good");
                    static JLabel score4 = new JLabel("75000 - 100000: Great");
                    static JLabel score5 = new JLabel("100000 - 150000: Awesome");
                    static JLabel score6 = new JLabel("150000 - 200000: Pro");
                    static JLabel score7 = new JLabel("200000<: Super Pro");
                    static JLabel pause = new JLabel("");
                     // x, y are the top-left corner, width and height define the oval size
              public gamer() {
                  
                  setPreferredSize(new Dimension(1600, 1200));
                 
                  
           
          
                  addKeyListener(this);
                  setFocusable(true);
              }
          
          
              @Override
              public void keyPressed(KeyEvent e)   {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_SEMICOLON) {
                    if (bulletGam2 == false) {
                    
                    bulletGam2 = true;
                    
                    
                    }
                    else if (bulletGam2 == true) {
                        bulletGam2 = false;
                        
                    
                    
                       
                        }
                }
                if (key == KeyEvent.VK_SPACE) {
                    if (gam == false) {
                    gam = true;
                    bulletGam = true;
                    moverGam = true;
                    pause.setVisible(false);
                    }
                    else if (gam == true) {
                        gam = false;
                        bulletGam = false;
                        moverGam = false;
                        pause.setText("PAUSED"
                        );
                        pause.setVisible(true);
                  pause.setBounds(700, 10, 200, 50);
                  pause.setForeground(Color.BLACK);
                  pause.setVisible(true);
                        }
                }
                  
                  if (key == KeyEvent.VK_LEFT | key == KeyEvent.VK_A) {
                    if (moverGam == true) {
                    x -= 60; // Move left
                      repaint();
                    }
                  } else if (key == KeyEvent.VK_RIGHT | key == KeyEvent.VK_D) {
                      if (moverGam == true) {
                    x += 60; // Move right
                      repaint();
                      }
                  } 
                 
            
                  
              
                  repaint(); // Refresh the panel to update the character's position
              }
          
              
          
          
             @Override
              public void paintComponent(Graphics g)  {
                
                  
                  timer.setVisible(true);
                  timer.setBounds(700, 200, 200, 50);
                  timer.setForeground(Color.BLACK);
                  timer.setVisible(true);
                  
                  label.setVisible(true);
                  label.setBounds(700, 100, 200, 50);
                  label.setForeground(Color.BLACK);
                  label.setVisible(true);
                  //---------------------------------------------------------------------------------------------
                  score1.setVisible(true);
                  score1.setBounds(1200, 10, 200, 50);
                  score1.setForeground(Color.BLACK);
                  //---------------------------------------------------------------------------------------------
                  score2.setVisible(true);
                  score2.setBounds(1200, 30, 200, 50);
                  score2.setForeground(Color.GREEN);
                  score2.setVisible(true);
                 //---------------------------------------------------------------------------------------------
                 score3.setVisible(true);
                 score3.setBounds(1200, 50, 200, 50);
                 score3.setForeground(Color.blue);
                 score3.setVisible(true);

                 //---------------------------------------------------------------------------------------------
                 score4.setVisible(true);
                 score4.setBounds(1200, 70, 200, 50);
                 score4.setForeground(Color.CYAN);
                 score4.setVisible(true);
                 //---------------------------------------------------------------------------------------------
                 score5.setVisible(true);
                 score5.setBounds(1200, 90, 200, 50);
                 score5.setForeground(Color.RED);
                 score5.setVisible(true);
                 //---------------------------------------------------------------------------------------------
                 score6.setVisible(true);
                 score6.setBounds(1200, 110, 200, 50);
                 score6.setForeground(Color.YELLOW.darker());
                 score6.setVisible(true);
                 //---------------------------------------------------------------------------------------------
                 score7.setVisible(true);
                 score7.setBounds(1200, 130, 200, 50);
                 score7.setForeground(Color.cyan.brighter());
                 score7.setVisible(true);
                 //---------------------------------------------------------------------------------------------
                 
              
                  super.paintComponent(g);
                  if (x > 1500) {
                    x -= 90;
                    repaint();
                }
                else if (x < 0) {
                    x += 90;
                    repaint();
                } 
        
                  Rectangle2D rect1 = new Rectangle2D.Double(x, y, 30, 30);
                  
                   // Example shape
                   Ellipse2D oval = new Ellipse2D.Double(locx, locy, 30, 90); // x, y are the top-left corner, width and height define the oval size
                   Ellipse2D oval2 = new Ellipse2D.Double(locx2, locy2, 30, 90);
                   Ellipse2D oval3 = new Ellipse2D.Double(locx3, locy3, 30, 90);
                   Ellipse2D oval4 = new Ellipse2D.Double(locx4, locy4, 30, 90);
                  Random rand = new Random();
                  if (locy > 1400) {
                      locx = rand.nextInt(1600);
                      locy = -100;
                  }
                  if (locy2 > 1400) {
                      locx2 = rand.nextInt(1600);
                      
                      locy2 = -200;
                  }
                  if (locy3 > 1400) {
                    locx3 = rand.nextInt(1600);
                    
                    locy3 = -300;
                }
                if (locy4 > 1400) {
                    locx4 = rand.nextInt(1600);
                    
                    locy4 = -400;
                }
               
                 
             
                  
                  
                 
                  g.setColor(Color.BLUE);

                  g.fillRect(x, y, 30, 30); // Draw player as a rectangle
                  
                  
                  g.setColor(Color.BLACK);
                  g.fillRect(0, 750, 1900, 200);
                  g.setColor(Color.RED); 
                  g.fillOval(locx, locy, 30, 90);
                  g.fillOval(locx2, locy2, 30, 90);
                  g.fillOval(locx3, locy3, 30, 90);
                  g.fillOval(locx4, locy4, 30, 90);
                  //----------------------------------------------------------------------------------------------------------------------------------------
                  if (bulletGam == true & bulletGam2 == true) {
                  locy += 1;
                  repaint();
                  locy2 += 1;
                  repaint();
                  locy3 += 1;
                  repaint();
                  locy4 += 1;
                  repaint();
                  }
                  //----------------------------------------------------------------------------------------------------------------------------------------

                  timer.setText("Time: " + time);
                  if (oval.intersects(rect1.getBounds()) == true){
                      x = 700;
                      locy = -100;
                    
                      hearts--;
                      System.out.println("HEARTS -- 1");
                      locx = -100;
                      
                      repaint();
                      label.setText("Hearts: " + hearts); 
                      
                      
                      
                  }
                  if (oval2.intersects(rect1.getBounds()) == true){
                    x = 700;
                    locy2 = -100;
                  
                    hearts--;
                    System.out.println("HEARTS -- 1");
                    locx2 = -100;
                    
                    repaint();
                    label.setText("Hearts: " + hearts); 
                    
                    
                    
                }
                if (oval3.intersects(rect1.getBounds()) == true){
                    x = 700;
                    locy3 = -100;
                  
                    hearts--;
                    System.out.println("HEARTS -- 1");
                    locx3 = -100;
                    
                    repaint();
                    label.setText("Hearts: " + hearts); 
                    
                    
                    
                }
                if (oval4.intersects(rect1.getBounds()) == true){
                    x = 700;
                    locy4 = -100;
                    
                    hearts--;
                    System.out.println("HEARTS -- 1");
                    locx4 = -100;
                    
                    repaint();
                    label.setText("Hearts: " + hearts); 
                    
                    
                    
                }
                  
                  if (gam == true) {time++;}
                  if (hearts <= 0) {

                  }
                  if (hearts <= 0) {

                      g.setColor(Color.WHITE);
                      g.fillRect(0, 0, 5000, 5000);
                      g.setColor(Color.CYAN);
                      gam = false;
                      labe.setText("GAME OVER!");
                      labe.setBounds(725, 100, 700, 600);
                      labe.setForeground(Color.CYAN);
                      labe.setVisible(true);
                      label.setText("");
                      label.setText("");
                      label.setText("");
                      label.setText("");
                      label.setText("");
                
                      
                      final int finalTime = time;
                      timer.setText("Final Time: "  + finalTime);
                      locy = -10000000;
                      locy2 = -1000000;
                      locy3 = -1000000;
                      
                  }
                  
                  
              }
          
           
              
              
              // Unused methods
              @Override
              public void keyTyped(KeyEvent e) {}
              @Override
              public void keyReleased(KeyEvent e) {}
              public static void main(String[] args)  throws InterruptedException {
                  
                  JFrame f = new JFrame("DODGE THAT THING");
                  
                  gamer game = new gamer();
               
                          game.repaint();
                         game.add(label);
                         
                         
                  f.add(game);
                  
                 
                
                  f.pack();
                  
                  f.setVisible(true);

                  game.add(label);
                  label.setVisible(true);
                  game.add(labe);
                  labe.setVisible(true);
                  labe.setVisible(true);
                  game.add(timer);
                  game.add(score1);
                  game.add(score3);
                  game.add(score2);
                  game.add(score4);
                  game.add(score5);
                  game.add(score6);
                  game.add(score7);
                  
                  labe.setVisible(true);
        game.repaint();
       

    }
}