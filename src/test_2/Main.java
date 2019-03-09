package test_2;

import java.io.InputStream;

import java.util.Date;
import java.lang.Thread;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.*;

public class Main {
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Display display = new Display();

		Shell shell = new Shell(display);

		shell.setSize(500, 700);

		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		rowLayout.spacing = 10;
		rowLayout.marginLeft = 10;
		rowLayout.marginTop = 10;
		shell.setLayout(rowLayout);

		String label = "CAT CAT CAT";
		StringBuilder string = new StringBuilder(label);
		shell.setText(string.toString());
		


		// FIRST TASK

		Group group1 = new Group(shell, SWT.SHADOW_IN);
		group1.setText("FIRST TASK");
		group1.setLayout(new RowLayout(SWT.VERTICAL));

		Text text = new Text(group1, SWT.BORDER);
		RowData layoutData = new RowData();
		layoutData.width = 200;

		text.setLayoutData(layoutData);
		text.setText("");

		Button button = new Button(group1, SWT.NONE);
		button.setText("MAKE SOME MAGIC");

		Combo combo = new Combo(group1, SWT.DROP_DOWN | SWT.READ_ONLY);

		button.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {

				String[] itemset = combo.getItems();
				for (int i = 0; i < itemset.length; i++) {
					if (itemset[i].contains(text.getText())) {
						MessageBox warning1 = new MessageBox(shell, SWT.COLOR_RED);
						warning1.setMessage("Enter something else");
						warning1.open();
						return;
					}
				}
				combo.add(text.getText());
			}

		});

		// SECOND TASK

		Group group2 = new Group(shell, SWT.SHADOW_IN);
		group2.setText("SECOND TASK");
		group2.setLayout(new RowLayout(SWT.VERTICAL));

		Text text1 = new Text(group2, SWT.BORDER);
		RowData layoutData1 = new RowData();
		layoutData1.width = 200;

		text1.setLayoutData(layoutData1);
		text1.setText("");

		Button button2 = new Button(group2, SWT.NONE);
		button2.setText("NOTHING TO DO HERE");

		Button button22 = new Button(group2, SWT.NONE);
		button22.setText("JUST SWAP IT!");

		button2.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {
				button22.setText(text1.getText());
			}

		});

		button22.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {

				String firstText = String.valueOf(button2.getText());
				String secondText = String.valueOf(button22.getText());

				button2.setText(secondText);
				button22.setText(firstText);
			}

		});

		// THIRD TASK

		Group group3 = new Group(shell, SWT.SHADOW_IN);
		group3.setText("THIRD TASK");
		group3.setLayout(new RowLayout(SWT.VERTICAL));

		Text text11 = new Text(group3, SWT.BORDER);
		RowData layoutData11 = new RowData();
		layoutData11.width = 200;

		text11.setLayoutData(layoutData11);
		text11.setText("");

		Button button11 = new Button(group3, SWT.NONE);
		button11.setText("CHECK IT ONCE");

		Button button31 = new Button(group3, SWT.RADIO);
		button31.setText("Smith1");

		Button button32 = new Button(group3, SWT.RADIO);
		button32.setText("Smith2");

		Button button33 = new Button(group3, SWT.RADIO);
		button33.setText("Smith3");

		button11.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {

				if (button31.getText().equals(text11.getText())) {
					button31.setSelection(true);
					button32.setSelection(false);
					button33.setSelection(false);
				} else {
					if (button32.getText().equals(text11.getText())) {
						button31.setSelection(false);
						button32.setSelection(true);
						button33.setSelection(false);
					} else {
						if (button33.getText().equals(text11.getText())) {
							button31.setSelection(false);
							button32.setSelection(false);
							button33.setSelection(true);
						} else {
							MessageBox warning1 = new MessageBox(shell, SWT.COLOR_RED);
							warning1.setMessage("Why do you persist, Mr.Anderson?");
							warning1.open();
						}
					}
				}
			}
		});

		// FOURTH TASK

		Group group4 = new Group(shell, SWT.SHADOW_IN);
		group4.setText("FOURTH TASK");
		group4.setLayout(new RowLayout(SWT.VERTICAL));

		Text text41 = new Text(group4, SWT.BORDER);
		RowData layoutData41 = new RowData();
		layoutData41.width = 200;

		text41.setLayoutData(layoutData41);
		text41.setText("");

		Button button4 = new Button(group4, SWT.NONE);
		button4.setText("CHECK IT ONE MORE TIME");

		Button button41 = new Button(group4, SWT.CHECK);
		button41.setText("Frodo");

		Button button42 = new Button(group4, SWT.CHECK);
		button42.setText("Aragorn");

		Button button43 = new Button(group4, SWT.CHECK);
		button43.setText("Legolas");

		button4.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {

				if (button41.getText().equals(text41.getText())) {
					button41.setSelection(!button41.getSelection());
				} else {
					if (button42.getText().equals(text41.getText())) {
						button42.setSelection(!button42.getSelection());
					} else {
						if (button43.getText().equals(text41.getText())) {
							button43.setSelection(!button43.getSelection());
						} else {
							MessageBox warning1 = new MessageBox(shell, SWT.COLOR_RED);
							warning1.setMessage("YOU SHALL NOT PASS!");
							warning1.open();
						}
					}
				}
			}
		});

		// FIFTH TASK

		Group group5 = new Group(shell, SWT.SHADOW_IN);
		group5.setText("FIFTH TASK");
		group5.setLayout(new RowLayout(SWT.VERTICAL));

		Text text5 = new Text(group5, SWT.BORDER);
		RowData layoutData5 = new RowData();
		layoutData5.width = 200;

		text5.setLayoutData(layoutData5);
		text5.setText("");

		Button button5 = new Button(group5, SWT.NONE);
		button5.setText("ADD INFO");

		Button button6 = new Button(group5, SWT.NONE);
		button6.setText("SWAP IT TO THE STARS");

		Button button7 = new Button(group5, SWT.NONE);
		button7.setText("AND BACK AGAIN");

		final Table table = new Table(group5, SWT.NONE);
		RowData layoutTable = new RowData();
		layoutTable.width = 180;
		layoutTable.height = 300;
		table.setLayoutData(layoutTable);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		TableColumn tableColumnFirst = new TableColumn(table, SWT.NONE);
		TableColumn tableColumnSecond = new TableColumn(table, SWT.NONE);
		tableColumnFirst.setText("first gollum");
		tableColumnSecond.setText("second gollum");
		tableColumnFirst.setWidth(100);
		tableColumnSecond.setWidth(100);
		table.getColumn(0);
		table.getColumn(1);

		button5.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {

				TableItem item = new TableItem(table, SWT.NONE);
				if (text5.getText().isEmpty()) {
					return;
				}
				item.setText(0, text5.getText());

			}

		});

		button6.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {

				TableItem item = table.getSelection()[0];
				if (item.getText(0).isEmpty()) {
					return;
				}
				item.setText(1, item.getText(0));
				item.setText(0, "");

			}
		});

		button7.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent arg0) {

				TableItem item1 = table.getSelection()[0];
				if (item1.getText(1).isEmpty()) {
					return;
				}
				item1.setText(0, item1.getText(1));
				item1.setText(1, "");

			}
		});
		

		
		shell.open();

		
		Thread thread = createThread1(display, shell);
		thread.start();
		
		// Обработка закрытия окна
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		// освобождение ресурсов окна
		display.dispose();
		


	}
	
	static boolean isRunning = true;
	static int count = 0;
	
	private static Thread createThread1(Display display, Shell shell){
        return new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){
                while (isRunning) {
                    display.syncExec(() -> {
                        try {
                        	if(count < 40) {
                        		String str = shell.getText();
                            	shell.setText(" " + str);
                            	count++;
                        	}
                        	else {
                        		count = 0;
                        		shell.setText("CAT CAT CAT");
                        	}
                        	
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                }
            }
        });
    }

}
