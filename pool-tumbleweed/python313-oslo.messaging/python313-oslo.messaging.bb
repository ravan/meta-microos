SUMMARY = "OpenStack oslo.messaging library"
DESCRIPTION = "The Oslo messaging API supports RPC and notifications over a number \
of different messaging transports."
LICENSE = "Apache-2.0"

PV = "18.3.0"

RPM_NAME = "python313-oslo.messaging-18.3.0-1.1.noarch.rpm"
RPM_HASH = "0fe1551edf9c2563918cb1136d882a2148562bb81a9a5d8ae3ca54a85a7a34fe4f6abb0babf96aaa0fb8be126fd12770ca0677ffbeb85587cb112c93973f6700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.messaging \
python3.13dist-oslo.messaging \
python313-oslo.messaging \
python3dist-oslo.messaging"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-WebOb \
python313-amqp \
python313-cachetools \
python313-debtcollector \
python313-futurist \
python313-greenlet \
python313-kombu \
python313-oslo.config \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.metrics \
python313-oslo.middleware \
python313-oslo.serialization \
python313-oslo.service \
python313-oslo.utils \
python313-stevedore"

inherit rpm
