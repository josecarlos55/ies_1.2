package lab1;

import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

class Main implements IpmaService{

    private static Logger logger = LogManager.getLogger(IpmaService.class);

    private static final int CITY_ID_AVEIRO = 1010500;

    @Override
    public Call<IpmaCityForecast> getForecastForACity(int cityId) {
        return null;
    }

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity( Integer.parseInt(args[0]) );
        try {
            logger.debug("Connecting to Ipma api");
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();
            logger.debug("Successfully connected to Ipma api");
            System. out .println( "max temp for today: " + forecast.getData().
                    listIterator().next().getTMax() + "\nmin temp for today: " + forecast.getData().
                    listIterator().next().getTMin());
        } catch (Exception ex) {
            logger.error("Couldn't connect to Ipma api");
            ex.printStackTrace();
        }
    }
}
