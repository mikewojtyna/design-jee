package pro.buildmysoftware.jms;

import javax.jms.*;

public class ExampleMessageSender {

	private final MessageProducer producer;
	private final Session session;
	private final Connection con;

	public ExampleMessageSender() throws JMSException {
		ConnectionFactory factory = JmsProvider.getConnectionFactory();
		con = factory.createConnection();
		con.start();

		session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue queue = session.createQueue("example.queue");
		producer = session.createProducer(queue);
	}

	public void sendMessage(String message) throws JMSException {
		System.out
			.printf("Sending message: %s, Thread:%s%n", message,
				Thread
				.currentThread().getName());
		TextMessage textMessage = session.createTextMessage(message);
		producer.send(textMessage);
	}

	public void destroy() throws JMSException {
		con.close();
	}
}