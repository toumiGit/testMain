import com.fianet.wssofinco.credit.donnees.CreditEntree;
import com.fianet.wssofinco.credit.donnees.CreditSortie;
import com.fianet.wssofinco.dto.CreditModelDTO;
import com.google.gson.Gson;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class postingData {
    public static void main(String[] args) throws IOException {

        HttpClient client = new HttpClient();
        PostMethod post = new PostMethod("http://localhost:8085/lacentrale/sofinco/smartproxy/credit/callCreditWebService");
//        post.addParameter("montantAchat", "500");
//        post.addParameter("merchantSofincoReference", "75000000050711");
        
        post.addRequestHeader("Content-Type", "application/json");
        CreditEntree x1 = new CreditEntree();
        String xString = new Gson().toJson(x1);
        post.setRequestEntity(new StringRequestEntity(xString));
        client.executeMethod(post);



        String body = IOUtils.toString(post.getResponseBodyAsStream());
        System.out.println(body);
//        CreditSortie x= new Gson().fromJson(body, CreditSortie.class);
//        System.out.print(x.getOffers() + " **************** ");
    }
}
