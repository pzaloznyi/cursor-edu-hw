package HW1.task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Districts extends ArrayList<District> {
    private final ArrayList<District> districts;
    private final FireDepartment fireDepartment;

    public Districts() {
        districts = new ArrayList<>();
        fireDepartment = new FireDepartmentImpl();
    }

    public ArrayList<District> generate() {
        var districtNumbers = shuffleArray(new int[]{1,2,3,4,5,6,7,8,9,10});
        for (var num : districtNumbers)
            districts.add(new District("District " + num, fireDepartment));
        return districts;
    }

    static int[] shuffleArray(int[] ar)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }
}
