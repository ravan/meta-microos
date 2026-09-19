SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "python314-pika-1.4.4-1.1.noarch.rpm"
RPM_HASH = "00ce55077c020ceabc028660089a25ac22a8cabf0746f1a20dfc5d404cd37e82bc6086d91d42383241f55a0615f99555b7d4738e73b81725799651d9671a410e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pika \
python314-pika \
python3dist-pika"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
