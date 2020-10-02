public class Counter {
    public int acMilanPoints = 0;
    public int realMadridPoints = 0;

    public String getCount() {
        return "Result: " + acMilanPoints + "X" + realMadridPoints;
    }


    public String getWinner() {
        if (acMilanPoints == realMadridPoints) {
            return "Ничья";
        }
        else if (acMilanPoints > realMadridPoints) {
            return "AC Milan";
        }
        else return "Real Madrid";
    }
}