/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Mauricio10
 */
public class Project2Controller implements Initializable {

    @FXML
    private Button btnMuseum;
    @FXML
    private Button btnRooms;
    @FXML
    private Button btnViewRooms;
    @FXML
    private Button btnThematics;
    @FXML
    private Button btnPricesSell;
    @FXML
    private Button btnEntrance;
    @FXML
    private AnchorPane ID_BestAndWorstRooms;
    @FXML
    private ListView<?> txtBAndWroomsBestRooms;
    @FXML
    private ListView<?> txtBAndWRoomsWorstRooms;
    @FXML
    private Button btnBAndWRoomsCreatePDF;
    @FXML
    private AnchorPane ID_TotalRoomValoration;
    @FXML
    private ImageView imgTotalRoomValorationStar;
    @FXML
    private TextArea txtTotalRoomValorationNumber;
    @FXML
    private AnchorPane ID_RoomValoration;
    @FXML
    private Button btnRoomValoration1Star;
    @FXML
    private Button btnRoomValoration2Star;
    @FXML
    private Button btnRoomValoration3Star;
    @FXML
    private Button btnRoomValoration4Star;
    @FXML
    private Button btnRoomValoration5Star;
    @FXML
    private TextField txtRoomValorationObservation;
    @FXML
    private Button btnRoomValorationSubmit;
    @FXML
    private ImageView imgRoomValorationStar;
    @FXML
    private Button btnRoomValorationGeneralValoration;
    @FXML
    private AnchorPane ID_RoomCardFX;
    @FXML
    private Button btnRoomCardLeft;
    @FXML
    private Button btnRoomCardRight;
    @FXML
    private TextArea txtRoomCardSpeciesName;
    @FXML
    private TextArea txtRoomCardThematicName;
    @FXML
    private ImageView imgRoomCardSpecies;
    @FXML
    private ImageView imgRoomCardThematic;
    @FXML
    private Button btnRoomCardNext;
    @FXML
    private AnchorPane ID_EntranceFX;
    @FXML
    private Button btnEntranceChooseTicket;
    @FXML
    private ImageView imgEntranceTicket;
    @FXML
    private TextArea txtEntranceAccess;
    @FXML
    private DatePicker dateEntranceDate;
    @FXML
    private AnchorPane ID_PricesAndSellQRTicket;
    @FXML
    private ImageView imgPricesAndSellQREntrance;
    @FXML
    private Button btnPricesAndSellPDFReport;
    @FXML
    private AnchorPane ID_PricesAndSellFX;
    @FXML
    private DatePicker datePricesDate;
    @FXML
    private ImageView imgPricesRoom;
    @FXML
    private Button btnPricesLeftButton;
    @FXML
    private Button btnPricesRightButton;
    @FXML
    private Button btnPricesChooseButton;
    @FXML
    private TextArea txtPricesTotalPrice;
    @FXML
    private TextArea txtPriceRoomChooseName;
    @FXML
    private TextArea txtPricesRoomPrice;
    @FXML
    private TextArea txtPricesRoomDescription;
    @FXML
    private ComboBox<?> txtPricesKeyCard;
    @FXML
    private TextArea txtPricesComission;
    @FXML
    private Button btnPricesBuyEntrance;
    @FXML
    private AnchorPane ID_Thematics;
    @FXML
    private TextField txtThematicName;
    @FXML
    private TextField txtThematicCharacteristics;
    @FXML
    private ImageView imgThematicPhoto;
    @FXML
    private Button btnUploadThematic;
    @FXML
    private DatePicker dateThematicEra;
    @FXML
    private TextArea txtRoomNameFromRooms;
    @FXML
    private AnchorPane ID_VRoomsCollectionSpecies;
    @FXML
    private TableView<?> tabVRSpeciesData;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesScientificName;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesCommonName;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesExtinctionDaate;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesEraLived;
    @FXML
    private TableView<?> tabVRSpeciesData2;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesWeight;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesHeight;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesCharacteristics;
    @FXML
    private TableColumn<?, ?> sTabVRSpeciesImage;
    @FXML
    private Button btnVRSpeciesAddSpecie;
    @FXML
    private Button btnVRSpeciesBackToCollections;
    @FXML
    private Button btnVRSpeciesBackToRooms;
    @FXML
    private AnchorPane ID_VRoomCollection;
    @FXML
    private TableView<?> tabVRCollectionList;
    @FXML
    private TableColumn<?, ?> sTabCollectionName;
    @FXML
    private TableColumn<?, ?> sTabCollectionEra;
    @FXML
    private TableColumn<?, ?> sTabCollectionDescription;
    @FXML
    private Button btnVRCollectionAddCollection;
    @FXML
    private Button btnVRCollectionSpecies;
    @FXML
    private Button btnVRCollectionBacktoRooms;
    @FXML
    private AnchorPane ID_ViewRoomFX;
    @FXML
    private Button btnVRoomCollection;
    @FXML
    private TableView<?> tabRoomData;
    @FXML
    private TableColumn<?, ?> sTabRoomName;
    @FXML
    private TableColumn<?, ?> sTabRoomDescription;
    @FXML
    private TableColumn<?, ?> sTabRoomQR;
    @FXML
    private AnchorPane ID_SpeciesFX;
    @FXML
    private TextField txtScientificSpeciesName;
    @FXML
    private TextField txtCommonSpeciesName;
    @FXML
    private TextField txtSpeciesExtinctionDate;
    @FXML
    private TextField txtSpeciesWeight;
    @FXML
    private TextField txtSpeciesHeight;
    @FXML
    private TextField txtSpeciesCharacteristic;
    @FXML
    private ImageView imgSpeciesPhoto;
    @FXML
    private Button btnRoomUpload;
    @FXML
    private DatePicker dateSpeciesEraLived;
    @FXML
    private AnchorPane ID_CollectionFX;
    @FXML
    private TextField txtCollectionName;
    @FXML
    private TextField txtCollectionDescription;
    @FXML
    private Button btnCollectionNext;
    @FXML
    private DatePicker dateCollectionEra;
    @FXML
    private AnchorPane ID_RoomFX;
    @FXML
    private Button btnNextRoomData;
    @FXML
    private TextField txtRoomName;
    @FXML
    private TextField txtRoomDescription;
    @FXML
    private ImageView imgRoomCreationQR;
    @FXML
    private Button btnNoExhibitionRoom;
    @FXML
    private AnchorPane ID_MuseumFX;
    @FXML
    private TextField txtMuseumName;
    @FXML
    private TextField txtMuseumType;
    @FXML
    private TextField txtMuseumLocation;
    @FXML
    private TextField txtMuseumDirectorName;
    @FXML
    private TextField txtMuseumWebSite;
    @FXML
    private Button btnMuseumUpload;
    @FXML
    private DatePicker dateMuseumFoundationDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
