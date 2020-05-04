package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Conversor {
    @WebMethod
    public String conversor(@WebParam(name="nome")int tipo, @WebParam(name="temperatura")int temp) {
        if(tipo==1) {
        	temp=(int) (temp + 273);
        }
        else if(tipo==2) {
            temp=(int) (temp - 273);
        }
        return "A temperatura ficou: "+temp;
    }
}