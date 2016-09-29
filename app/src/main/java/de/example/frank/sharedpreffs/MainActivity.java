package de.example.frank.sharedpreffs;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        Map<String,?> values = preferences.getAll();
        System.out.println(values.isEmpty());
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("name", "Frank");
        values = preferences.getAll();
        System.out.println(values.isEmpty());
        editor.commit();
        System.out.println(values.isEmpty());
        System.out.println(preferences.getString("name","kein name"));
        System.out.println(preferences.getString("alter","kein alter"));

    }
}
