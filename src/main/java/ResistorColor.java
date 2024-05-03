import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColor {
    Map<String, Integer> map = new LinkedHashMap<>();

    public ResistorColor() {
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
    }

    int colorCode(String color) {
        if(!map.containsKey(color)){
            throw new IllegalArgumentException("This color does not exist");
        }
        return map.get(color);
    }

    String[] colors() {
        String[] colors = new String[map.size()];
        int idx = 0;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            colors[idx++] = m.getKey();
        }
        return colors;
    }
}
