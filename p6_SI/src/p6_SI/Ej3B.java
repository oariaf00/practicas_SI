package p6_SI;

import java.util.ArrayList;
import java.util.Arrays;

public class Ej3B {
	
	//Lista del código a desencriptar
	static int[] lista= {1,2,0,1,2,2,1,2,1,0,2,0,1,2,2,0,2,2,2,0,1,2,2,2,1,0,1,1,1,1,0,2,2,2,1,2,2,1,2,0,0,1,0,2,0,2,1,1,2,2,1,2,0,1,1,0,0,1,1,0,1,0,1,2,0,1,1,0,0,1,1,0,1,2,2,1,1,2,0,1,2,1,2,0,0,2,0,0,0,1,0,2,0,2,1,1,0,1,0,0,0,2,0,1,0,1,2,2,2,1,2,0,0,0,0,0,0,0,0,0,1,1,2,1,0,2,2,0,0,2,2,0,0,0,1,0,1,1,1,0,2,1,1,1,1,1,0,0,0,2,0,1,0,1,2,2,0,1,0,0,0,2,0,1,0,1,2,2,1,1,1,2,1,0,2,2,2,1,0,2,2,0,1,1,1,2,0,1,2,1,2,0,2,
			0,1,0,1,1,1,0,2,1,1,1,0,2,2,0,2,2,2,0,1,2,2,2,0,2,0,2,1,2,2,0,2,2,2,1,2,1,1,0,1,0,1,1,2,2,0,0,1,1,2,1,0,2,2,0,0,2,2,0,0,2,1,0,2,2,2,0,1,2,2,2,1,1,1,1,0,1,2,1,0,0,1,2,1,2,0,1,2,2,1,2,1,0,2,0,1,2,0,2,0,0,1,1,0,2,0,2,2,0,1,2,2,1,0,2,1,2,1,0,2,2,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,2,2,2,1,2,2,2,1,2,1,2,2,0,2,2,2,1,0,1,1,1,0,1,2,1,0,0,1,2,1,1,1,2,2,1,0,2,1,2,1,0,0,1,1,0,1,1,1,0,2,1,1,1,2,2,2,0,0,1,0,2,0,2,1,
			1,0,1,0,0,0,2,0,1,0,1,2,2,1,2,0,1,1,1,0,2,2,2,1,2,1,1,2,2,2,1,0,2,1,2,1,0,0,1,2,0,1,1,1,0,2,1,1,1,0,2,2,0,0,1,0,2,0,2,1,1,1,2,0,0,0,2,0,1,0,1,2,2,1,2,0,2,0,1,1,0,0,1,1,0,2,0,2,1,0,2,2,0,0,2,2,0,0,0,1,0,2,2,2,0,1,2,2,2,0,0,0,2,2,0,0,0,1,0,0,2,2,1,1,1,2,2,1,2,1,0,2,0,1,0,1,2,0,1,1,0,0,1,1,0,2,0,1,0,1,0,1,1,2,2,0,0,2,2,2,2,0,2,1,2,0,0,2,1,1,1,2,1,0,1,2,1,0,0,1,2,0,2,0,0,0,1,0,2,0,2,1,1,2,2,0,2,0,1,1,0,0,
			1,1,0,1,1,1,0,1,0,1,1,2,2,0,0,1,2,2,0,2,2,2,0,1,2,2,2,0,2,0,1,1,1,0,2,2,2,1,2,2,2,0,0,0,1,0,2,0,2,1,1,1,0,1,2,0,1,1,0,0,1,1,0,2,0,1,2,2,1,0,2,1,2,1,0,2,0,1,2,0,2,1,2,0,0,2,1,0,2,1,0,2,2,2,0,1,2,2,2,1,2,0,0,0,2,0,1,0,1,2,2,1,2,1,0,0,0,0,0,0,0,0,0,1,0,2,1,1,2,0,1,2,1,2,0,0,1,2,0,1,1,1,0,2,1,1,1,2,2,2,0,0,1,0,2,0,2,1,1,1,1,1,0,0,2,0,1,0,1,2,2,1,0,0,0,2,0,2,2,1,1,0,0,1,0,1,2,2,1,0,2,1,2,1,0,0,0,1,0,1,1,1,
			0,2,1,1,1,2,1,0,0,0,1,0,2,0,2,1,1,0,2,1,0,0,2,0,1,0,1,2,2,1,0,2,0,2,2,2,0,1,2,2,2,1,0,0,0,1,0,1,1,2,2,0,0,0,2,1,0,2,2,2,0,1,2,2,2,1,1,2,1,2,1,1,0,1,1,1,2,1,1,0,1,2,1,1,0,1,1,1,2,1,2,0,2,0,1,1,0,0,1,1,0,2,0,1,2,2,1,0,2,1,2,1,0,2,0,1,0,1,1,1,0,2,1,1,1,1,0,2,0,1,2,1,2,2,0,2,2,0,2,1,2,1,2,2,0,2,2,2,1,1,1,2,0,0,0,0,0,0,0,0,0,1,0,1,1,1,2,0,1,2,1,2,0,2,1,1,0,1,1,1,0,2,1,1,1,1,2,2,2,0,0,1,1,0,2,0,2,1,1,1,0,0,
			2,0,1,0,1,2,2,2,1,2,0,0,0,0,0,0,0,0,0,2,2,2,1,1,2,0,1,2,1,2,0,2,1,2,0,1,1,1,0,2,1,1,1,0,2,0,1,1,1,0,2,2,2,1,2,1,1,0,1,2,2,1,2,1,0,2,0,0,1,0,0,0,1,0,2,0,2,1,1,1,1,0,0,1,0,1,1,2,2,0,0,1,1,1,2,1,0,2,2,2,1,0,2,0,2,1,2,1,0,2,2,2,1,0,2,1,1,1,1,2,2,1,2,1,0,2,0,1,0,0,0,2,0,2,2,1,1,0,0,1,2,2,1,1,2,0,1,2,1,2,0,0,1,2,0,1,1,1,0,2,1,1,1,1,2,0,1,2,1,1,0,1,1,1,2,0,1,0,2,1,2,2,0,2,2,2,1,2,2,1,2,0,1,1,0,0,1,1,0,2,2,1,
			1,1,2,0,1,2,1,2,0,2,0,2,0,1,1,1,0,2,1,1,1,0,1,0,2,2,2,0,1,1,1,2,1,1,1,2,2,1,1,2,1,2,0,1,0,1,0,0,2,0,1,1,0,0,1,1,0,2,1,2,1,2,0,1,1,1,2,0,1,0,2,2,1,2,0,1,1,1,2,0,1,2,2,2,0,0,1,0,2,0,2,1,1,1,2,0,0,0,2,0,1,0,1,2,2,2,0,1,0,2,1,2,1,1,0,1,1,1,1,1,2,2,1,0,2,1,2,1,0,2,0,2,0,1,1,1,0,2,1,1,1,0,2,0,0,0,1,0,2,0,2,1,1,1,1,0,1,2,1,1,0,1,1,1,2,2,0,1,2,0,1,1,0,0,1,1,0,2,1,1,0,1,0,1,1,2,2,0,0,2,0,1,2,2,1,0,2,1,2,1,0,0,
			1,2,2,1,0,2,2,2,1,0,2,1,1,1,1,2,2,1,2,1,0,2,0,1,0,0,2,0,0,1,1,0,2,0,2,2,0,2,2,2,1,0,2,1,2,1,0,2,1,2,0,1,1,1,0,2,1,1,1,0,1,0,1,2,1,1,0,1,1,1,2,2,1,0,1,2,2,1,2,1,0,2,0,2,1,0,0,0,1,0,2,0,2,1,1,1,1,0,0,1,0,1,1,2,2,0,0,1,0,1,1,1,2,0,1,2,1,2,0,2,1,0,0,0,1,0,2,0,2,1,1,0,1,1,0,0,2,0,1,0,1,2,2,0,0,1,0,1,1,1,0,2,1,1,1,1,0,2,2,2,1,0,2,1,2,1,0,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,1,1,0,2,0,2,0,2,0,1,2,1,1,0,1,1,1,
			2,2,0,2,2,2,1,0,2,1,2,1,0,2,2,2,1,1,2,0,1,2,1,2,0,0,0,2,0,1,1,1,0,2,1,1,1,1,2,0,2,0,1,1,0,0,1,1,0,0,1,1,2,1,2,2,0,2,2,2,1,1,2,2,2,1,0,2,2,2,1,0,2,1,0,2,1,1,2,0,1,2,1,2,0,0,0,1,0,1,1,1,0,2,1,1,1,1,1,2,0,1,2,1,2,2,0,2,2,0,2,0,0,0,2,0,1,0,1,2,2,0,1,1,2,1,0,2,2,2,1,0,2,2,1,1,0,1,0,1,1,2,2,0,0,1,0,1,2,2,1,0,2,1,2,1,0,0,1,2,1,0,1,2,1,0,0,1,2,1,2,0,1,2,2,1,2,1,0,2,0,0,0,0,2,0,0,1,1,0,2,0,2,1,0,1,0,1,0,1,1,2,
			2,0,0,0,1,2,2,1,0,2,2,2,1,0,2,0,2,2,2,1,0,2,2,2,1,0,2,1,1,0,1,2,2,1,2,1,0,2,0,2,1,0,1,2,2,1,2,1,0,2,0,1,1,2,2,2,1,0,2,1,2,1,0,2,2,1,0,0,0,0,0,0,0,0,0,0,2,0,0,0,1,0,2,0,2,1,1,0,1,0,0,0,2,0,1,0,1,2,2,0,2,0,1,1,1,0,2,2,2,1,2,2,1,1,2,2,1,0,2,1,2,1,0,0,1,1,0,1,1,1,0,2,1,1,1,1,0,0,0,1,2,1,2,2,0,2,2,0,2,0,0,0,1,0,2,0,2,1,1,1,2,0,2,0,1,1,0,0,1,1,0,2,0,0,1,0,2,2,0,0,2,2,0,0,1,1,0,1,1,1,0,2,1,1,1,1,2,2,2,1,0,2,
			2,2,1,0,2,1,2,0,2,1,1,2,1,2,0,1,0,2,2,1,2,0,1,1,0,0,1,1,0,2,2,1,1,1,2,0,1,2,1,2,0,0,0,1,0,1,1,1,0,2,1,1,1,1,2,0,1,1,1,0,2,2,2,1,2,2,2,1,1,2,2,1,2,1,0,2,0,2,2,0,0,0,1,0,2,0,2,1,1,1,1,1,0,1,0,1,1,2,2,0,0,1,2,1,2,1,0,2,2,2,1,0,2,0,1,2,2,1,0,2,2,2,1,0,2,2,1,0,1,2,2,1,2,1,0,2,0,2,0,2,0,2,0,2,2,1,1,0,0,2,2,1,1,1,2,0,1,2,1,2,0,0,0,1,0,1,1,1,0,2,1,1,1,1,2,0,1,2,1,1,0,1,1,1,2,2,1,1,2,1,2,2,0,2,2,2,1,2,2,1,2,0,
			1,1,0,0,1,1,0,1,2,2,1,1,2,0,1,2,1,2,0,2,1,2,0,1,1,1,0,2,1,1,1,0,2,1,1,1,1,0,2,2,2,1,2,0,1,1,2,1,2,2,0,2,2,2,1,2,1,2,0,0,0,0,0,0,0,0,0,1,0,2,2,2,1,0,2,1,2,1,0,0,0,2,2,0,2,1,2,0,0,2,1,1,2,1,2,1,0,2,2,2,1,0,2,1,2,2,2,1,1,2,1,2,0,1,0,2,0,1,2,2,1,0,2,1,2,1,0,1,2,1,1,1,2,0,1,2,1,2,0,0,1,2,0,1,1,1,0,2,1,1,1,2,1,0,0,0,1,0,2,0,2,1,1,1,2,0,1,2,1,1,0,1,1,1,2,2,1,0,2,2,2,0,1,1,1,2,1,1,2,0,2,1,1,2,1,2,0,1,0,1,0,2,
			0,2,2,2,0,1,2,2,2,1,1,2,1,0,1,2,1,0,0,1,2,1,2,2,2,1,1,2,1,2,0,1,0,1,0,0,2,0,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,2,2,0,0,1,1,1,2,2,1,0,2,1,2,1,0,1,0,2,0,2,2,2,0,1,2,2,2,2,2,1,2,1,2,2,0,2,2,2,1,2,2,1,2,0,1,1,0,0,1,1,0,2,1,2,1,0,2,2,0,0,2,2,0,0,0,2,0,2,2,2,0,1,2,2,2,0,1,2,0,1,2,1,2,2,0,2,2,0,1,0,0,0,2,0,1,0,1,2,2,1,0,0,2,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,2,2,0,0,2,0,1,0,1,1,1,0,2,1,1,1,0,2,2,0,0,1,0,2,0,2,1,1,1,
			1,1,0,0,2,0,1,0,1,2,2,0,2,1,0,2,2,2,0,1,2,2,2,2,1,1,0,1,0,1,1,2,2,0,0,1,0,2,0,2,2,2,0,1,2,2,2,1,2,0,1,2,1,1,0,1,1,1,2,0,1,0,1,2,1,1,0,1,1,1,2,2,2,1,2,0,1,1,0,0,1,1,0,2,0,1,2,2,1,0,2,1,2,1,0,0,0,2,0,1,1,1,0,2,1,1,1,1,1,0,0,1,2,1,2,2,0,2,2,2,2,0,2,1,2,2,0,2,2,2,1,2,2,0,2,0,1,1,0,0,1,1,0,2,1,1,0,1,0,1,1,2,2,0,0,0,0,1,0,1,1,1,0,2,1,1,1,2,2,0,0,0,1,0,2,0,2,1,1,0,1,1,0,0,2,0,1,0,1,2,2,0,2,0,0,2,1,2,1,1,0,1,
			1,2,0,1,2,2,1,0,2,1,2,1,0,1,2,1,0,0,0,0,0,0,0,0,0,0,1,2,0,0,1,0,2,0,2,1,1,1,2,0,0,0,2,0,1,0,1,2,2,0,0,1,0,1,1,1,0,2,1,1,1,1,0,2,1,0,2,2,0,0,2,2,0,2,2,2,1,1,2,0,1,2,1,2,0,0,1,0,2,2,0,0,0,1,0,0,2,1,1,1,1,2,2,1,2,1,0,2,0,1,2,2,0,0,0,0,0,0,0,0,0,1,1,2,2,2,1,0,2,1,2,1,0,2,0,1,2,0,2,1,2,0,0,2,1,2,1,0,0,0,1,0,2,0,2,1,1,1,1,0,0,0,2,0,1,0,1,2,2,1,2,0,0,2,0,2,2,1,1,0,0,1,1,1,2,2,1,0,2,1,2,1,0,0,1,1,0,1,1,1,0,2,
			1,1,1,0,2,0,0,0,1,0,2,0,2,1,1,0,1,2,1,2,1,1,0,1,1,1,2,1,2,1,2,0,1,1,0,0,1,1,0,1,0,0,2,0,1,1,0,0,1,1,0,2,1,2,1,2,0,1,1,1,2,0,1,0,2,1,2,1,2,2,0,2,2,2,1,0,2,2,0,0,1,0,2,0,2,1,1,1,2,0,2,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,2,2,0,0,0,1,1,0,1,1,1,0,2,1,1,1,0,0,1,0,2,2,2,0,1,2,2,2,0,2,0,2,1,2,2,0,2,2,2,1,2,1,0,2,2,2,0,1,1,1,2,1,1,0,0,0,1,0,1,1,2,2,0,0,1,1,2,0,0,0,0,0,0,0,0,0,2,1,2,0,0,1,0,2,0,2,1,1,0,2,0,0,0,2,0,
			1,0,1,2,2,0,0,1,0,2,2,2,0,1,2,2,2,2,0,0,0,1,0,1,1,2,2,0,0,1,2,2,0,2,2,2,0,1,2,2,2,0,2,2,1,2,1,1,0,1,1,1,2,0,2,0,1,2,1,1,0,1,1,1,2,1,2,0,2,0,1,1,0,0,1,1,0,1,1,1,2,2,1,0,2,1,2,1,0,2,0,2,0,1,1,1,0,2,1,1,1,1,0,0,0,1,2,1,2,2,0,2,2,2,2,0,2,1,2,2,0,2,2,2,1,1,2,0,2,0,1,1,0,0,1,1,0,2,1,0,0,1,0,1,1,2,2,0,0,2,0,1,0,1,1,1,0,2,1,1,1,0,1,0,0,0,1,0,2,0,2,1,1,1,2,1,0,0,2,0,1,0,1,2,2,2,2,0,2,0,1,1,0,0,1,1,0,2,0,2,1,0,
			2,2,0,0,2,2,0,0,1,1,0,1,1,1,0,2,1,1,1,0,2,2,0,0,1,0,2,0,2,1,1,0,2,1,0,0,2,0,1,0,1,2,2,2,2,2,0,2,0,2,2,1,1,0,0,2,0,1,0,1,0,1,1,2,2,0,0,2,1,2,0,0,0,0,0,0,0,0,0,0,2,1,2,1,0,2,2,2,1,0,2,0,2,0,0,0,2,0,1,0,1,2,2,2,0,1,0,2,1,2,1,1,0,1,1,2,0,1,2,2,1,0,2,1,2,1,0,2,0,2,0,1,1,1,0,2,1,1,1,0,1,2,0,0,1,0,2,0,2,1,1,0,2,1,0,0,2,0,1,0,1,2,2,2,0,2,0,2,0,2,2,1,1,0,0,2,1,2,2,2,1,0,2,1,2,1,0,0,1,1,0,1,1,1,0,2,1,1,1,2,1,2,
			0,0,1,0,2,0,2,1,1,0,1,0,1,2,1,1,0,1,1,1,2,1,1,1,2,1,0,2,2,2,1,0,2,2,0,0,0,2,0,2,2,1,1,0,0,0,0,2,0,2,2,2,0,1,2,2,2,2,1,2,0,0,1,0,2,0,2,1,1,1,1,1,0,0,2,0,1,0,1,2,2,2,0,0,0,2,1,2,1,1,0,1,1,1,1,1,2,2,1,0,2,1,2,1,0,2,1,2,0,1,1,1,0,2,1,1,1,0,2,0,0,0,1,0,2,0,2,1,1,1,1,2,1,2,1,1,0,1,1,1,2,2,0,0,2,0,1,1,0,0,1,1,0,2,0,1,2,2,1,0,2,1,2,1,0,2,2,1,0,0,0,0,0,0,0,0,0,1,1,0,1,2,1,1,0,1,1,1,2,1,2,1,1,2,2,1,2,1,0,2,0,0,
			2,1,2,1,0,2,2,2,1,0,2,2,0,2,1,0,2,2,0,0,2,2,0,1,0,2,0,2,2,2,0,1,2,2,2,1,1,2,0,1,2,1,2,2,0,2,2,1,1,0,0,0,2,0,1,0,1,2,2,1,2,1,2,0,1,1,0,0,1,1,0,2,0,2,1,0,2,2,0,0,2,2,0,2,2,1,1,2,0,1,1,1,2,0,1,1,0,1,1,0,1,2,1,0,0,1,2,2,2,2,0,0,1,0,2,0,2,1,1,2,2,1,2,0,1,1,0,0,1,1,0,1,1,0,0,1,0,1,1,2,2,0,0,2,1,2,0,1,1,1,0,2,1,1,1,0,0,1,2,2,0,0,0,1,0,0,2,2,2,2,0,0,1,0,2,0,2,1,1,2,0,1,2,0,1,1,0,0,1,1,0,1,0,1,0,1,0,1,1,2,2,0,
			0,2,0,2,2,2,1,0,2,1,2,1,0,1,2,2,2,1,0,2,2,2,1,0,2,2,2,0,1,2,2,1,2,1,0,2,0,1,2,2,0,2,0,2,2,1,1,0,0,1,1,0,0,1,0,1,1,2,2,0,0,2,2,1,2,0,2,1,2,0,0,2,1,0,2,0,1,2,1,1,0,1,1,1,2,1,1,2,1,2,1,1,0,1,1,1,2,2,0,1,2,2,1,0,2,1,2,1,0,2,2,2,1,1,2,0,1,2,1,2,0,2,0,1,0,1,1,1,0,2,1,1,1,0,2,2,0,0,1,0,2,0,2,1,1,0,2,0,1,2,1,1,0,1,1,1,2,0,1,0,0,0,1,0,2,0,2,1,1,2,2,2,2,1,1,2,1,2,0,1,0,0,0,2,0,2,2,2,0,1,2,2,2,2,0,1,0,1,0,1,1,2,
			2,0,0,0,1,1,2,1,0,2,2,2,1,0,2,2,1,2,0,1,1,1,0,2,1,1,1,2,2,2,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,0,2,1,1,1,2,1,2,1,0,2,2,0,0,2,2,0,2,1,2,1,2,0,1,1,1,2,0,1,0,1,1,2,1,0,2,2,2,1,0,2,1,1,0,1,2,2,1,2,1,0,2,0,0,0,2,0,1,1,1,0,2,1,1,1,0,2,0,0,0,1,0,2,0,2,1,1,1,1,2,2,1,0,2,2,2,1,0,2,1,1,1,0,0,2,0,1,0,1,2,2,1,2,1,0,0,0,0,0,0,0,0,0,2,2,1,0,0,0,0,0,0,0,0,0,1,1,2,1,0,2,2,0,0,2,2,0,0,1,2,1,2,0,1,1,1,2,0,1,2,0,1,2,0,1,1,
			0,0,1,1,0,2,1,1,1,2,2,1,2,1,0,2,0,2,1,1,0,1,1,1,0,2,1,1,1,2,2,1,2,1,2,2,0,2,2,2,1,2,1,0,0,0,1,0,2,0,2,1,1,1,0,1,2,0,1,1,0,0,1,1,0,1,1,0,2,1,1,2,1,2,0,1,0,1,0,1,1,1,2,0,1,2,1,2,0,1,2,0,2,0,1,1,0,0,1,1,0,2,2,1,0,0,0,0,0,0,0,0,0,0,2,0,0,0,2,0,1,0,1,2,2,1,2,1,0,0,0,0,0,0,0,0,0,1,2,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,2,2,0,0,2,2,0,0,2,1,1,2,0,1,1,1,2,0,1,1,0,0,2,0,1,1,0,0,1,1,0,1,2,1,1,2,2,1,2,1,0,2,0,2,1,1,0,1,
			1,1,0,2,1,1,1,2,1,0,0,0,1,0,2,0,2,1,1,1,2,1,2,1,0,2,2,2,1,0,2,2,0,1,2,0,1,1,0,0,1,1,0,1,0,1,1,1,2,0,1,2,1,2,0,0,1,1,0,1,1,1,0,2,1,1,1,2,2,2,1,1,2,0,1,2,1,2,0,0,1,1,1,2,0,1,1,1,2,0,1,2,2,2,0,2,0,2,2,1,1,0,0,1,2,0,2,1,1,2,1,2,0,1,0,2,0,2,1,1,2,0,1,2,1,2,0,2,1,1,2,2,1,0,2,1,2,1,0,2,1,2,0,0,0,0,0,0,0,0,0,0,1,2,1,0,1,2,1,0,0,1,2,1,1,1,0,0,0,0,0,0,0,0,0,1,2,1,0,0,0,0,0,0,0,0,0,2,1,2,1,0,2,2,0,0,2,2,0,1,1,0,
			1,2,1,1,0,1,1,1,2,2,0,2,1,0,2,2,0,0,2,2,0,2,2,1,1,1,2,0,1,2,1,2,0,0,0,2,0,1,1,1,0,2,1,1,1,2,0,2,0,2,0,2,2,1,1,0,0,2,1,0,1,2,2,1,2,1,0,2,0,1,0,0,0,1,2,1,2,2,0,2,2,1,1,2,2,2,1,0,2,1,2,1,0,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,2,2,2,1,2,0,2,0,0,0,1,0,2,0,2,1,1,1,0,1,2,0,1,1,0,0,1,1,0,1,1,0,2,1,1,2,1,2,0,1,0,0,1,1,1,2,0,1,1,1,2,0,1,1,1,2,1,0,1,2,1,0,0,1,2,1,1,0,1,2,2,1,2,1,0,2,0,1,2,0,1,1,1,0,2,2,2,1,2,2,
			0,1,2,2,1,0,2,1,2,1,0,1,2,1,2,1,0,2,2,2,1,0,2,2,1,0,0,0,1,0,2,0,2,1,1,0,1,1,2,1,0,2,2,2,1,0,2,0,1,2,0,1,1,1,0,2,1,1,1,2,1,2,1,0,2,2,0,0,2,2,0,1,0,2,1,1,2,0,1,2,1,2,0,0,2,0,2,0,0,1,1,0,2,0,2,1,2,1,0,0,2,0,1,0,1,2,2,0,0,1,0,2,1,2,1,1,0,1,1,2,1,2,2,2,1,0,2,1,2,1,0,1,0,2,1,1,2,0,1,2,1,2,0,1,1,0,0,1,2,1,2,2,0,2,2,0,1,2,1,2,1,1,0,1,1,1,2,2,0,1,2,0,1,1,0,0,1,1,0,2,2,2,1,2,0,1,1,1,2,0,1,0,1,2,1,2,0,1,1,1,2,0,
			1,0,2,2,0,0,1,0,2,0,2,1,1,0,2,2,2,1,0,2,2,2,1,0,2,2,1,2,0,0,0,0,0,0,0,0,0,2,1,0,1,0,2,2,0,0,2,2,0,0,0,1,0,2,2,2,0,1,2,2,2,1,1,0,2,2,0,0,0,1,0,0,2,1,2,0,1,2,2,1,2,1,0,2,0,0,2,1,2,1,0,2,2,2,1,0,2,2,1,2,1,0,2,2,0,0,2,2,0,0,2,1,0,2,2,2,0,1,2,2,2,0,2,1,0,2,2,2,0,1,2,2,2,0,1,0,2,1,2,2,0,2,2,2,1,1,2,2,2,1,0,2,2,2,1,0,2,2,2,1,1,1,2,0,1,2,1,2,0,2,1,1,0,1,1,1,0,2,1,1,1,2,2,1,1,2,2,1,2,1,0,2,0,2,1,0,2,1,2,2,0,2,
			2,2,1,1,2,0,2,0,0,1,1,0,2,0,2,1,1,1,2,2,1,0,2,1,2,1,0,1,1,2,0,0,0,0,0,0,0,0,0,1,2,0,0,0,2,0,1,0,1,2,2,1,1,0,0,0,2,0,1,0,1,2,2,0,0,2,0,1,2,1,2,2,0,2,2,2,1,1,2,2,1,0,2,1,2,1,0,1,1,2,0,0,0,0,0,0,0,0,0,1,1,0,0,1,2,1,2,2,0,2,2,1,2,2,1,2,1,1,0,1,1,1,2,0,1,0,2,1,2,2,0,2,2,2,1,2,2,2,1,1,2,0,1,2,1,2,0,2,0,2,0,1,1,1,0,2,1,1,1,0,2,0,0,2,1,2,1,1,0,1,1,1};
		
