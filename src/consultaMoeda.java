import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultaMoeda {
    public double buscarTaxa(String moedaOrigem, String moedaDestino) {
        String endereco = "https://v6.exchangerate-api.com/v6/8f6a944ebf1203e7262def06/pair/"
                + moedaOrigem + "/" + moedaDestino;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonElement elemento = JsonParser.parseString(response.body());
            JsonObject objectRoot = elemento.getAsJsonObject();
            return objectRoot.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            System.out.println("Erro ao conectar com a API: " + e.getMessage());
            return 0;
        }
    }
}