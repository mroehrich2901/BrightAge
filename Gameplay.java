import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene ;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage ;

import java.util.concurrent.atomic.AtomicReference;

public class Gameplay extends Application {

    Stage brightAge;
    Scene welcomeScene, skillsDescriptions, raceSelect, signSelect, nameSelect;
    
    String characterRace = null ;
    String characterSign = null ;
    String characterName = null ;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        brightAge = primaryStage;
        brightAge.setTitle("BrightAge");
        brightAge.setHeight(500);
        brightAge.setWidth(500);

        // Welcome Scene

        Label title = new Label("BrightAge");
        title.getStyleClass().add("title-label") ;

        Button start = new Button("Start");
        start.setOnAction(e -> primaryStage.setScene(skillsDescriptions));

        VBox welcomeComponents = new VBox(50,title, start);
        welcomeComponents.setAlignment(Pos.CENTER);

        welcomeScene = new Scene(welcomeComponents);
        welcomeScene.getStylesheets().add("BrightAgeStylesheet.css") ;


        // Skills Description Scene

        Label skillsDescriptionLabel = new Label("Your character will have skill ratings for certain attributes."
                + " Here is a list of these attributes:");

        MenuItem lightWarriorDescription = new MenuItem("The Light Warrior skill determines your strength handling" +
                " light warrior weapons and armor.");
        MenuButton lightWarrior = new MenuButton("Light Warrior", null, lightWarriorDescription);
        lightWarrior.setPopupSide(Side.RIGHT);

        MenuItem heavyWarriorDescription = new MenuItem("The Heavy Warrior skill determines your strength handling" +
                " heavy warrior weapons and armor.");
        MenuButton heavyWarrior = new MenuButton("Heavy Warrior", null, heavyWarriorDescription);
        heavyWarrior.setPopupSide(Side.RIGHT);

        MenuItem archeryDescription = new MenuItem("The Archery skill determines your strength in archery based combat.");
        MenuButton archery = new MenuButton("Archery", null, archeryDescription);
        archery.setPopupSide(Side.RIGHT);

        MenuItem smithDescription = new MenuItem("The Smith skill determines your strength in forging weapons and armor.");
        MenuButton smith = new MenuButton("Smith", null, smithDescription);
        smith.setPopupSide(Side.RIGHT);

        MenuItem magicDescription = new MenuItem("The Magic skill determines your strength in mana preservation while casting spells.");
        MenuButton magic = new MenuButton("Magic", null, magicDescription);
        magic.setPopupSide(Side.RIGHT);

        MenuItem alchemyDescription = new MenuItem("The Alchemy skill determines your strength in concocting potions and cooking food.");
        MenuButton alchemy = new MenuButton("Alchemy", null, alchemyDescription);
        alchemy.setPopupSide(Side.RIGHT);

        VBox skillsDescriptionMenu = new VBox(40,lightWarrior, heavyWarrior, archery, smith, magic, alchemy);

        Button selectRaceButton = new Button("Select Race");
        selectRaceButton.setOnAction(e -> primaryStage.setScene(raceSelect));

        BorderPane skillsDescriptionPane = new BorderPane();
        skillsDescriptionPane.setTop(skillsDescriptionLabel);
        skillsDescriptionPane.setLeft(skillsDescriptionMenu);
        skillsDescriptionPane.setRight(selectRaceButton);

        skillsDescriptions = new Scene(skillsDescriptionPane);
        skillsDescriptions.getStylesheets().add("BrightAgeStylesheet.css") ;


        // Race Select Scene

        Label raceSelectLabel = new Label("Select your race: ");

        Button signSelectButton = new Button("Select Sign");
        signSelectButton.setOnAction(e -> primaryStage.setScene(signSelect));
        signSelectButton.setOnAction( e-> System.out.println(characterRace));

        MenuItem manDescription = new MenuItem("Men are skilled in the light warrior and archery attributes.");
        MenuButton man = new MenuButton("Man", null, manDescription);
        man.setPopupSide(Side.RIGHT);
        man.setOnMouseClicked(e -> characterRace = "Man");


        MenuItem ancientElfDescription = new MenuItem("Ancient elves are the oldest and most historic race. " +
                "They are skilled in the magic and alchemy attributes.");
        MenuButton ancientElf = new MenuButton("Ancient Elf", null, ancientElfDescription);
        ancientElf.setPopupSide(Side.RIGHT);
        ancientElf.setOnMouseClicked(e -> characterRace = "Ancient Elf");


        MenuItem woodElfDescription = new MenuItem("Wood elves are the descendants of men and ancient elves. " +
                "They are skilled in the archery and alchemy attributes.");
        MenuButton woodElf = new MenuButton("Wood Elf", null, woodElfDescription);
        woodElf.setPopupSide(Side.RIGHT);
        woodElf.setOnMouseClicked(e -> characterRace = "Wood Elf");

        MenuItem dwarfDescription = new MenuItem("Dwarves are mountain dwellers skilled in the heavy warrior and smithing arttributes.");
        MenuButton dwarf = new MenuButton("Dwarf", null, dwarfDescription);
        dwarf.setPopupSide(Side.RIGHT);
        dwarf.setOnMouseClicked(e -> characterRace = "Dwarf");

