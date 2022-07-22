import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ListaFilmes {

	HttpClient cliente = HttpClient.newHttpClient();
	HttpRequest solicitacao = (HttpRequest) HttpRequest.newBuilder();
	URI url = URI.create("https://imdb-api.com/en/API/Top250Movies/k_l6qb542b");
}
