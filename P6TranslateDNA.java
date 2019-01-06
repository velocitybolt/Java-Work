package program6;

// Author: Murtaza Meerza 

import stdlib.*;
import algs31.*;
import algs34.*;

public class P6TranslateDNA {

	public static void main(String[] args) {
		StdIn.fromFile("data/aacids.txt");
		BinarySearchST<String, String> aacids = new BinarySearchST<>();
		String AAShort;
		while(!StdIn.isEmpty()){
			String codons = StdIn.readLine();
			String[] AAcids = codons.split("\\s+");
			String AAcids2 = AAcids[0];
			AAShort = AAcids[1];
			aacids.put(AAcids2, AAShort);
		}
		StdIn.fromFile("data/codons.txt");
		BinarySearchST<String, String> codons = new BinarySearchST<>();
		String AAShort2;
		while(!StdIn.isEmpty()){
			String codons2 = StdIn.readLine();
			String[] AAcids2 = codons2.split("\\s+");
			String AAcids3 = AAcids2[0];
			AAShort2 = AAcids2[1];
			codons.put(AAcids3, AAShort2);	
		}
		StdIn.fromFile("data/species_dna.txt");
		// Fastest Symbol Table because multiple combinations for proteins 
		SeparateChainingHashST<String, String> DNA = new SeparateChainingHashST<>();
		String species; 
		while(!StdIn.isEmpty()){
			String dnaseq = StdIn.readLine();
			String [] dna = dnaseq.split("\\s+");
			String combo = dna[0];
			species = dna[1];
			DNA.put(combo, species);			
		}
		StdIn.fromFile("data/species_genes.txt");
		while(StdIn.hasNextLine()){
			String[] line = StdIn.readLine().split("\\s+");
			String animal = line[0];
			int start = Integer.parseInt(line[1]);
			int end = Integer.parseInt(line[2]);
			String result = DNA.get(animal);
			
			for (int i = start ; i <= end ; i+=3) {
				String sequence = result.substring(i,i + 3);
				String c = codons.get(sequence);
				String comp = aacids.get(c);
				StdOut.print("Amino Acid for Species X is: ");
				StdOut.println(comp);
			}
			
			
			
		}
		
	}
		
}


