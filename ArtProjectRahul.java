//*****************************************************************************
//  ArtProjectRahul.java       Author: Rahul Thapa
//
// Demonstrates the features of Nepal's Flag according to the Constitution
// of Nepal 2015. This is the only flag in the world that is not rectangular.
// It is also very mathematical which you can see in my program.
// The program uses the supporting files from the internet
// so please make sure you are connected to the internet to see the full 
// feature. You can also see the geometry of the flag and the constitution
// it is based off. I have tried to make the flag as accurate as possible.
// The legend on the side shows meaning of different features of the flag. 
//*****************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Rotate;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.Pos;

public class ArtProjectRahul extends Application
{
   Stage window;
   Scene scene1, scene2, scene3;
   
   public void start(Stage primaryStage) throws Exception
   {
      window = primaryStage;
   
      // To create the mathematical flag****************************************************
      Line AB = new Line(200, 900, 800, 900); 
      Line AC = new Line(200, 100, 200, 900);
      Line BBD = new Line(200, 300, 800, 900); 
      Line FG = new Line(375, 475.74, 800, 475.74);
      Line CG = new Line(200, 100, 800, 475.74);
      Line HI = new Line(350, 195, 350, 900);
      Line FFG = new Line(200, 475.74, 800, 475.74);
      Line JK = new Line(200, 287.87, 500, 287.87);
      Line JG = new Line(200, 287.87, 800, 474.74);
      Line O1 = new Line(200, 335, 575, 335);
      Line N1 = new Line(340, 417, 360, 417);
      
      //Test to rotate the line for the upper slant edge
      double startXTest = 350;
      double startYTest = 335;
      double endXTest   = 350 + 80 * Math.sin(Math.toRadians(180 + 180));
      double endYTest   = 335 + 80 * Math.cos(Math.toRadians(180 + 180));
      Line mPer = new Line(startXTest, startYTest, endXTest, endYTest);
      mPer.setStrokeWidth(2);
      
      //Test to rotate the line for the upper slant edge
      double startX3 = 800;
      double startY3 = 900;
      double endX3   = 800 + 600 * Math.sin(Math.toRadians(180 + 45));
      double endY3   = 900 + 600 * Math.cos(Math.toRadians(180 + 45));
      Line BD = new Line(startX3, startY3, endX3, endY3);
      
      //Top concave up arc (PNQ) Center L and radius LN
      Arc arc1 = new Arc(350, 287.87, 129, 129, 0, 360);
      arc1.setType(ArcType.OPEN);
      arc1.setStroke(Color.BLACK);
      arc1.setFill(null);
      arc1.setStrokeWidth(1);
      arc1.setType(ArcType.OPEN);
      
      //Bottom concave up arc (PZQ) Center M and radius MQ
      Arc arc2 = new Arc(350, 335, 120, 120, 0, 360);
      arc2.setType(ArcType.OPEN);
      arc2.setStroke(Color.BLACK);
      arc2.setFill(null);
      arc2.setStrokeWidth(1);
      arc2.setType(ArcType.OPEN);
      
      //concave down arc (RMS) Center N and radius NM
      Arc arc3 = new Arc(350, 416.87, 82, 82, 0, 360);
      arc3.setType(ArcType.OPEN);
      arc3.setStroke(Color.BLACK);
      arc3.setFill(null);
      arc3.setStrokeWidth(1);
      arc3.setType(ArcType.OPEN);
      
      //arc above the concave down one (RLS) Center T and radius TS
      Arc arc4 = new Arc(350, 392, 78, 78, 0, 360);
      arc4.setType(ArcType.OPEN);
      arc4.setStroke(Color.BLACK);
      arc4.setFill(null);
      arc4.setStrokeWidth(1);
      arc4.setType(ArcType.OPEN);
      
      //arc above the concave down arc center T and radius TM
      Arc arc5 = new Arc(350, 392, 57, 57, 0, 360);
      arc5.setType(ArcType.OPEN);
      arc5.setStroke(Color.BLACK);
      arc5.setFill(null);
      arc5.setStrokeWidth(1);
      arc5.setType(ArcType.OPEN);
      
      //Testing the right triangles for the crescent moon.
      Arc arc6 = new Arc(350, 392, 57, 57, 0, 360);
      arc6.setType(ArcType.OPEN);
      arc6.setStroke(Color.BLACK);
      arc6.setFill(null);
      arc6.setStrokeWidth(1);
      arc6.setType(ArcType.OPEN);
      
      Line leftLine6 = new Line(350, 313, 350 + 27 * Math.sin(Math.toRadians(30)),
                                313 + 27 * Math.cos(Math.toRadians(30)));
      Line rightLine6 = new Line(350, 313, 350 + 27 * Math.sin(Math.toRadians(-30)),
                                 313 + 27 * Math.cos(Math.toRadians(-30)));      
      
      Line FP = new Line(200, 475.74, 227, 335);
      Line GQ = new Line(800, 474.74, 473, 335);
      Line P1 = new Line(227, 330, 227, 340);
      Line Q1 = new Line(473, 330, 473, 340);
      
      
      Line T1 = new Line(340, 392, 360, 392);
            
      Line Z1 = new Line(340, 458.5, 360, 458.5);
      Line RS = new Line(272, 392, 429, 392);
      
      //Sun 
      Line UV = new Line(200, 687.74, 588, 687.74);
      Line W1 = new Line(200, 900, 350, 687.74);
      
      //inside arc with radius NM
      Arc Sun1 = new Arc(350, 687.74, 82, 82, 0, 360);
      Sun1.setType(ArcType.OPEN);
      Sun1.setStroke(Color.BLACK);
      Sun1.setFill(null);
      Sun1.setStrokeWidth(1);
      Sun1.setType(ArcType.OPEN);
      
      //Outside arc with radius LN
      Arc Sun2 = new Arc(350, 687.74, 129, 129, 0, 360);
      Sun2.setType(ArcType.OPEN);
      Sun2.setStroke(Color.BLACK);
      Sun2.setFill(null);
      Sun2.setStrokeWidth(1);
      Sun2.setType(ArcType.OPEN);
      
      //Border Lines
      Line left = new Line(174, 53.5, 174, 926);
      Line bottom = new Line(174, 926, 864, 926);
      Line Middle = new Line(441, 501.47, 890, 501.47);
      
      //Test to rotate the line for the upper slant edge
      double startX = 890;
      double startY = 501.47;
      double endX   = 890 + 845 * Math.sin(Math.toRadians(180 + 58));
      double endY   = 501.47 + 845 * Math.cos(Math.toRadians(180 + 58));
      Line slantUp = new Line(startX, startY, endX, endY);
      
      //Test to rotate the line for the lower slant edge
      double startX1 = 864;
      double startY1 = 926;
      double endX1   = 864 + 600 * Math.sin(Math.toRadians(180 + 45));
      double endY1   = 926 + 600 * Math.cos(Math.toRadians(180 + 45));
      Line slantDown = new Line(startX1, startY1, endX1, endY1);
      
      
      // Drawing Sun's Triangle
      Line[] leftLine = new Line[12];
      Line[] rightLine = new Line[12];
      Group[] triangle = new Group[12];
      
      Group sunTriangles = new Group();
      for (int i =0; i<12; i++){
         
         leftLine[i] = new Line(350, 558.87, 350 + 55 * Math.sin(Math.toRadians(-23)),
                                558.87 + 55 * Math.cos(Math.toRadians(-23)));
         rightLine[i] = new Line(350, 558.87, 350 + 55 * Math.sin(Math.toRadians(23)), 
                                 558.87 + 55 * Math.cos(Math.toRadians(23)));
         
         triangle[i] = new Group(leftLine[i], rightLine[i]);
         triangle[i].getTransforms().add(new Rotate(i*30,350, 687.74));
         sunTriangles.getChildren().add(triangle[i]);    
      }
      
      
      //Triangle for the crescent Moon
      //Drawing Moon's Triangle
      Line[] leftLine1 = new Line[8];
      Line[] rightLine1 = new Line[8];
      Group[] triangle1 = new Group[8];
      
      Group moonTriangles = new Group();
      for (int i =0; i<8; i++){
         leftLine1[i] = new Line(350, 313, 350 + 27 * Math.sin(Math.toRadians(30)), 
                                 313 + 27 * Math.cos(Math.toRadians(30)));
         rightLine1[i] = new Line(350, 313, 350 + 27 * Math.sin(Math.toRadians(-30)), 
                                  313 + 27 * Math.cos(Math.toRadians(-30)));
         
         triangle1[i] = new Group(leftLine1[i], rightLine1[i]);
         triangle1[i].getTransforms().add(new Rotate(-78.75 + i*22.5, 350, 392));
         
         moonTriangles.getChildren().add(triangle1[i]);   
      }
      
      //creating labeling for the mathematical flag      
      Label[] geoLabelArr = new Label[23];
      String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                           "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"};
      
