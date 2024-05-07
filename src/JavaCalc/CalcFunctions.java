package JavaCalc;

import java.awt.event.ActionEvent;

public class CalcFunctions {
	
	private String operators = "";
	private double num1 = 0;
	private double num2 = 0;
	private double result = 0;
	
	public void btnZero(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "0");
		} else {
			UI.getDisplay().setText("0");
		}
	}
	
	public void btnOne(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "1");
		} else {
			UI.getDisplay().setText("1");
		}
	}
	
	public void btnTwo(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "2");
		} else {
			UI.getDisplay().setText("2");
		}
	}
	
	public void btnThree(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "3");
		} else {
			UI.getDisplay().setText("3");
		}
	}
	
	public void btnFour(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "4");
		} else {
			UI.getDisplay().setText("4");
		}
	}
	
	public void btnFive(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "5");
		} else {
			UI.getDisplay().setText("5");
		}
	}
	
	public void btnSix(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "6");
		} else {
			UI.getDisplay().setText("6");
		}
	}
	
	public void btnSeven(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "7");
		} else {
			UI.getDisplay().setText("7");
		}
	}
	
	public void btnEight(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "8");
		} else {
			UI.getDisplay().setText("8");
		}
	}
	
	public void btnNine(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.equals("0")) & !(num.equals(String.valueOf(result)))) {
			UI.getDisplay().setText(num + "9");
		} else {
			UI.getDisplay().setText("9");
		}
	}
	
	public void btnC(ActionEvent actionEvent) {
		UI.getDisplay().setText("0");
		result = 0;
		num1 = 0;
		num2 = 0;
		operators = "";
	}
	
	public void btnPercent(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.endsWith(" % ")) & !(num.equals(""))) {
			num1 = Double.parseDouble(UI.getDisplay().getText());
			UI.getDisplay().setText("");
			operators = "%";
		}
	}
	
	public void btnMinus(ActionEvent actionEvent) { 
		String num = UI.getDisplay().getText();
		if(!(num.endsWith(" - ")) & !(num.equals(""))) {
			num1 = Double.parseDouble(UI.getDisplay().getText());
			UI.getDisplay().setText("");
			operators = "-";
		}
	}
	
	public void btnPlus(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.endsWith(" + ")) & !(num.equals(""))) {
			num1 = Double.parseDouble(UI.getDisplay().getText());
			UI.getDisplay().setText("");
			operators = "+";
			if(!(operators.equals(""))) {
				
			}
		}
	}
	
	public void btnTimes(ActionEvent actionEvent) { 
		String num = UI.getDisplay().getText();
		if(!(num.endsWith(" * ")) & !(num.equals(""))) {
			num1 = Double.parseDouble(UI.getDisplay().getText());
			UI.getDisplay().setText("");
			operators = "*";
		}
	}
	
	public void btnDivide(ActionEvent actionEvent) { 
		String num = UI.getDisplay().getText();
		if(!(num.endsWith(" / ")) & !(num.equals(""))) {
			num1 = Double.parseDouble(UI.getDisplay().getText());
			UI.getDisplay().setText("");
			operators = "/";
		}
	}
	
	public void btnEquals(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		num2 = Double.parseDouble(num);
		calculate(num);
	}
	
	public void btnDot(ActionEvent actionEvent) {
		String num = UI.getDisplay().getText();
		if(!(num.contains("."))) {
			UI.getDisplay().setText(num + ".");
		}
	}
	
	public void calculate(String num) {
		
		switch(operators) {
		case "+": 
			result = num1 + num2;
			System.out.println(num1 + "  " + num2);
			num = String.valueOf(result);
			UI.getDisplay().setText(num);
			num1 = 0;
			num2 = 0;
			operators = "";
			break;
			
		case "-":
			result = num1 - num2;
			num = String.valueOf(result);
			UI.getDisplay().setText(num);
			num1 = 0;
			num2 = 0;
			operators = "";
			break;
		
		case "*":
			result = num1 * num2;
			num = String.valueOf(result);
			UI.getDisplay().setText(num);
			num1 = 0;
			num2 = 0;
			operators = "";
			break;
			
		case "/":
			result = num1 / num2;
			num = String.valueOf(result);
			UI.getDisplay().setText(num);
			num1 = 0;
			num2 = 0;
			operators = "";
			break;
			
		case "%": 
			result = (num1 / 100) * num2;
			num = String.valueOf(result);
			UI.getDisplay().setText(num);
			num1 = 0;
			num2 = 0;
			operators = "";
			break;
		}
	}
	
}