	//Alfabeto que usaremos para traducir
	static char[] alf= {'A','Á','B','C','D','E','É','F','G','H','I','Í','J','K','L','M','N','Ñ','O','Ó','P','Q','R','S','T','U','Ú','V','W','X','Y','Z',' ','.',',',';',':','(',')','¿', '?', '¡','!','-','0','1','2','3','4','5','6','7','8','9','a','á','b','c','d','e','é','f','g','h','i','í','j','k','l','m','n','ñ','o','ó','p','q','r','s','t','u','ú','v','w','x','y','z'};

	//Matriz generadora para esta codificación (Introducida manualmente matriz identidad)
	static int[][] matrizGeneradora={
			{1,0,0,1,2,0,1,1,1,2,0,1},
			{0,1,0,1,1,2,0,1,2,1,2,0},
			{0,0,1,2,1,1,2,1,2,0,1,0}};
	
	//Matriz A
	static int[][] A={
			{1,2,0,1,1,1,2,0,1},
			{1,1,2,0,1,2,1,2,0},
			{2,1,1,2,1,2,0,1,0}};
	
	//Matriz de control
	static int [][] H= matrizTraspuestaYNegativa(A);
	
	//Base=3 porque estamos trabajando con un código binario
	static int base = 3;
	static int longitudAlfabeto2=0;
	
