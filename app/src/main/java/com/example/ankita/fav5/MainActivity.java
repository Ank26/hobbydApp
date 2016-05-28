package com.example.ankita.fav5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    static  HashMap<String, String> hobbyDetailsMap = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadHobbyDetailsMap();
       }

    public void openDetail(View view){

        TextView callerTextView = (TextView) findViewById(view.getId());

        String hobbyName = callerTextView.getText().toString();
        Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
        detailIntent.putExtra("view_name",hobbyName);
        startActivity(detailIntent);

    }

    private HashMap loadHobbyDetailsMap(){

        hobbyDetailsMap.put("Music","Music:\n" +
                "# One good thing about music, when it hits you, you feel no pain.\n" +
                "\n" +
                "# Understand me or my music, its same.\n" +
                "\n" +
                "# Just close your eyes and hear that song…you know the one.\n" +
                "\n" +
                "# Saregama India Limited is an Indian Music company founded in the year 1946. Earlier the company was known as The Gramophone Company of India. Saregama is one of the best labels of this company.\n" +
                "\n" +
                "# A Grammy Award (originally called Gramophone Award), or Grammy, is an honor awarded by the National Academy of Recording Arts and Sciences (NARAS) of the United States to recognize outstanding achievement in the mainly English-language music industry. The annual presentation ceremony features performances by prominent artists, and the presentation of those awards that have a more popular interest. It shares recognition of the music industry as that of the other performance awards such as the Emmy Awards (television), the Tony Awards (stage performance), and the Academy Awards (motion pictures).\n" +
                "\n" +
                "\n" +
                "# Pandit Ravi Shankar was one of the best known exponents of the Sitar as well as a composer of Hindustani Classical Music.\n" +
                "He has won Three Grammy awards including a Lifetime Achievement Grammy!");
        hobbyDetailsMap.put("Photography","Photography:\n" +
                "# Taking an image, freezing a moment, reveals how rich reality truly is.\n" +
                "— Anonymous\n" +
                " \n" +
                "\n" +
                "# Photography is a way of feeling, of touching, of loving. What you have caught on film is captured forever… It remembers little things, long after you have forgotten everything.\n" +
                "— Aaron Siskind\n" +
                " \n" +
                "\n" +
                "# We are making photographs to understand what our lives mean to us.\n" +
                "— Ralph Hattersley\n" +
                "# Mix artificial and natural light for ideal city night shots\n");
        hobbyDetailsMap.put("Painting","# Painting is an illusion, a piece of magic, so what you see is not what you see. Philip Guston\n" +
                "\n" +
                "\n" +
                "# Painting is silent poetry, and poetry is painting that speaks. \n" +
                "Plutarch\n" +
                "\n" +
                "\n" +
                "# Painting is self-discovery. Every good artist paints what he is. \n" +
                "Jackson Pollock\n" +
                "\n" +
                "# Through a painting we can see the whole world. \n" +
                "Hans Hofmann\n" +
                "\n" +
                "# Every viewer is going to get a different thing. That's the thing about painting, photography, cinema. \n" +
                "David Lynch\n");
        hobbyDetailsMap.put("Travelling","Travel:\n" +
                "# Life is short and we have never too much time for gladdening the hearts of those who are travelling the dark journey with us. Oh be swift to love, make haste to be kind. Henri Frederic Amiel\n" +
                "\n" +
                "\n" +
                "# The trouble with travelling back later on is that you can never repeat the same experience. \n" +
                "Michael Palin\n" +
                "\n" +
                "# The use of travelling is to regulate imagination by reality, and instead of thinking how things may be, to see them as they are. \n" +
                "Samuel Johnson\n" +
                "\n" +
                "# The world is a book, and those who do not travel read only a page. \n" +
                "Saint Augustine\n" +
                "\n" +
                "\n" +
                "# A man travels the world over in search of what he needs and returns home to find it.\n" +
                "George A. Moore");
        hobbyDetailsMap.put("Tech","Tech:\n" +
                "#  It's hard enough to find an error in your code when you're looking for it; it's even harder when you've assumed your code is error-free. \n" +
                "Steve McConnell\n" +
                "\n" +
                "# If debugging is the process of removing software bugs, then programming must be the process of putting them in. \n" +
                "Edsger Dijkstra\n" +
                "\n" +
                "#  Rules of Optimization:\n" +
                "Rule 1: Don't do it.\n" +
                "Rule 2 (for experts only): Don't do it yet.\n" +
                "Michael A. Jackson\n" +
                "\n" +
                "#  Walking on water and developing software from a specification are easy if both are frozen. \n" +
                "Edward V Berard\n" +
                "\n" +
                "# It's not at all important to get it right the first time. It's vitally important to get it right the last time. \n" +
                "Andrew Hunt and David Thomas");
        hobbyDetailsMap.put("Cooking","Cooking:\n" +
                "# Store spices in a cool, dark place, not above your stove. Humidity, light and heat will cause herbs and spices to lose their flavor.\n" +
                "Rick Tramonto\n" +
                "\n" +
                "# If you're cooking for someone important — whether it's your boss or a date — never try a new recipe and a new ingredient at the same time.\n" +
                "Marcus Samuelsson\n" +
                "\n" +
                "# For rich, creamy dressings made healthy, substitute half the mayo with Greek-style yogurt.\n" +
                "Ellie Krieger\n" +
                "\n" +
                "# If you find you need more oil in the pan when sautéing, add it in a stream along the edges of the pan so that by the time the oil reaches the ingredient being cooked, it will be heated.\n" +
                "Anita Lo\n" +
                "\n" +
                "# For best results when you're baking, leave butter and eggs at room temperature overnight.\n" +
                "Ina Garten");
        return hobbyDetailsMap;

    }



}
