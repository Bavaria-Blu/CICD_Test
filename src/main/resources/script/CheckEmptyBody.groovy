	import com.sap.gateway.ip.core.customdev.util.Message;
	import java.util.HashMap;
	def Message processData(Message message) {

		def body = message.getBody(String);
		
		//check if body is empty
		if (body == null || body.isEmpty()) {
			message.setProperty("emptyBody", true);
		} else {
			message.setProperty("emptyBody", false);
		}

       return message;
}