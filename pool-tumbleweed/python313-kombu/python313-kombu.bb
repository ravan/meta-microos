SUMMARY = "AMQP Messaging Framework for Python"
DESCRIPTION = "An AMQP messaging framework for Python. \
 \
AMQP is the Advanced Message Queuing Protocol, an open standard protocol \
for message orientation, queuing, routing, reliability and security. \
 \
One of the most popular implementations of AMQP is RabbitMQ. \
 \
The aim of Kombu is to make messaging in Python as easy as possible by \
providing an idiomatic high-level interface for the AMQP protocol, and also \
provide proven and tested solutions to common messaging problems."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "python313-kombu-5.6.2-2.2.noarch.rpm"
RPM_HASH = "524ad756b9fa606aaab0ebe0789b6a19fa8681c672ed12b15b576d32f9cd56216b4a6fe0ac53e9d63d0ed47103b7a17fe5a4cd747856a0fd1c34f4940fe71260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kombu \
python3.13dist-kombu \
python313-kombu \
python3dist-kombu"

RDEPENDS:${PN} += "python-abi \
python313-amqp \
python313-packaging \
python313-tzdata \
python313-vine"

inherit rpm
