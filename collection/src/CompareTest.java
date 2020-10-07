import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {

    @Test
    public void test1(){

        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovoMouse",34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("microsoftMouse",43);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        Arrays.sort(arr,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                }
                throw new RuntimeException("datatype does not match");
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test4(){
        Goods[] arr = new Goods[6];
        arr[0] = new Goods("lenovoMouse",34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("huaweiMouse",224);
        arr[5] = new Goods("microsoftMouse",43);

        Arrays.sort(arr, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        if (o1 instanceof Goods && o2 instanceof Goods) {
                            Goods g1 = (Goods) o1;
                            Goods g2 = (Goods) o2;
                            if (g1.getName().equals(g2.getPrice())) {
                                return -Double.compare(g1.getPrice(), g2.getPrice());
                            } else {
                                return g1.getName().compareTo(g2.getName());
                            }
                        }
                        throw new RuntimeException("datatype does not match");
                    }


    }
        );
        System.out.println(Arrays.toString(arr));
    }

}