      // X and Y coordinate for alphabet respectively.
      int[] xPosition = {190, 810, 190, 185, 370, 185, 810, 350, 350, 185, 505, 355,
                         355, 355, 185, 240, 450, 310, 390, 355, 185, 600, 330};
      int[] yPosition = {900, 900, 80, 290, 475, 465, 475, 900, 170, 275, 275, 265,
                         340, 410, 330, 315, 315, 390, 390, 370, 680, 680, 670};
      
      Group geoLabels = new Group();
      for (int i=0; i<23; i++){
         geoLabelArr[i] = new Label(alphabet[i]);
         geoLabelArr[i].setLayoutX(xPosition[i]);
         geoLabelArr[i].setLayoutY(yPosition[i]);
         geoLabels.getChildren().add(geoLabelArr[i]);
      }
           
      // To create the actual flag************************************************************
           
      //Upper Triangles
      
      //Small Triangle
      Polygon upperSmall = new Polygon();
        upperSmall.getPoints().addAll(new Double[]{
            200.0, 100.0,
            200.0, 475.76,
            800.0, 475.76});
      upperSmall.setFill(Color.CRIMSON);
      
      Polygon upperLarge = new Polygon();
        upperLarge.getPoints().addAll(new Double[]{
            174.0, 54.35,
            890.0, 501.47,
            174.0, 501.47});
      upperLarge.setFill(Color.rgb(0,0,153));
      
