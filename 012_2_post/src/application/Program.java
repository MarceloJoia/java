package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Fazer boa viagem");
		Comment c2 = new Comment("Uau que incrível!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajar para a Nova Zelândia",
				"Vou visitar este país maravilhoso!", 12);
		// Adicionar os comentários.
		p1.addComments(c1);
		p1.addComments(c2);

		Comment c3 = new Comment("Boa noite");
		Comment c4 = new Comment("Que a força esteja com você");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
								"Boa noite, galera", "Vejo você amanhã", 5);
		p2.addComments(c3);
		p2.addComments(c4);

		System.out.println(p1);
		System.out.println(p2);

		sc.close();
	}
}
