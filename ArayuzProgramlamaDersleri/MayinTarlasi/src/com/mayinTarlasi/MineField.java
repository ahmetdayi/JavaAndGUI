package com.mayinTarlasi;

import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;

public class MineField implements MouseListener {
	JFrame jF;
	Btns[][] board = new Btns[10][10];
	int openbutton;
	public MineField() {
		openbutton = 0;
		jF = new JFrame();
		jF.setSize(800, 800);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jF.setLayout(new GridLayout(10, 10));

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				Btns btn = new Btns(row, col);
				btn.addMouseListener(this);
				jF.add(btn);
				board[row][col] = btn;
			}
		}

		generateMine();
		updateCount();
		//print();

		jF.setVisible(true);
	}

	public void generateMine() {
		int i = 0;

		while (i < 10) {
			int randRow = (int) (Math.random() * board.length);
			int randCol = (int) (Math.random() * board[0].length);
			while (board[randRow][randCol].isMine()) {
				randRow = (int) (Math.random() * board.length);
				randCol = (int) (Math.random() * board[0].length);
			}
			board[randRow][randCol].setMine(true);
			i++;
		}
	}

	public void print() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col].isMine()) {
					board[row][col].setIcon(new ImageIcon("src/mine.png"));
				}else {
					board[row][col].setText(board[row][col].getCount() +"");//ordaký týrnak ýsaretý countu strýng olarak gormesý ýcýn koyduk .
				board[row][col].setEnabled(false);}
			}
		}

	}

	public void updateCount() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col].isMine()) {
					counting(row, col);
				}
			}
		}
	}

	public void counting(int row, int col) {
		
			for (int i = row - 1; i <= row + 1; i++) {
				for (int k = col - 1; k <= col + 1; k++) {
					try {
						int value = board[i][k].getCount();
						board[i][k].setCount(++value);
					}catch(Exception e) {
						
					}
					
				}
			}

		

	}
	public void open(int r , int c) {
		if(r<0 || r>= board.length || c<0 || c>= board[0].length || board[r][c].isEnabled() == false || board[r][c].getText().length()>0) {
			return;
		}else if(board[r][c].getCount() != 0) {
			board[r][c].setText(board[r][c].getCount()+"");
			board[r][c].setEnabled(false);
			openbutton++;
		}else {
			openbutton++;
			board[r][c].setEnabled(false);
			open(r-1,c);
			open(r+1,c);
			open(r,c-1);
			open(r,c+1);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Btns b = (Btns) e.getComponent();// týkladýgýmýz butonun yerýný ogrenýyoruz.
		if (e.getButton() == 1) {// 1 olunca sol týk 2 olunca ortadaký yuvarlak 3 olunca sol týk.
			//System.out.println("sol týk");
			if (b.isMine()) {
				JOptionPane.showMessageDialog(jF, "OMG!! You are loser.");
				print();
			} else {
				open(b.getRow(),b.getCol());
				if(openbutton == (board.length * board[0].length - 10)) {
					JOptionPane.showConfirmDialog(jF, "Wow Congr. You are win.");
					print();
				}
				
			}

		}

		if (e.getButton() == 3) {
			//System.out.println("sag týk");
			if (!b.isFlag()) {
				b.setIcon(new ImageIcon("src/f.png"));
				b.setFlag(true);
			} else {
				b.setIcon(null);
				b.setFlag(false);
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