      Polygon lowerSmall = new Polygon();
        lowerSmall.getPoints().addAll(new Double[]{
            200.0, 300.0,
            800.0, 900.0,
            200.0, 900.0});
      lowerSmall.setFill(Color.CRIMSON);
      
      Polygon lowerLarge = new Polygon();
        lowerLarge.getPoints().addAll(new Double[]{
            174.0, 236.0,
            864.0, 926.0,
            174.0, 926.0});
      lowerLarge.setFill(Color.rgb(0,0,153));
      
      //creating square
      Polygon squareCover = new Polygon();
        squareCover.getPoints().addAll(new Double[]{
            200.0, 236.0,
            420.0, 250.0,
            439.76, 475.76,
            200.0, 475.76});
      squareCover.setFill(Color.CRIMSON);
      
      
      // Cover for upper crescent
      Polygon extraRedCover = new Polygon();
        extraRedCover.getPoints().addAll(new Double[]{
            174.0, 54.35,
            200.0, 0.0,
            870.0, 450.0,
            890.0, 501.47});
      extraRedCover.setFill(Color.WHITE);
      
      // to redeem the blue portion in the upper triangle
      Polygon redeemBlue = new Polygon();
        redeemBlue.getPoints().addAll(new Double[]{
            174.0, 54.35,
            200.0, 100.0,
            800.0, 475.76,
            890.0, 501.47});
      redeemBlue.setFill(Color.rgb(0,0,153)); 
      
      Group frameFlag = new Group(upperLarge, upperSmall, lowerLarge, lowerSmall, squareCover);      
      
      //Crescent Moon Object--------------------------------------------------
      
      //Top concave up arc (PNQ) Center L and radius LN
      Arc arcMoon1 = new Arc(350, 287.87, 132, 132, 0, 360);
      arcMoon1.setType(ArcType.OPEN);
      arcMoon1.setStroke(null);
      arcMoon1.setFill(Color.CRIMSON);
      arcMoon1.setStrokeWidth(1);
      arcMoon1.setType(ArcType.OPEN);
      
      //Bottom concave up arc (PZQ) Center M and radius MQ
      Arc arcMoon2 = new Arc(350, 335, 123, 123, 0, 360);
      arcMoon2.setType(ArcType.OPEN);
      arcMoon2.setStroke(null);
      arcMoon2.setFill(Color.WHITE);
      arcMoon2.setStrokeWidth(1);
      arcMoon2.setType(ArcType.OPEN);
      
      Arc arcMoon3 = new Arc(350, 392, 57, 57, -40, 250);
      arcMoon3.setType(ArcType.OPEN);
      arcMoon3.setStroke(null);
      arcMoon3.setFill(Color.WHITE);
      arcMoon3.setStrokeWidth(1);
      arcMoon3.setType(ArcType.OPEN);
      