	//ArrayLists donde meteremos los códigos con el ruido
	static ArrayList<Integer> codigoFinal = new ArrayList<Integer>();
	static ArrayList<Integer> decodificacion = new ArrayList<Integer>();
	static ArrayList<Integer> ruido = new ArrayList<Integer>();
	
	//Valor de la distancia de Hamming y la capacidad correctora
	static Hamming h = new Hamming(A);
	static int d=h.distancia;
	static int capacidadCorrectora=(d-1)/2;
	
	/*Arrays para las permutaciones (Todas las posibilidades con peso menor o igual a T)
	 * Luego serán permutados para hallar todas las posiciones 
	 */
	static int[] combinacion0= {0,0,0,0,0,0,0,0,0,0,0,0};
	static int[] combinacion1= {0,0,0,0,0,0,0,0,0,0,0,1};
	static int[] combinacion2= {0,0,0,0,0,0,0,0,0,0,0,2};
	static int[] combinacion3= {0,0,0,0,0,0,0,0,0,0,1,1};
	static int[] combinacion4= {0,0,0,0,0,0,0,0,0,0,1,2};
	static int[] combinacion5= {0,0,0,0,0,0,0,0,0,1,1,1};
	static int[] combinacion6= {0,0,0,0,0,0,0,0,0,1,1,2};
	static int[] combinacion7= {0,0,0,0,0,0,0,0,0,1,2,2};
	static int[] combinacion8= {0,0,0,0,0,0,0,0,0,2,2,2};
	