        MenuItem orcDescription = new MenuItem("Orcs are skilled in the heavy warrior and light warrior attributes.");
        MenuButton orc = new MenuButton("Orc", null, orcDescription);
        orc.setPopupSide(Side.RIGHT);
        orc.setOnMouseClicked(e -> characterRace = "Orc");

        
        VBox raceSelectMenu = new VBox(60, man, ancientElf, woodElf, dwarf, orc);

        BorderPane raceSelectPane = new BorderPane();
        raceSelectPane.setTop(raceSelectLabel);
        raceSelectPane.setLeft(raceSelectMenu);

        manDescription.setOnAction(e -> raceSelectPane.setRight(signSelectButton));
        ancientElfDescription.setOnAction(e -> raceSelectPane.setRight(signSelectButton));;
        woodElfDescription.setOnAction(e -> raceSelectPane.setRight(signSelectButton));
        dwarfDescription.setOnAction(e -> raceSelectPane.setRight(signSelectButton));
        orcDescription.setOnAction(e -> raceSelectPane.setRight(signSelectButton));

        raceSelect = new Scene(raceSelectPane);
        raceSelect.getStylesheets().add("BrightAgeStylesheet.css") ;

        //Sign Select Scene

        Label signSelectLabel = new Label("Select your sign: ") ;

        Button nameSelectButton = new Button("Select Name");
        nameSelectButton.setOnAction(e -> primaryStage.setScene(nameSelect));

        MenuItem bodyguardDescription = new MenuItem("Those born under the sign of the Bodyguard are additionally skilled in" +
                " the light warrior attribute.") ;
        MenuButton bodyguard = new MenuButton("Bodyguard", null, bodyguardDescription) ;
        bodyguard.setPopupSide(Side.RIGHT);
        bodyguard.setOnMouseClicked(e -> characterSign = "Bodygyard");


        MenuItem warriorDescription = new MenuItem("Those born under the sign of the Warrior are additionally skilled in" +
                " the heavy warrior attribute.") ;
        MenuButton warrior = new MenuButton("Warrior", null, warriorDescription) ;
        warrior.setPopupSide(Side.RIGHT);
        warrior.setOnMouseClicked(e -> characterSign = "Warrior");


        MenuItem hunterDescription = new MenuItem ("Those born under the sign of the Hunter are additionally skilled in" +
                " the Archery attribute.") ;
        MenuButton hunter = new MenuButton("Hunter", null, hunterDescription) ;
        hunter.setPopupSide(Side.RIGHT);
        hunter.setOnMouseClicked(e -> characterSign = "Hunter");


        MenuItem craftsmanDescription = new MenuItem("Those born under the sign of the Craftsman are additionally skilled in" +
                " the Smith attribute.") ;
        MenuButton craftsman = new MenuButton("Craftsman", null, craftsmanDescription) ;
        craftsman.setPopupSide(Side.RIGHT);
        craftsman.setOnMouseClicked(e -> characterSign = "Craftsman");


        MenuItem mageDescription = new MenuItem("Those born under the sign of the Mage are additionally skilled in" +
                " the Mage attribute.") ;
        MenuButton mage = new MenuButton("Mage", null, mageDescription) ;
        mage.setPopupSide(Side.RIGHT);
        mage.setOnMouseClicked(e -> characterSign = "Mage");


        MenuItem scholarDescription = new MenuItem("Those born under the sign of the Scholar are additionally skilled in" +
                " the Alchemy attribute.") ;
        MenuButton scholar = new MenuButton("Scholar", null, scholarDescription) ;
        scholar.setPopupSide(Side.RIGHT);
        scholar.setOnMouseClicked(e -> characterSign = "Scholar");


        VBox signSelectMenu = new VBox(40, bodyguard, warrior, hunter, craftsman, mage, scholar);

        BorderPane signSelectPane = new BorderPane() ;
        signSelectPane.setTop(signSelectLabel);
        signSelectPane.setLeft(signSelectMenu);

        bodyguardDescription.setOnAction(e -> signSelectPane.setRight(nameSelectButton));
        warriorDescription.setOnAction(e -> signSelectPane.setRight(nameSelectButton));
        hunterDescription.setOnAction(e -> signSelectPane.setRight(nameSelectButton));
        craftsmanDescription.setOnAction(e -> signSelectPane.setRight(nameSelectButton));
        mageDescription.setOnAction(e -> signSelectPane.setRight(nameSelectButton));
        scholarDescription.setOnAction(e -> signSelectPane.setRight(nameSelectButton));

        signSelect = new Scene (signSelectPane);
        signSelect.getStylesheets().add("BrightAgeStylesheet.css") ;

        //Name Select Scene

        Label nameLabel = new Label("Name: ") ;

        TextField nameInput = new TextField() ;
        nameInput.setMaxWidth(200);
        nameInput.setPrefWidth(200);

        Button setName = new Button("Set Name");
        setName.setOnMouseClicked(e -> characterName = nameInput.getText());

        VBox nameSelectComponents = new VBox(nameLabel, nameInput, setName) ;

        BorderPane nameSelectPane = new BorderPane () ;
        nameSelectPane.setCenter(nameSelectComponents);

        nameSelect = new Scene(nameSelectPane) ;
        nameSelect.getStylesheets().add("BrightAgeStylesheet.css") ;

        brightAge.setScene(welcomeScene);
        brightAge.show();




    }

}

