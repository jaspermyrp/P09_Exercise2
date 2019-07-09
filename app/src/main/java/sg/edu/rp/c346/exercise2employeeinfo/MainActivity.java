package sg.edu.rp.c346.exercise2employeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    ArrayList<Employee> alEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        alEmployees = new ArrayList<Employee>();

        Employee employee0 = new Employee("Jasper","Test", 0.0);
        Employee employee1 = new Employee("Jasperr", "Test 2", 1.0);

        alEmployees.add(employee0);
        alEmployees.add(employee1);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, alEmployees);
        lv.setAdapter(adapter);



    }
}
