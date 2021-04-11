/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author leesangoroh
 */
public class SuperClass_Parent {
    
    public double ChickenBurger;
    public double FiletOFish;
    public double ChickenLegend;
    public double ChickenBurgerMeal;
    public double BaconCheeseBurger;
    
    
    public double MilkShake;
    public double VanillaCone;
    public double ClassicVanilla;
    public double VanillaMilkShake;
    public double ChocolateMilkShake;

    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount () {
        Meals = ChickenBurger + FiletOFish + ChickenLegend + ChickenBurgerMeal + BaconCheeseBurger;
        
        Drinks = MilkShake + VanillaMilkShake + ClassicVanilla +VanillaCone + ChocolateMilkShake;
                
        TotalofMD = Meals + Drinks;
        
        AllTotalofMD = TotalofMD;
        
        return AllTotalofMD;
    }
    
    
    private JFrame frame;
    
    public void iExitSystem () {
       
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm your exit", "Resaturant Billing System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
    
    //****************************PRICE*****************************************
    
    public double pChickenBurger = 356;
    public double pFiletOFish = 295;
    public double pChickenLegend = 398;
    public double pChickenBurgerMeal = 265;
    public double pBaconCheeseBurger = 364;
    
    
    public double pMilkShake = 210;
    public double pVanillaCone = 220;
    public double pClassicVanilla = 250;
    public double pVanillaMilkShake = 195;
    public double pChocolateMilkShake = 237;
    
     //****************************PRICE*****************************************
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount) {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
    
    
}
