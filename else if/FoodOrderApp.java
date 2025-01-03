import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FoodOrderApp extends JFrame {
    
    // Declare GUI components
    private JLabel label;
    private JComboBox<String> foodMenu;
    private JTextField nameField, priceField;
    private JTextArea orderSummary;
    private JButton orderButton;
    private String selectedFood = "";
    private double totalPrice = 0.0;
    
    // Constructor to set up the GUI
    public FoodOrderApp() {
        setTitle("Food Order Application");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Label for user name
        label = new JLabel("Enter Your Name: ");
        nameField = new JTextField(20);
        
        // Food Menu (Drop-down list)
        String[] foodItems = {"Select a Food", "Pizza - $10", "Burger - $5", "Pasta - $8"};
        foodMenu = new JComboBox<>(foodItems);
        
        // Display total price
        priceField = new JTextField(10);
        priceField.setEditable(false); // Make price field read-only
        
        // Order button
        orderButton = new JButton("Submit Order");
        
        // Order summary text area
        orderSummary = new JTextArea(5, 30);
        orderSummary.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderSummary);
        
        // Add components to JFrame
        add(label);
        add(nameField);
        add(foodMenu);
        add(new JLabel("Total Price:"));
        add(priceField);
        add(orderButton);
        add(scrollPane);
        
        // Action listener for the food menu selection
        foodMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) foodMenu.getSelectedItem();
                
                // Using if statement to set price and food based on selection
                if (selectedItem != null) {
                    if (selectedItem.contains("Pizza")) {
                        selectedFood = "Pizza";
                        totalPrice = 10.0;
                    } else if (selectedItem.contains("Burger")) {
                        selectedFood = "Burger";
                        totalPrice = 5.0;
                    } else if (selectedItem.contains("Pasta")) {
                        selectedFood = "Pasta";
                        totalPrice = 8.0;
                    } else {
                        selectedFood = "";
                        totalPrice = 0.0;
                    }
                    priceField.setText("$" + totalPrice);
                }
            }
        });
        
        // Action listener for the order button
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String customerName = nameField.getText();
                
                // Check if name is entered and food is selected
                if (customerName.isEmpty() || selectedFood.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter your name and select a food item.");
                    return;
                }
                
                // Using switch-case to display order summary
                String orderSummaryText = "Order Summary:\n";
                switch (selectedFood) {
                    case "Pizza":
                        orderSummaryText += "Customer: " + customerName + "\nFood: Pizza\nPrice: $10\n";
                        break;
                    case "Burger":
                        orderSummaryText += "Customer: " + customerName + "\nFood: Burger\nPrice: $5\n";
                        break;
                    case "Pasta":
                        orderSummaryText += "Customer: " + customerName + "\nFood: Pasta\nPrice: $8\n";
                        break;
                    default:
                        orderSummaryText += "No food selected.\n";
                        break;
                }
                
                orderSummaryText += "Total Price: $" + totalPrice;
                orderSummary.setText(orderSummaryText); // Update the order summary area
            }
        });
    }

    // Main method to run the program
    public static void main(String[] args) {
        FoodOrderApp app = new FoodOrderApp();
        app.setVisible(true);
    }
}