      double xStart1 = 350;
      double yStart1 = 313;
      
      double xEndLeft1 = 350 + 27 * Math.sin(Math.toRadians(-30));
      double yEndLeft1 = 313 + 27 * Math.cos(Math.toRadians(-30));
 
      double xEndRight1 = 350 + 27 * Math.sin(Math.toRadians(30));
      double yEndRight1 = 313 + 27 * Math.cos(Math.toRadians(30));
      
      Polygon[] triangleMoon = new Polygon[10];
      
      Group moonTrianglesActual = new Group();
      for (int i=0; i<10; i++){
         triangleMoon[i] = new Polygon(xStart1, yStart1, xEndLeft1, yEndLeft1, xEndRight1, yEndRight1);
         triangleMoon[i].getTransforms().add(new Rotate(-101.25 + 22.5*i, 350, 392));
         triangleMoon[i].setFill(Color.WHITE);
         moonTrianglesActual.getChildren().add(triangleMoon[i]);
      }

      Group moon = new Group(arcMoon2, arcMoon1, moonTrianglesActual);
      
      
      // Sun Object---------------------------------------------------------
      
      //Sun 
      Arc sun1 = new Arc(350, 687.74, 82, 82, 0, 360);
      sun1.setType(ArcType.OPEN);
      sun1.setStroke(null);
      sun1.setFill(Color.WHITE);
      sun1.setStrokeWidth(1);
      sun1.setType(ArcType.OPEN);
      
      //Outside arc with radius LN
            
      double xStart = 350;
      double yStart = 558.87;
      
      double xEndLeft = 350 + 55 * Math.sin(Math.toRadians(-23));
      double yEndLeft = 558.87 + 55 * Math.cos(Math.toRadians(-23));
 
      double xEndRight = 350 + 55 * Math.sin(Math.toRadians(23));
      double yEndRight = 558.87 + 55 * Math.cos(Math.toRadians(23));
      
      Polygon[] triangleSun = new Polygon[12];
      
      Group sunTrianglesActual = new Group();
      for (int i=0; i<12; i++){
         triangleSun[i] = new Polygon(xStart, yStart, xEndLeft, yEndLeft, xEndRight, yEndRight);
         triangleSun[i].getTransforms().add(new Rotate(30*i,350, 687.74));
         triangleSun[i].setFill(Color.WHITE);
         sunTrianglesActual.getChildren().add(triangleSun[i]);
      }
      
      
      
      Group sun = new Group(sun1, sunTrianglesActual);
                            
      // Constitution for drawing Flag************************************************************************
      
      ImageView mountain = new ImageView(
        new Image("https://artproject.azurewebsites.net/images/constitution.png")
        );
        
      //Buttons and labels for changing the scenes************************************************************
      //Creating Buttons and Labels
      Label label2 = new Label("The Flag of Nepal according to 2015 Constitution...");
      Label label1 = new Label("The Geometry Behind the Flag of Nepal...");
      label1.setFont(new Font("Times New Roman", 30));
      label1.setLayoutX(250);
      label2.setFont(new Font("Times New Roman", 30));
      label2.setLayoutX(250);
      //label2.setLayoutX(300);
      
      Button button2 = new Button("See Geometry");
      button2.setFont(new Font("Times New Roman", 20));
      button2.setOnAction(e -> window.setScene(scene1));
      button2.setLayoutX(1054);
      button2.setLayoutY(950);
      
      Button button2a = new Button("See Constitution");
      button2a.setFont(new Font("Times New Roman", 20));
      button2a.setOnAction(e -> window.setScene(scene3));
      button2a.setLayoutX(1035);
      button2a.setLayoutY(910);
      
