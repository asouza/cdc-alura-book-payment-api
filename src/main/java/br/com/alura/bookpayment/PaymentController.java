package br.com.alura.bookpayment;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PaymentController {

	@ResponseBody
	@PostMapping(value="/payment",consumes=MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<?> pay(@RequestBody PaymentData paymentData) {

    	if(paymentData.getValue().compareTo(new BigDecimal(500)) <= 0){
    		return ResponseEntity.ok("Pagamento efetuado com sucesso");
    	}
        return ResponseEntity.badRequest().body("Valor maior que o permitido");
    }	
	
	@ResponseBody
	@PostMapping("/invoice")
	public HttpEntity<?> invoice(){
		return ResponseEntity.ok("Nota fiscal gerada com sucesso");
	}
	
	@ResponseBody
	@GetMapping(value="/orders",produces=MediaType.APPLICATION_JSON_VALUE)
	public Pedido[] list() throws JsonParseException, JsonMappingException, IOException {
		//to so convertendo aqui para garantir que o parse ta certinho
		return new ObjectMapper()
				.readValue(Produto.class.getResourceAsStream("/pedidos.json"), Pedido[].class);		
	}
}
