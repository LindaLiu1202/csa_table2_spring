package com.nighthawk.spring_portfolio.mvc.jokes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data  // Annotations to simplify writing code (ie constructors, setters)
@NoArgsConstructor
@AllArgsConstructor
@Entity // Annotation to simplify creating an entity, which is a lightweight persistence domain object. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.
public class Jokes2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    private String joke;

    private int haha;
    private int boohoo;

    // starting jokes
    public static String[] init() {
        final String[] jokesArray2 = {
            "Q: Why couldn't the photographer see straight? A: He took too many shots.",
            "Q: Why did the photographer throw their tripod in the lake? A: One of the legs was loose and they couldn't stand it anymore.",
            "Life is like photography. You use the negatives to develop.",
            "Q: What’s the difference between a large pepperoni pizza and a struggling photographer? A: A large pepperoni pizza can feed a family of four.",
            "Q: How to irritate the photographer? A: Ask them 'After you take that shot with your camera, can you take one with my phone?'",
            "The fastest way to make money from photography is to sell your camera.",
            "Hooray! It's friday! Oh wait. I'm a photographer.",
            "Q: How many photographers does it take to change a light bulb? A: None. When it gets dark, we just use a higher ISO.",
            "Q: What’s a aliens favorite computer key? A: the space bar!",
            "Why did the photo critic marry the photographer? She liked his perspective.",
            "We all have photographic memory. Just some of us are lacking the film.",
            "Q: Did you hear about the photographer who ran out of subjects? A: He shot himself.",
            "Q: What did the photographer say when he retired? A: 'I can't take it anymore!'",
            "Q: Why was the musician also a great photographer? A: He knew a good composition when he saw one.",
            "Q: What happened to the man who had a lot of bad encounters with cameras in his childhood? A: He experienced a lot of flashbacks.",
            "Q: Why do cameras who are self-obsessed take a lot of photos that have a blurred background? A: They like to keep the focus on themselves."
        };
        return jokesArray2;
    }
}