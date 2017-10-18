package ua.nure.ivanenko.Practice6;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import ua.nure.ivanenko.Practice6.part1.*;
import ua.nure.ivanenko.Practice6.part2.*;
import ua.nure.ivanenko.Practice6.part3.*;
import ua.nure.ivanenko.Practice6.part4.*;
import ua.nure.ivanenko.Practice6.part5.*;
import ua.nure.ivanenko.Practice6.part6.*;
import ua.nure.ivanenko.Practice6.part7.*;

public class Demo {
	private static final String ENCODING = "UTF-8";
	private static final String[] ARGS = new String[]{""};
	
	public static void main(String[] args) throws IOException {
		System.out.println("~~~~~~~~~Part1");
		System.setIn(new ByteArrayInputStream("asd asdf asd asdf asdf 43 asdfs 43 43 434".getBytes(ENCODING)));
		Part1.main(ARGS);
		System.out.println("~~~~~~~~~Part2");
		Part2.main(ARGS);
		System.out.println("~~~~~~~~~Part3");
		Part3.main(ARGS);
		System.out.println("~~~~~~~~~Part4");
		Part4.main(ARGS);
		System.out.println("~~~~~~~~~Part5");
		Part5.main(ARGS);		
		System.out.println("~~~~~~~~~Part6");
		System.out.println("~~~~frequency:");
		Part6.main(new String[] {"-i input.txt -t frequency"});
		System.out.println("~~~~length:");
		Part6.main(new String[] {"--input input.txt --task length"});
		System.out.println("~~~~duplicates:");
		Part6.main(new String[] {"-i input.txt --task duplicates"});	
		System.out.println("~~~~~~~~~Part7");
		Part7.main(ARGS);
	}

}
