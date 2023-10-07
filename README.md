# Creation of Kafka Subscriber/Consumer using Spring Boot

# Prerequisites

* Install Kafka from official page -https://kafka.apache.org/downloads
* Instal Confluent Kafka from official page -https://www.confluent.io/installation/
* Install Offset Explorer

# Steps to setup

### Kafka Commands
* Start Zookeeper Server
~~~
sh bin/zookeeper-server-start.sh config/zookeeper.properties
~~~
* Start Kafka Server / Broker
~~~
sh bin/kafka-server-start.sh config/server.properties
~~~

* Or avoid above two steps and start both Zookeeper and Kafka Server in one command
~~~
docker compose up
~~~
* Launch the spring boot application of publisher and send messages to topic
* Launch the consumer application(this repo).
* And verify in console