      ImageView goBackPic1 = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/goBack.png")
      );
      Button button1 = new Button("", goBackPic1);
      button1.setOnAction(e -> window.setScene(scene2));
      button1.setLayoutX(1145);
      button1.setLayoutY(950);
      
      Button button1a = new Button("See Constitution");
      button1a.setFont(new Font("Times New Roman", 20));
      button1a.setOnAction(e -> window.setScene(scene3));
      button1a.setLayoutX(1035);
      button1a.setLayoutY(910);
      
      ImageView goBackPic2 = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/goBack.png")
      );
      Button button3 = new Button("", goBackPic2);
      button3.setOnAction(e -> window.setScene(scene1));
      button3.setLayoutX(1145);
      button3.setLayoutY(950);     
      
      //Buttons and labels for providing the information***************************************************
      
      Label legend = new Label("Legend");
      legend.setFont(new Font("Times New Roman", 20));
      legend.setLayoutX(700);
      legend.setLayoutY(70);
      
      
      Label response = new Label();
      response.setFont(new Font("Times New Roman", 20));
      ImageView redPic = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/red.jpg")
      );
      ImageView bluePic = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/blue.png")
      );
      ImageView trianglePic = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/triangle.png")
      );
      ImageView sunPic = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/sun.png")
      );
      ImageView moonPic = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/moon.png")
      );
      ImageView goBackPic = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/goBack.png")
      );
      
      Button redPin = new Button("",redPic);
      redPin.setLayoutX(700);
      redPin.setLayoutY(100);
      
      Button bluePin = new Button("",bluePic);
      bluePin.setLayoutX(700);
      bluePin.setLayoutY(140);
      
      Button trianglePin = new Button("",trianglePic);
      trianglePin.setLayoutX(700);
      trianglePin.setLayoutY(180);
      
      Button sunPin = new Button("",sunPic);
      sunPin.setLayoutX(700);
      sunPin.setLayoutY(220);
      
      Button moonPin = new Button("",moonPic);
      moonPin.setLayoutX(700);
      moonPin.setLayoutY(260);
      
      Button redoPin = new Button("", goBackPic);
      redoPin.setLayoutX(700);
      redoPin.setLayoutY(300);
      
      Group pins = new Group(redPin, bluePin, trianglePin, sunPin, moonPin, redoPin);
      Group aestheticsActual = new Group();
      
      // handling the buttons for showing informations
      
      redPin.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        response.setText(" >> Color of Rhodondendron. Signifies bravery...");  
        response.setLayoutX(760);
        response.setLayoutY(110);
        }
      });
      bluePin.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        response.setText(" >> Signifies Peace and Harmony...");
        response.setLayoutX(760);
        response.setLayoutY(150);
        }
      });
      trianglePin.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        response.setText(" >> Represents the Himalayas...");
        response.setLayoutX(760);
        response.setLayoutY(190);
        }
      });
      sunPin.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        response.setText(" >> Signifies longivity and fierce resolve...");
        response.setLayoutX(760);
        response.setLayoutY(230);
        }
      });
      moonPin.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        response.setText(" >> Signifies calm demeanour and purity of spirit...");
        response.setLayoutX(760);
        response.setLayoutY(270);
        }
      });
      redoPin.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        response.setText(" ");
        response.setLayoutX(760);
        response.setLayoutY(310);
        }
      });
  
      //Putting the Signature on the flag**************************************************************
      
      ImageView signature1 = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/signature.png")
      );
      ImageView signature2 = new ImageView(
      new Image("https://artproject.azurewebsites.net/images/signature.png")
      );
      signature1.setLayoutX(600);
      signature1.setLayoutY(550);
      signature2.setLayoutX(600);
      signature2.setLayoutY(550);
                    
   
      // Putting everything Together************************************************************************************
      
      Group flagGeometry = new Group(AB, AC, BD, FG, CG, HI, arc1, arc2, RS, left, bottom,
                             UV, Sun1, Sun2, Middle, slantUp, slantDown, BBD, FFG, JK, JG,
                             O1, N1, T1, arc6, arc3, arc4, arc5, sunTriangles, moonTriangles,
                             button1, label1, FP, GQ, P1, Q1, Z1, W1, button1a, signature2);  
                             
      Group flagActual = new Group(frameFlag, sun, moon, extraRedCover, redeemBlue, arcMoon3,
                                   button2, label2, button2a, signature1);   
                                                 
      Group constitution = new Group(mountain, button3);      
           
      
      Group root1 = new Group(flagGeometry, geoLabels);
      Group root2 = new Group(flagActual, pins, response, legend);
      Group root3 = new Group(constitution);
      
      scene1 = new Scene(root1, 1200, 1000, Color.rgb(255,255,255)); 
      scene2 = new Scene(root2, 1200, 1000, Color.rgb(255,255,255));
      scene3 = new Scene(root3, 1200, 1000, Color.rgb(255,255,255));
      
      window.setScene(scene2);
      window.setTitle("ArtProjectRahul");
      window.show();
   }
  
   public static void main(String[] args)
   {
      launch(args);
   }
}