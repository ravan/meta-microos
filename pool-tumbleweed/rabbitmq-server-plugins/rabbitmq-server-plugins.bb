SUMMARY = "Plugins for the RabbitMQ server"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes some plugins for the RabbitMQ server."
LICENSE = "MPL-2.0"

PV = "4.2.9"

RPM_NAME = "rabbitmq-server-plugins-4.2.9-1.1.aarch64.rpm"
RPM_HASH = "3690d6a3127b1a9473a47ecc55fcffa7221aeb666ba88ecaf9534ea8ba7fd996d1a674fa64a1c18aa580083995f5f473c95517c7250b23d7266b5f034105abc7"

RPROVIDES:${PN} += "rabbitmq-server-plugins"

RDEPENDS:${PN} += "rabbitmq-server"

inherit rpm
