import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.List;


public class JsonParser {
    public static void main(String[] args)
    {
        String json="";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/fahri/1week.json"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                //sb.append();
                line = br.readLine();
            }
            json = sb.toString();
            com.webischia.jackson.MapPojo pojo = objectMapper.readValue(json, com.webischia.jackson.MapPojo.class);
            List<com.webischia.jackson.Facet> facet = pojo.getFacets();
            com.webischia.jackson.Facet tmp = facet.get(0);
            List<com.webischia.jackson.TimeSeries> timeSeries = facet.get(0).getTimeSeries();
            for(int i = 0 ; i<timeSeries.size();i++)
            {
                System.out.println(timeSeries.get(i).getResults().get(0).getCount());
                // System.out.println(tmp.getName());
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
