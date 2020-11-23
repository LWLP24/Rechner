import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class main extends Applet implements ActionListener {
	
	TextField erster = new TextField(10);
	TextField zweiter = new TextField(10);
	TextField w = new TextField(10);
	Button plus = new Button("+");
	Button minus = new Button("-");
	Button mal = new Button("*");
	Button geteilt = new Button(":");
	Button wurzel = new Button("Wu");
	Label Ergebnis = new Label("Ergebnis:                                 ");
	Label ErgebnisW = new Label("ErgebnisWurzel:                                 ");
	double ausgabe;
	
	
	public void init() {
		
		setSize(500, 500);
		
		
		
		add(erster);
		add(zweiter);
		add(plus);
		add(minus);
		add(mal);
		add(geteilt);
		add(wurzel);
		add(Ergebnis);
		add(ErgebnisW);
		add(w);
		
		plus.addActionListener(this);
		minus.addActionListener(this);
		mal.addActionListener(this);
		geteilt.addActionListener(this);
		wurzel.addActionListener(this);

		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == plus) {
			ausgabe = Double.parseDouble(erster.getText()) + Double.parseDouble(zweiter.getText());
			Ergebnis.setText("Ergebnis: " + String.valueOf(ausgabe));
			
		}
		if(e.getSource() == minus) {
			ausgabe = Double.parseDouble(erster.getText()) - Double.parseDouble(zweiter.getText());
			Ergebnis.setText("Ergebnis: " + String.valueOf(ausgabe));

		}
		if(e.getSource() == mal) {
			ausgabe = Double.parseDouble(erster.getText()) * Double.parseDouble(zweiter.getText());
			Ergebnis.setText("Ergebnis: " + String.valueOf(ausgabe));
	}
		if(e.getSource() == geteilt) {
			ausgabe = Double.parseDouble(erster.getText()) / Double.parseDouble(zweiter.getText());
			Ergebnis.setText("Ergebnis: " + String.valueOf(ausgabe));
	}
		if(e.getSource() == wurzel) {
			ausgabe = Math.sqrt(Double.parseDouble(w.getText()));
			ErgebnisW.setText("ErgebnisWurzel: " + String.valueOf(ausgabe));
		}
	}
}
	
