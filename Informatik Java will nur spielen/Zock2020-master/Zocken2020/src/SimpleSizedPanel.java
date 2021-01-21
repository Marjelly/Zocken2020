import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import util.ShowInFrame;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SimpleSizedPanel extends SizedPanel {

	static int posX;
	static int posY;

	static int graphicNumber = 3000;

	public void paintComponent(java.awt.Graphics g) {
		g.setColor(Color.green);

		Random Pos = new Random();
		for (int i = 0; i < graphicNumber; i++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}

		g.setColor(Color.red);
		for (int k = 0; k < graphicNumber; k++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}

		g.setColor(Color.blue);
		for (int k = 0; k < graphicNumber; k++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}

		g.setColor(Color.BLACK);
		for (int k = 0; k < graphicNumber; k++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}
		g.setColor(Color.yellow);
		for (int k = 0; k < graphicNumber; k++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}
		g.setColor(Color.MAGENTA);
		for (int k = 0; k < graphicNumber; k++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}
		g.setColor(Color.ORANGE);
		for (int k = 0; k < graphicNumber; k++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}
		g.setColor(Color.CYAN);
		for (int k = 0; k < graphicNumber; k++) {
			posY = Pos.nextInt(1000);
			posX = Pos.nextInt(8000);

			g.fillRect(posX, posY, 20, 20);

		}

		
		g.setColor(Color.black);
		String string = "Informatik";
		Font stringFont = new Font("ComicSans", Font.PLAIN, 300);
		g.setFont(stringFont);
       g.drawString(string, 300, 600);
	}

	public static void main(String[] args) {

		ShowInFrame.show(new SimpleSizedPanel());
	}

}
