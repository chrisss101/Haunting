public class Haunting {
    String[][] faceFeatures;
    public Haunting(String[][] faceFeatures) {
        this.faceFeatures = faceFeatures;

    }
    public void edit(String replace, int row,int column ) {
        faceFeatures[row][column] = replace;
    }
    public void fill(String str ) {
        for (int i = 0; i < faceFeatures[i].length; i++) {
            for (int j = 0; j < faceFeatures[j].length; j++) {
                faceFeatures[i][j] = str;
            }
        }
    }
    public String toString() {
        String show = "";
        for (int i = 0; i < faceFeatures[i].length; i++) {

            for (int j = 0; j < faceFeatures[j].length; j++) {
                show += faceFeatures[i][j];

            }
            show += "\n";
        }
        return show;
    }
}