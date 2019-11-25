package org.mql.spring.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.mql.spring.models.Field;

public class Form extends JPanel {
	private int labelWidth = 100;
	
	public Form() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	
	public void addField(Field field) {
		if (!field.getLabel().contains(":")) field.setLabel(field.getLabel() + ":");
		JLabel l1 = new JLabel(field.getLabel());
		l1.setPreferredSize(new Dimension(labelWidth, l1.getPreferredSize().height));
		JTextField t1 = new JTextField(field.getSize());
		if (field.getValue() != null) t1.setText(field.getValue().toString());
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(l1);
		p1.add(t1);
		add(p1);
	}
	
	public void setFields(List<Field> fields) {
		for (Field field : fields) {
			addField(field);
		}
	}

	public void setLabelWidth(int labelWidth) {
		this.labelWidth = labelWidth;
	}
}
