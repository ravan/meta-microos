SUMMARY = "RabbitMQ AMQP language bindings for Erlang"
DESCRIPTION = "RabbitMQ is an implementation of an AMQP broker. AMQP is an emerging \
standard for messaging. \
 \
This package includes the RabbitMQ AMQP language bindings for Erlang."
LICENSE = "MPL-2.0"

PV = "4.2.9"

RPM_NAME = "erlang-rabbitmq-client-4.2.9-1.1.aarch64.rpm"
RPM_HASH = "2ac3da6e8b3fff696854c4c676f5789e4ad0057bd56a855185d123903fcccf80ac0d2af95f96b2bdea12b2d1b589ee2aa83fc84af01e5b99d2096a879850c44c"

RPROVIDES:${PN} += "erlang-amqp-client \
erlang-gen-server2 \
erlang-rabbit-common \
erlang-rabbitmq-client"

RDEPENDS:${PN} += "erlang27"

inherit rpm
