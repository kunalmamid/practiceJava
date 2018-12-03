import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class studentsScore {

    public static void main(String[] args) {
        List<Pair<String, Double>> l = new ArrayList<Pair<String, Double>>();

        l.add(new Pair<String, Double>("Harry",37.21));
        l.add(new Pair<String, Double>("Berry",38.21));
        l.add(new Pair<String, Double>("Tina",37.2));
        l.add(new Pair<String, Double>("Akriti",41.0));
        l.add(new Pair<String, Double>("Hafiza",39.0));

        double first=Double.MAX_VALUE;
        double second=Double.MAX_VALUE;

        Pair <String,Double> ans1 = new Pair<String, Double>("",00.00);
        Pair <String,Double> ans2 = new Pair<String, Double>("",00.00);

        for (Pair<String,Double> temp: l){

            double val=temp.getValue();

            if (val < first)
            {
                second=first;
                first=val;
                ans2=ans1;
                ans1=temp;

            }
            else if (val < second && val != first)
            {
                second=val;
                ans2=temp;
            }
        }

        System.out.println(ans2.getKey() + ":" + ans2.getValue());


    }
}
