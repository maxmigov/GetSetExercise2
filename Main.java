public class Main {
    public static void main(String[] args) {

        PaperDocument document1 = new PaperDocument("Contract", " Java Developer Hiring " +
                "Contract", "1. Working hours per day: 6\n2. Earn per hour: 15EUR\n3. " +
                "Holidays per year: 30days.");
        PaperDocumentInterface document2 = Xerox.copy(document1);
        document2.setType("Contract Copy");
        PaperDocumentInterface document3 = Xerox.copy(document1);
        document3.setType("Archived Contract Copy");
        PaperDocumentInterface document4 = Xerox.copy(document1);
        document4.setType("Archived Contract Copy");
        PaperDocumentInterface document5 = Xerox.copy(document1);
        document5.setType("Archived Contract Copy");


        /*for (String s : documentArray)){
            System.out.println(documentArray.get(i));
        }*/
        System.out.println(document2);
        System.out.println(document3);
        System.out.println(document4);
        System.out.println(document5);


    }
}
