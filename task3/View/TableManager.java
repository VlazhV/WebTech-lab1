package task3.View;

public class TableManager {
    public char tableDelimiter = '|';
    private String table = "";

    public TableManager(char delimiter, String columnName1, String columnName2) {
        this.tableDelimiter = delimiter;
        String caption = String.format("%c%8s %c %8s%c\n---------------------\n", tableDelimiter, columnName1, tableDelimiter, columnName2, tableDelimiter);
        table = caption;

    }

    public void addLine(double value1, double value2) {
        String newLine = String.format("%c%8.3f %c %8.3f%c\n---------------------\n", tableDelimiter, value1, tableDelimiter, value2, tableDelimiter);
        table = table.concat(newLine);
    }

    public void addLines(double[][] values) {
        for (double[] valuePair : values){
            this.addLine(valuePair[0], valuePair[1]);
        }
    }

    public String getTable(){
        return table;
    }
}
