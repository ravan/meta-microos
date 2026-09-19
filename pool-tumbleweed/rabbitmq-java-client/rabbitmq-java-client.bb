SUMMARY = "Java AMQP client library"
DESCRIPTION = "The RabbitMQ Java client library allows Java code to interface to AMQP servers."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & MPL-2.0"

PV = "5.20.0"

RPM_NAME = "rabbitmq-java-client-5.20.0-2.7.noarch.rpm"
RPM_HASH = "423da31099a38862fe92e2cd528d77e99641f7ec1bb35f2b74f2627862ad57792a925419c86047c19157d87f1140d41f34efce0892b0cbcaa88a56f517ffcdf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.rabbitmq-amqp-client \
mvn-com.rabbitmq-amqp-client-pom- \
osgi-com.rabbitmq.client \
rabbitmq-java-client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