	/*Arrays donde se guardan las combinaciones de las permutaciones de los arrays anteriores
	 * Cada array guarda las combinaciones de los arrays anteriores
	 */
	static ArrayList<Integer> combinaciones0 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones1 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones2 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones3 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones4 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones5 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones6 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones7 = new ArrayList<Integer>();
	static ArrayList<Integer> combinaciones8 = new ArrayList<Integer>();
	
	//Arrays donde se guardan los resultados de multiplicar cada síndrome por la matriz H
	static ArrayList<Integer> sindromes_0 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_1 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_2 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_3 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_4 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_5 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_6 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_7 = new ArrayList<Integer>();
	static ArrayList<Integer> sindromes_8 = new ArrayList<Integer>();
	
	//Matriz binaria y limpia(despues de quitar los q tienen peso > 2)
	static int [][] matrizBinaria;
	static int [][] matrizBinariaLimpia;
	static ArrayList<Integer> sindromes_palabras = new ArrayList<Integer>();
	static ArrayList<Integer> matrizBinariaLimpiaAL = new ArrayList<Integer>();
	
	public static void principal() {
		// TODO Auto-generated method stub
		/*
		* Calculamos la longitud mínima para codificar cada caracter del alfabeto fuente
		* y escogemos el valor inmediatamente superior entero como indica la fórmula
		*/
		longitudAlfabeto2 = calculaLongitudFuente();
		System.out.println("Longitud del alfabeto fuente: " + longitudAlfabeto2);
		
		//Hallamos las permutaciones necesarias para el calculo de los errores
		permutaciones();
		
		//Multiplicamos las permutaciones con la matriz de control
		productoPermutaciones();
		
		//Comenzamos con la decodificación de la lista
		obtenerCodigoFinal();
		decodificar();
	}
	
