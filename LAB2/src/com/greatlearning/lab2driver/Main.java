package com.greatlearning.lab2driver;

import java.util.Scanner;

import com.greatlearning.lab2services.CountOfNotes;
import com.greatlearning.lab2services.ImplementMergeSort;

public class Main {

	public static void main(String[] args) {

		ImplementMergeSort implementMergeSort = new ImplementMergeSort();
		CountOfNotes countOfNotes = new CountOfNotes();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		implementMergeSort.sort(notes,0,notes.length-1);
		countOfNotes.notesCountImplementation(notes, amount);
	}
}