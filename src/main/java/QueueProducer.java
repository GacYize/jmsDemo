import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class QueueProducer {
    public static void main(String[] args) throws JMSException {
        //创建连接工厂
        ConnectionFactory connectionFactory=new ActiveMQConnectionFactory("tcp://192.168.25.134:61616");
        //获取连接
        Connection connection = connectionFactory.createConnection();
        //启动连接
        connection.start();
        //获取session  (参数1：是否启动事务,参数2：消息确认模式)
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //创建队列对象 参数：Queue名字
        Queue queue = session.createQueue("test-queue");
        //创建消息生产者
        MessageProducer producer = session.createProducer(queue);
        //创建消息
        TextMessage textMessage = session.createTextMessage("你好，JMS");
        //发送消息
        producer.send(textMessage);
        //释放资源
        producer.close();
        session.close();
        connection.close();
    }
}
