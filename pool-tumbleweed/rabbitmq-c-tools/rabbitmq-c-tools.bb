SUMMARY = "Example tools built using the librabbitmq package"
DESCRIPTION = "This package contains example tools built using rabbitmq-c. It provides: \
amqp-consume        Consume messages from a queue on an AMQP server \
amqp-declare-queue  Declare a queue on an AMQP server \
amqp-delete-queue   Delete a queue from an AMQP server \
amqp-get            Get a message from a queue on an AMQP server \
amqp-publish        Publish a message on an AMQP server"
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "rabbitmq-c-tools-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "4f3cf6cfe093ce5cb15fae2c7c203b820e4f8b20d2fb52000cc6b7a56cfd0e7e3ef6ed622ad5c1635c36938a2b3477697f9c93e8831d21564e686ae2e508b926"

RPROVIDES:${PN} += "rabbitmq-c-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0 \
librabbitmq.so.4"

inherit rpm
