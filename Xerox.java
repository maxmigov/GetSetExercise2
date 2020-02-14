import java.util.ArrayList;
import java.util.List;

public class Xerox {

    public static PaperDocumentInterface copy(PaperDocumentInterface original){
        return new PaperDocument(original.getType(), original.getTitle(), original.getContent());
    }

    public List<PaperDocumentInterface> copy(PaperDocumentInterface original, int quantity){

        ArrayList<PaperDocumentInterface> documentArray = new ArrayList<PaperDocumentInterface>();
        documentArray.add(new PaperDocument(original.getType(), original.getTitle(), original.getContent()));
        return documentArray;

    }

}
