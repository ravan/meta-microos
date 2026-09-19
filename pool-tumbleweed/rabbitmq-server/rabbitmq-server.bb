SUMMARY = "A message broker supporting AMQP, STOMP and MQTT"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging."
LICENSE = "MPL-2.0"

PV = "4.2.9"

RPM_NAME = "rabbitmq-server-4.2.9-1.1.aarch64.rpm"
RPM_HASH = "aace72161441417b03a0f2e363fe8b55de648096b1a230b89ef7cbc7bcb5cb0a43fd69a45862dc88c4be6e9404313e413e5609efdc895356d447dbe2183d4e29"

RPROVIDES:${PN} += "AMQP-server \
config-rabbitmq-server \
group-rabbitmq \
rabbitmq-server \
user-rabbitmq"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
erlang \
erlang-epmd \
fillup \
logrotate \
rabbitmq-server-plugins \
shadow"

inherit rpm
