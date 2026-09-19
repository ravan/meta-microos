SUMMARY = "Pika Python AMQP Client Library"
DESCRIPTION = "Pika is a pure-Python implementation of the AMQP 0-9-1 protocol that \
tries to stay fairly independent of the underlying network support \
library. Pika was developed primarily for use with RabbitMQ, but \
should also work with other AMQP 0-9-1 brokers."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "python313-pika-1.4.4-1.1.noarch.rpm"
RPM_HASH = "852a17f21355187c2be914805231476c1b60b6720f83ea28a74ed440b7aa1df1da005fd2f177fba314757483f6b749fb3eb4cd547216a4af4e0e4c5ee4223c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pika \
python3.13dist-pika \
python313-pika \
python3dist-pika"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
