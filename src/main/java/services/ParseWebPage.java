
package services;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ParseWebPage {
    private Document document;
    private Elements elements;

    public String getHtmlCodeWebPage() throws IOException {
        String url = "https://smart-lab.ru/q/Shares/";
        document = Jsoup.connect(url).get();
        String htmlCode = String.valueOf(document);
        FileWriter fileWriter = new FileWriter("src/main/resources/parsingStock.html");
        fileWriter.write(url);
        fileWriter.write(htmlCode);
        return htmlCode;

    }
    public void getNameAndPrice () {
//        System.out.println(document);

//        Elements nameStock = document.select("Газпром");
//        System.out.println(nameStock);


        elements = document.select(".main__table");
//        System.out.println(elements);
        elements.forEach(element -> {
            String name = element.select(".trades-table__name").text();
            String price = element.select(".trades-table__price").text();
            System.out.println(name + price);
        });
    }
}

//        String url = "https://ru.investing.com/equities/russia";
//        document = Jsoup.connect(url).get(); // Jsoup библиотека для работы с веб ресурсами
//        String htmlCode = String.valueOf(document); // из документа, сделать строковую данные String
//        FileWriter fileWriter = new FileWriter("src/main/resources/parsingInvesting.html");
//        fileWriter.write(htmlCode);
//        return htmlCode;

//        String fileName = "parsingInvesting.html";
//        Document doc = Jsoup.connect(url).get();
//        File file = new File("src/main/resources/" + fileName);
//        FileWriter writer = new FileWriter(file);
//        writer.write(doc.html());
//        writer.close();



