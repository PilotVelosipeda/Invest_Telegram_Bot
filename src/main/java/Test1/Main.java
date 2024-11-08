
package Test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String url = "https://smart-lab.ru/q/Shares/";
        String fileName = "investing_page.html";
        String resourcesPath = "src/main/resources"; // Путь к папке resources
        // Создаем объект URL
        URL website = new URL(url);
        // Открываем подключение к сайту
        URLConnection connection = website.openConnection();
        // Читаем данные с сайта
        Scanner scanner = new Scanner(connection.getInputStream());
        StringBuilder htmlContent = new StringBuilder();
        while (scanner.hasNextLine()) {
            htmlContent.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        // Сохраняем данные в файл
        try (FileWriter fileWriter = new FileWriter(resourcesPath + "/" + fileName)) {
            fileWriter.write(htmlContent.toString());
                    }
                }
            }


