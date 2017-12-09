package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;



public class Controller_SeniorQuery {

    @FXML
    Button button_query;
    @FXML
    DatePicker datePicker_start;
    @FXML
    DatePicker datePicker_end;
    @FXML
    TextField textField_latitude_start;
    @FXML
    TextField textField_latitude_end;
    @FXML
    TextField textField_longitude_start;
    @FXML
    TextField textField_longitude_end;
    @FXML
    TextField textField_depth_start;
    @FXML
    TextField textField_depth_end;
    @FXML
    TextField textField_magnitude_start;
    @FXML
    TextField textField_magnitude_end;
    @FXML
    TableView earthQuakeTable;
    @FXML
    TableColumn tableColumn_magnitude;
    @FXML
    TableColumn tableColumn_Date;
    @FXML
    TableColumn tableColumn_latitude;
    @FXML
    TableColumn tableColumn_longitude;
    @FXML
    TableColumn tableColumn_depth;
    @FXML
    TableColumn tableColumn_region;

    public Controller_SeniorQuery(){

    }
    @FXML
    private void initialize() {
        tableColumn_magnitude.setCellValueFactory(cellData -> EarthQuakesTable.getMagnitude());

        tableColumn_Date.setCellValueFactory(cellData -> EarthQuakesTable.getDate());

        tableColumn_latitude.setCellValueFactory(cellData -> EarthQuakesTable.getLatitude());

        tableColumn_longitude.setCellValueFactory(cellData -> EarthQuakesTable.getLongitude());

        tableColumn_depth.setCellValueFactory(cellData -> EarthQuakesTable.getDepth());

        tableColumn_region.setCellValueFactory(cellData -> EarthQuakesTable.getRegion());

    }


    private static String start_year;
    private static String start_month;
    private static String start_day;
    private static String end_year;
    private static String end_month;
    private static String end_day;
    private static String start_latitude;
    private static String end_latitude;
    private static String start_longitude;
    private static String end_longitude;
    private static String start_depth;
    private static String end_depth;
    private static String start_magnitude;
    private static String end_magnitude;


    private String getStart_Date() {
        return datePicker_start.getEditor().getText().trim();
    }

    private String getEnd_Date() {
        return datePicker_end.getEditor().getText().trim();
    }

    private String getStart_latitude() {
        return textField_latitude_start.getText().trim();
    }

    private String getEnd_latitude() {
        return textField_latitude_end.getText().trim();
    }

    private String getStart_longitude() {
        return textField_longitude_start.getText().trim();
    }

    private String getEnd_longitude() {
        return textField_longitude_end.getText().trim();
    }

    private String getStart_depth() {
        return textField_depth_start.getText().trim();
    }

    private String getEnd_depth() {
        return textField_depth_end.getText().trim();
    }

    private String getStart_magnitude() {
        return textField_magnitude_start.getText().trim();
    }

    private String getEnd_magnitude() {
        return textField_magnitude_end.getText().trim();
    }


    private void setStartDate(String date) {
        String[] startDate = date.split("-");
        start_year = startDate[0];
        start_month = startDate[1];
        start_day = startDate[2];
    }

    private void setEndDate(String date) {
        String[] endDate = date.split("-");
        end_year = endDate[0];
        end_month = endDate[1];
        end_day = endDate[2];
    }

    public void onButtonQuery() {
        setStartDate(!getStart_Date().equals("") ? getStart_Date() : "2017-01-01");
        setEndDate(!getEnd_Date().equals("") ? getEnd_Date() : "2017-12-12");
        start_latitude = !getStart_latitude().equals("") ? getStart_latitude() : "-90";
        end_latitude = !getEnd_latitude().equals("") ? getEnd_latitude() : "90";
        start_longitude = !getStart_longitude().equals("") ? getStart_longitude() : "-180";
        end_longitude = !getEnd_longitude().equals("") ? getEnd_longitude() : "180";
        start_depth = !getStart_depth().equals("") ? getStart_depth() : "0";
        end_depth = !getEnd_depth().equals("") ? getEnd_depth() : "1000";
        start_magnitude = !getStart_magnitude().equals("") ? getStart_magnitude() : "0";
        end_magnitude = !getEnd_magnitude().equals("") ? getEnd_magnitude() : "10";


    }
    static class EarthQuakesTable {
        private  static String magnitude ;
        private  static String Date ;
        private  static String latitude ;
        private  static String longitude ;
        private  static String depth ;
        private  static String region ;
        EarthQuakesTable(){
            this.magnitude = "test ";
            this.Date = "test ";
            this.latitude = "test";
            this.longitude = "test";
            this.depth = " test";
            this.region = "test";
        }

        static String getMagnitude(){
            return magnitude;
        }

        static String getDate() {
            return Date;
        }

        static String getLatitude() {
            return latitude;
        }

        static String getLongitude() {
            return longitude;
        }

        static String getDepth() {
            return depth;
        }

        static String getRegion() {
            return region;
        }

    }


}
