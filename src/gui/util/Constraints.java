package gui.util;

import javafx.scene.control.TextField;

public class Constraints {
	
	public static void setTextFieldInterger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

	
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, OldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(OldValue);
			}
		});
	}
	
	
	public static void setTextFieldeDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
	
	
}
