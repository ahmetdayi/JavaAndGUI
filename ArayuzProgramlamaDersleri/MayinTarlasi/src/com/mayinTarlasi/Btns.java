package com.mayinTarlasi;

import javax.swing.JButton;

public class Btns extends JButton {
	private int row,col,count;
	private boolean isFlag,isMine;
	public Btns(int row, int col) {
		this.row = row;
		this.col = col;
		this.count = 0;
		this.isFlag = false;
		this.isMine = false;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	public boolean isMine() {
		return isMine;
	}
	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}
	

}
