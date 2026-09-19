SUMMARY = "OpenStack oslo.messaging library"
DESCRIPTION = "The Oslo messaging API supports RPC and notifications over a number \
of different messaging transports."
LICENSE = "Apache-2.0"

PV = "18.3.0"

RPM_NAME = "python314-oslo.messaging-18.3.0-1.1.noarch.rpm"
RPM_HASH = "c029d77caab3b7e63cbf3a68a7aab072c17de63947283a09aa42b2d969b1998a5fc189341ad01a0dd8453464778996f25713ca4f921380bd575fc7c07fd8f77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.messaging \
python314-oslo.messaging \
python3dist-oslo.messaging"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-WebOb \
python314-amqp \
python314-cachetools \
python314-debtcollector \
python314-futurist \
python314-greenlet \
python314-kombu \
python314-oslo.config \
python314-oslo.context \
python314-oslo.i18n \
python314-oslo.log \
python314-oslo.metrics \
python314-oslo.middleware \
python314-oslo.serialization \
python314-oslo.service \
python314-oslo.utils \
python314-stevedore"

inherit rpm
