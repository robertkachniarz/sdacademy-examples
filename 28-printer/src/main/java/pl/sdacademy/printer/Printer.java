package pl.sdacademy.printer;

import java.util.Stack;

public class Printer {
	private final int documentsTreshold;
	private Stack<Document> printQueue = new Stack<>();

	public Printer(int documentsTreshold) {
		this.printQueue = new Stack<>();
		this.documentsTreshold = documentsTreshold;
	}

	void print(Document document){
		printQueue.push(document);
		if(printQueue.size() >= documentsTreshold){
			while (!printQueue.isEmpty()) printQueue.pop().setPrinted(true);
		}
	}
}
