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

RPM_NAME = "python314-kombu-5.6.2-2.2.noarch.rpm"
RPM_HASH = "a67df4af26496b1ee6a01624917ad102693c07947372d66b577f6f4ebb294b3cc5ada2559e680e9177eea80cf3c6d7aa0ce4e37c743ec9a9e7ed4676092b0785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kombu \
python314-kombu \
python3dist-kombu"

RDEPENDS:${PN} += "python-abi \
python314-amqp \
python314-packaging \
python314-tzdata \
python314-vine"

inherit rpm
