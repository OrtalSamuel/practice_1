package com.example.practice_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity_Menu extends AppCompatActivity {

    private ArrayList<Meal> meals=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

       // Meal meal = new Meal();
      //  meal.setName("Pizza");
      //  meal.setCalories(400);
      //  meal.setKosher(true);
        //ArrayList<String> arr=new ArrayList<>();
        //arr.add("dough");
       // arr.add("Mozzarella");
       // arr.add("onion");
       // arr.add("jalapeno");
       // meal.setIngredients(new ArrayList<>(Arrays.asList(
        //        "dough",
        //        "Mozzarella",
        //        "onion",
        //        "jalapeno"
        //)));
        //meal.setPrice(60.0);

        //Builder for create meal
        meals.add(new Meal()
                .setName("Pizza")
                .setCalories(400)
                .setKosher(true)
                .setIngredients(new ArrayList<>(Arrays.asList(
                        "dough",
                        "mozzarella",
                        "onion",
                        "jalapeno"
                )))
                    .setPrice(60.0)
                    .setCooking(new Cooking("italian").setTemp(180).setDuration(300))
        );

       // Meal meal2 = new Meal();
      //  meal2.setName("Pasta");
      //  meal2.setCalories(300);
      //  meal2.setKosher(true);
        //ArrayList<String> arr2=new ArrayList<>();
        //arr2.add("dough");
        //arr2.add("Mozzarella");
        //arr2.add("onion");
        //arr2.add("jalapeno");
       // meal2.setIngredients(new ArrayList<>(Arrays.asList("pasta","tomato","basil")));

      //  meal2.setPrice(50.0);
      //  meals.add(meal2);

        //BUILLDER - to create the objects more easier
        meals.add(
                new Meal().setName("Pasta").setCalories(300).setKosher(true).setIngredients(new ArrayList<>(Arrays.asList(
                "pasta",
                "tomato",
                "basil"
                ))).setPrice(50.0)
        );
        //To create pupUp
        // Toast.makeText(this,"Hello World",Toast.LENGTH_LONG).show();

        //Toast t =Toast.makeText(this,"Hello World",Toast.LENGTH_LONG);

        Toast t = new Toast(this);
        t.setText("Hello world");
        t.setDuration(Toast.LENGTH_LONG);
        t.show();

        //MORE BIG popUP
        new MaterialAlertDialogBuilder(this)
                .setIcon(R.drawable.ic_help)
                .setTitle("Warning!")
                .setMessage("ARE TOU SURE YOU WANT to delete this entry ?")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .show();
    }
}