	/**
	 * Método que devuelve la longitud de la palabra de la fuente
	 * @return
	 */
	private static int calculaLongitudFuente() {
		double logaritmoFuente = Math.log10(alf.length)/Math.log10(base);
		int longitudAlfabeto2 = (int) Math.ceil(logaritmoFuente);
		return longitudAlfabeto2;
	}
	
	/**
	 * Método que calcula y almacena las permutaciones
	 */
	private static void permutaciones() {
		/*En cada bucle se generan las permutaciones correspondientes a cada array
		 * declarado arriba (combinacion0, combinacion1, ...)
		 */
		do {
            for(int i=0;i<combinacion0.length;i++) {
            	combinaciones0.add(combinacion0[i]);
            }
        } while (nextPermutation(combinacion0));
		
		do {
			for(int i=0;i<combinacion1.length;i++) {
            	combinaciones1.add(combinacion1[i]);
            }
        } while (nextPermutation(combinacion1));
		
		do {
			for(int i=0;i<combinacion2.length;i++) {
            	combinaciones2.add(combinacion2[i]);
            }
        } while (nextPermutation(combinacion2));
		do {
			for(int i=0;i<combinacion3.length;i++) {
            	combinaciones3.add(combinacion3[i]);
            }
        } while (nextPermutation(combinacion3));
		do {
			for(int i=0;i<combinacion4.length;i++) {
            	combinaciones4.add(combinacion4[i]);
            }
        } while (nextPermutation(combinacion4));
		do {
			for(int i=0;i<combinacion5.length;i++) {
            	combinaciones5.add(combinacion5[i]);
            }
        } while (nextPermutation(combinacion5));
		do {
			for(int i=0;i<combinacion6.length;i++) {
            	combinaciones6.add(combinacion6[i]);
            }
        } while (nextPermutation(combinacion6));
		do {
			for(int i=0;i<combinacion7.length;i++) {
            	combinaciones7.add(combinacion7[i]);
            }
        } while (nextPermutation(combinacion7));
		do {
			for(int i=0;i<combinacion8.length;i++) {
            	combinaciones8.add(combinacion8[i]);
            }
        } while (nextPermutation(combinacion8));
		
	}

