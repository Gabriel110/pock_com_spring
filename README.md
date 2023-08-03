# KAFKA_COMANDS
 - kafka-topics.sh --bootstrap-server localhost:9092 --topic first_topic --create --partitions 3 --replication-factor 1
 - kafka-console-producer.sh --bootstrap-server localhost:9092 --topic first_topic
 - kafka-console-producer.sh --broker-list localhost:9092 --topic first_topic
 - kafka-console-producer.sh --bootstrap-server localhost:9092 --topic first_topic < topic-input.txt