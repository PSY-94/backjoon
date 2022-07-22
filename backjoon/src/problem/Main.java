package problem;

import java.util.Scanner;

/*
public class Main {
	public static void main(String[] args) {
	}
}
*/

public class Main {
	public static void main(String[] args) {
	}
}

/* 2480번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A==B && B==C && A==C) {
			System.out.println(10000+A*1000);
		} else if (A == B || A == C) {
			System.out.println(1000+A*100);
		} else if (B==C) {
			System.out.println(1000+B*100);
		} else {
			System.out.println(Math.max(A, Math.max(B, C))*100);
		}
	}
}
*/

/* 2525번
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int A = sc.nextInt();
		int B = H * 60 + M + A;
		H = B/60;
		M = B%60;
		if (H>=24) {
			H = H - 24;
		}
		System.out.println(H + " " + M);
	}
}
*/

/* 2884번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if (M - 45 < 0) {
				H -= 1;
				M = 60 - (45 - M);
				if (H < 0) {
					H = 23;
				}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
*/

/* 14681번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		} else if (x < 0 && y < 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
}
*/

/* 2753번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		if (A % 4 == 0 && !(A % 100 == 0) || A % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
*/

/* 9498번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		if (A >= 90) {
			System.out.println("A");
		} else if (A >= 80) {
			System.out.println("B");
		} else if (A >= 70) {
			System.out.println("C");
		} else if (A >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
*/

/* 1330번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A < B) {
			System.out.println("<");
		} else if (A > B) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
	}
}
*/

/* 25083번 문제
public class Main {
	public static void main(String[] args) {
		System.out.println("         ,r'\"7");
		System.out.println("r`-_   ,'  ,/");
		System.out.println(" \\. \". L_r'");
		System.out.println("   `~\\/");
		System.out.println("      |");
		System.out.println("      |");
	}
}
*/

/* 2588번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A * (B % 10));
		System.out.println(A * ((B / 10) % 10));
		System.out.println(A * (B / 100));
		System.out.println(A * B);
	}
}
*/

/* 10430번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println(A*B%C);
		System.out.println(((A%C)*(B%C))%C);
	}
}
*/

/* 18108번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println( y - 543);
	}
}
*/

/* 10926번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(A + "??!");
	}
}
*/

/* 10869번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}
}
*/

/* 1008번 문제
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println((double)A / B);
	}
}
*/

/* 10998번 문제
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println(A * B);
	}
}
*/

/* 1001번 문제
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println(A - B);
	}
}
*/

/* 1000번 문제
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		System.out.println(A + B);
	}
}
*/

/* 10172번 문제
public class Main {
	public static void main(String[] args) {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
}
*/

/* 10171번 문제
public class Main {
	public static void main(String[] args) {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
}
*/

/* 10718번 문제
public class Main {
	public static void main(String[] args) {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
}
 */

/* 2557번 문제
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
*/