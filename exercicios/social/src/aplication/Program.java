package aplication;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Comment comment1 = new Comment("have a nice trip\n");
        Comment comment2 = new Comment("Wow that´s awesome!\n");

        Post post1 = new Post(
                sdf.parse("21/06/2018 13:05:44"), "\nTraveling to New Zealand",
                "I´m going to visit this wonderful country!",12);

        post1.addComment(comment1);
        post1.addComment(comment2);

        Comment comment3 = new Comment("Good night.\n");
        Comment comment4 = new Comment("May the force be whith you.");

        Post post2 = new Post(
                sdf.parse("28/07/2018 23:14:19 "),"Good night guys "
                ,"See you tomorrow",5);

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println(post2);

    }
}