	/**
	 * Método que hace el producto de la matriz H por cada permutación array por array
	 * cada bucle while realiza el producto en un array de combinaciones y almacena el resultado en los arrays
	 * sindromes_X correspondientes
	 */
	private static void productoPermutaciones() {
		int[][] tmp= new int[matrizGeneradora[0].length][1];
		int i=0;
		//Introducimos las permutaciones para multiplicarlas por H
		//Estas son las permutaciones 0
		while(i+matrizGeneradora[0].length<=combinaciones0.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones0.get(i+j);
			}
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(i=0;i<producto.length;i++) {
				for(int j=0 ; j<producto[0].length; j++) {
					sindromes_0.add(producto[i][j]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		//Estas son las permutaciones 1
		while(i+matrizGeneradora[0].length<=combinaciones1.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones1.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_1.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		
		//Estas son las permutaciones 2
		while(i+matrizGeneradora[0].length<=combinaciones2.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones2.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_2.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		
		//Estas son las permutaciones 3
		while(i+matrizGeneradora[0].length<=combinaciones3.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones3.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_3.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		//Estas son las permutaciones 4
		while(i+matrizGeneradora[0].length<=combinaciones4.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones4.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_4.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		//Estas son las permutaciones 5
		while(i+matrizGeneradora[0].length<=combinaciones5.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones5.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_5.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		//Estas son las permutaciones 6
		while(i+matrizGeneradora[0].length<=combinaciones6.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones6.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_6.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		//Estas son las permutaciones  7
		while(i+matrizGeneradora[0].length<=combinaciones7.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones7.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_7.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
		
		i=0;
		//Estas son las permutaciones 8
		while(i+matrizGeneradora[0].length<=combinaciones8.size()) {
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				tmp[j][0]=combinaciones8.get(i+j);
			}
			
			int [][] producto= multiplicaPermutaciones(tmp, H);
			
			for(int k=0;k<producto.length;k++) {
				for(int l=0 ; l<producto[0].length; l++) {
					sindromes_8.add(producto[k][l]);
				}
			}
			
			i=i+matrizGeneradora[0].length;
		}
	}
	
	/**
	 * Método que realiza las permutaciones de los errores
	 * @param array
	 * @return
	 */
	private static boolean nextPermutation(int[] array) {

        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        
        return true;
    }

	/**
	 * Método que corrije y almacena las palabras código
	 * @return ArrayList con las palabras a decodificar
	 */
	private static void obtenerCodigoFinal() {
		// TODO Auto-generated method stub
		/*
		 * Dentro de los conjuntos de matrizGeneradora[0].length, debemos diferenciar entre los dígitos para decodificar el mensaje
		 * y el ruido.
		 */
		
		int i=0;
		int j=0;
		int[][] arrayCod = new int [matrizGeneradora[0].length][1];
		int[] bloque= new int[matrizGeneradora[0].length];
		
		//Cogemos bloques de 12 digitos
		while(i+matrizGeneradora[0].length<=lista.length) {
			for(j=0 ; j<matrizGeneradora[0].length; j++) {
				//Dividimos en bloques de matrizGeneradora[0].length dígitos
				arrayCod[j][0]= lista[i+j];
				//Hacemos una copia para luego restarle el error patrón
				bloque[j]=lista[i+j];
				
			}
			
			//Hallamos el síndrome del bloque extraído, almacenandolo en tmp
			//Dentro de tmp hay 9 digitos que corresponden al producto de H*arrayCod (Bloque de matrizGeneradora[0].length digitos)
			ArrayList<Integer> tmp= multiplicaPalabras(arrayCod, H);
			
			
			/*
			 * Este valor determina si la palabra tiene error o no, si devuelve -1 en el texto a desencriptar
			 * introducimos el bloque origina, y si tiene error lo reemplazamos por el de array de permutaciones
			 */
			int[] error_patron=comparaErrores(tmp);
			
			//En función de si hay error o no corregimos la palabra
			if(error_patron!=null) {//Hay error
				int[] palabraCorregida=restarError(bloque, error_patron);
				
				for(int k=0;k<arrayCod.length;k++) {
					codigoFinal.add(palabraCorregida[k]);
				}
			}
			else {//No hay error
				for(int k=0;k<arrayCod.length;k++) {
					codigoFinal.add(bloque[k]);
				}
			}
			
			//Pasamos al siguiente bloque
			i+=matrizGeneradora[0].length;
		}
	}
	
	
	/**
	 * Método que coge el array corregido, lo trocea y decodifica
	 */
	private static void decodificar() {
		// TODO Auto-generated method stub
		//Como en este caso la identidad es de tamaño 3, cogemos los 3 primeros elementos
		int[] bloque= new int[matrizGeneradora[0].length];
		int i=0;
		while(i+matrizGeneradora[0].length<=codigoFinal.size()) {
			//Almacenamos los 12 primeros
			for(int j=0 ; j<matrizGeneradora[0].length; j++) {
				bloque[j]=codigoFinal.get(i+j);
			}
			
			//Añadimos solo los 3 primeros eliminando así el ruido
			for(int j=0 ; j<matrizGeneradora.length; j++) {
				decodificacion.add(bloque[j]);
			}
			
			//Pasamos al siguiente bloque
			i=i+matrizGeneradora[0].length;
		}
		
		/*
		 * En las siguientes líneas comprobamos que no haya cola dentro del código que nos han dado para
		 * decodificar. De ser así cogemos los dígitos que constituyan la cola y los añadimos al arraylist
		 * con el código final a descifrar
		 */
		
		int mod = lista.length%matrizGeneradora[0].length;
		if(mod>0) {
			int [] cola = new int [mod];
			for(int k=i; k<lista.length; k++){
				cola[k-i] = lista[k];
				decodificacion.add(cola[k-i]);
			}
		}
		
		//Decodificamos las palabras
		i=0;
		int k=0;
		
		//Array para guardar los bloques y decodificar
		int [] arrayCodigoLetra = new int [longitudAlfabeto2];
		
		//Array donde guardaremos una a una las letras decodificadas
		char [] arrayLetras = new char [decodificacion.size()/longitudAlfabeto2];
		
		
		while(i+longitudAlfabeto2<=decodificacion.size()) {
			//Con este bucle for conseguimos los 5 elementos de cada bloque para conseguir el símbolo buscado.
			for(int j=0 ; j<longitudAlfabeto2; j++) {
				arrayCodigoLetra[j] = decodificacion.get(i+j);
			}
			
			//Llamamos al método para traducir la letra y la añadimos a un array
			arrayLetras[k] = traducirLetra(arrayCodigoLetra, alf);
			k++;
			i = i+longitudAlfabeto2;
		}
		
		ArrayList<Character> texto= new ArrayList<Character>();
		
		//Pasamos el array a un arraylist para eliminar los espacios dobles
		for(int j=0 ; j<arrayLetras.length; j++) {
			texto.add(arrayLetras[j]);
		}
	
		//Sustituimos los espacios seguidos por saltos de linea
		for(int j=0 ; j<texto.size(); j++) {
			if(j<texto.size()-1) {
				if(texto.get(j)==' ' && texto.get(j+1)==' ') {
					texto.set(j, '\n');
					texto.remove(j+1);
				}
			}
		}
		
		//Imprimimos la solución final
		System.out.println("Mensaje decodificado: ");
		for(int j=0 ; j<texto.size(); j++) {
			System.out.print(texto.get(j));
		}
		
	}
	
	
	/**
	 * Método para restar el error a la palabra código
	 * @param arrayCod
	 * @param error_patron
	 * @return
	 */
	private static int[] restarError(int[] arrayCod, int[] error_patron) {
		// TODO Auto-generated method stub
		int[] retorno= new int[arrayCod.length];
		//Resta coordenada a coordenada ambos arrays y devuelve el resultado
		for(int i=0;i<arrayCod.length;i++) {
			int x= arrayCod[i];
			int y= error_patron[i];
			int resultado= x-y;
			if(resultado==-2) {
				resultado=1;
			}
			else if(resultado==-1) {
				resultado=2;
			}
			retorno[i]= resultado;
		}
		return retorno;
		
	}

	/**
	 * Método en el que comparamos el síndrome de la palabra con los síndromes de las permutaciones
	 * En cada bucle while compara uno de los arrays con las combinaciones de los síndromes multiplicados
	 * por la matriz de control (sindromes_0, sindromes_1, ...)
	 * @param tmp síndrome de la palabra correspondiente
	 * @return posición del error patrón para extraerlo
	 */
	private static int[] comparaErrores(ArrayList<Integer> tmp) {
		// TODO Auto-generated method stub
		//Recorremos la lista de sindromes_permutaciones buscando uno igual
		int i=0;
		
		//Representa la posición del síndrome para luego buscarlo en el error patrón
		int contador=0;
		ArrayList<Integer> bloque= new ArrayList<Integer>();
		int[] retorno= new int[matrizGeneradora[0].length];
		//Realizamos este proceso con los arrays de permutaciones
		while(i<sindromes_0.size()) {
			//Extraemos los errores de las permutaciones para comparar si es igual al del parámetro
			for(int k=0; k<9; k++){
				bloque.add(sindromes_0.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos en un int el error patron correspondiente a devolver
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones0.get(k);
				}
				return retorno;
			}
			
			//Limpiamos el array para la siguiente iteración y que no se acumulen los resultados ya escaneados
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		while(i<sindromes_1.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_1.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones1.get(pos+k);
				}
				
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		while(i<sindromes_2.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_2.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones2.get(pos+k);
				}
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		while(i<sindromes_3.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_3.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones3.get(pos+k);
				}
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		//4
		while(i<sindromes_4.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_4.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones4.get(pos+k);
				}
				
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		//5
		while(i<sindromes_5.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_5.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones5.get(pos+k);
				}
				
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		//6
		while(i<sindromes_6.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_6.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones6.get(pos+k);
				}
				
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		//7
		while(i<sindromes_7.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_7.get(i+k));
			}

			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones7.get(pos+k);
				}
				
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		
		bloque.clear();
		i=0;
		
		while(i<sindromes_8.size()) {
			for(int k=0; k<9; k++){
				bloque.add(sindromes_8.get(i+k));
			}
			
			if(tmp.equals(bloque)) {
				//Almacenamos el error patron correspondiente a devolver en los arrays de permutaciones
				int pos= ((i)/9)*matrizGeneradora[0].length;
				for(int k=0;k<matrizGeneradora[0].length;k++){
					retorno[k]=combinaciones8.get(pos+k);
				}
				
				return retorno;
			}
			bloque.clear();
			contador++;
			i+=tmp.size();			
		}
		return null;
	}

	/**
	 * Método para calcular la matriz de control
	 * @param original
	 * @return
	 */
	public static int[][] matrizTraspuestaYNegativa(int[][] original) {
		int[][] traspuesta= new int[original[0].length][original.length];
		
		//Calculamos la matriz traspuesta de A
		for (int x = 0; x < original.length; x++){
			for (int y = 0; y < original[x].length; y++){
				traspuesta[y][x] = original[x][y];
			}
		}
		
		//Pasamos los valores de A a negativo
		for (int x = 0; x < traspuesta.length; x++){
			for (int y = 0; y < traspuesta[x].length; y++){
				traspuesta[x][y] = traspuesta[x][y]*-1;
				if(traspuesta[x][y]==-1) {
					traspuesta[x][y]=2;
				}
				else if(traspuesta[x][y]==-2) {
					traspuesta[x][y]=1;
				}
			}
		}
		
		int [][] identidad= new int[traspuesta.length][traspuesta.length];
		
		//Hallamos la identidad correspondiente
		for (int x = 0; x < identidad.length; x++){
			for (int y = 0; y < identidad.length; y++){
				if(x==y) {
					identidad[x][y]=1;
				}
				else {
					identidad[x][y]=0;
				}
			}
		}
		
		int[][] H= new int[traspuesta.length][identidad[0].length+traspuesta[0].length];
		
		//Añadimos A traspuesta y negativa a H
		for(int i=0;i<traspuesta.length;i++) {
			for(int j=0;j<traspuesta[0].length;j++) {
				H[i][j]=traspuesta[i][j];
			}
		}
		
		//Añadimos la identidad a H
		for(int i=0;i<identidad.length;i++) {
			for(int j=0;j<identidad[0].length;j++) {
				H[i][j+traspuesta[0].length]=identidad[i][j];
			}
		}
		
		return H;
	}
	
	/**
	 * Método para multiplicaPalabrasr dos matrices
	 * @param A
	 * @param B
	 * @return
	 */
	public static ArrayList<Integer> multiplicaPalabras (int [][] arrayCod, int [][] H){
	       // filas de la matriz A
	       int m= H[0].length;
	       // columnas de la matriz B
	       int o= arrayCod.length;
	       // nueva matriz 
	       ArrayList<Integer> C= new ArrayList<Integer>();
	       
	       //matrizBinaria = new int [H.length][arrayCod[0].length];
	       // se comprueba si las matrices se pueden multiplicaPalabrasr
	       if (m==o){
	         for (int i=0; i<H.length;i++){
	            for (int j=0; j<arrayCod[0].length;j++){
	             //aqui se multiplica la matriz
	              int a=0;
	              for(int k=0;k<o;k++){
	                  a=a+H[i][k]*arrayCod[k][j];
	              }
	              C.add(a%base);
	              
	              //Añadimos el contenido al arraylist de sindromes
	              sindromes_palabras.add(a%base);
	            }

	         }
	         return C;
	       }
	       return null;
	    }
	
	/**
	 * Método para multiplicar dos matrices
	 * @param A
	 * @param B
	 * @return 
	 * @return
	 */
	public static int[][] multiplicaPermutaciones (int [][] arrayCod, int [][] H){
	       // filas de la matriz A
	       int m= H[0].length;
	       // columnas de la matriz B
	       int o= arrayCod.length;
	       // nueva matriz 
	       int [][] C= new int [H.length][arrayCod[0].length];
	       
	       //matrizBinaria = new int [H.length][arrayCod[0].length];
	       // se comprueba si las matrices se pueden multiplicaPalabrasr
	       if (m==o){
	         for (int i=0; i<C.length;i++){
	            for (int j=0; j<C[0].length;j++){
	             //aqui se multiplica la matriz
	              int a=0;
	              for(int k=0;k<o;k++){
	                  a=a+H[i][k]*arrayCod[k][j];
	              }
	              C[i][j]=a%3;
	              
	              //Añadimos el contenido al arraylist de sindromes
	              //sindromes_palabras.add(a%2);
	            }

	         }
	       }
	       return C;
	    }
	
	/**
	 * 
	 * Método para traducir los símbolos en ternario a texto plano
	 * 
	 * @param codigoLetra
	 * @param alf2
	 * @return
	 */
	public static char traducirLetra(int [] codigoLetra, char [] alf2) {
		
		int sumaCodigo = 0;
		int potencia = 0;
		
		for(int i=codigoLetra.length-1 ; i>=0 ; i--){
			if(codigoLetra[i] ==1){
				sumaCodigo = sumaCodigo + calcularPotencia(potencia, 1);
			}
			else if(codigoLetra[i] ==2){
				sumaCodigo = sumaCodigo + calcularPotencia(potencia, 2);
			}
			potencia++;
		}
		return alf[sumaCodigo];
	}
	
	public static int calcularPotencia(int potencia, int valor){
		
		if(potencia != 0){
			if(valor==1) {
				for(int i=0 ; i<potencia ; i++){
					valor = valor * 3;
				}
				return valor;
			}
			else {
				for(int i=0 ; i<potencia ; i++){
					valor = valor * 3;
				}
				return valor;
			}
		}
		
		return valor;
	}

}

