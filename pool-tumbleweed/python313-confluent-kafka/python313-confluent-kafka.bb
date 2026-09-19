SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-confluent-kafka-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "450bd1674f247a33867b0340e281194ca004c399161bc0eb1df5ed22de1ecf82b3df5209237f88d1ee53ee690e8a026d823c08fed721d89dbc7064008f11e554"

RPROVIDES:${PN} += "python3-confluent-kafka \
python3.13dist-confluent-kafka \
python313-confluent-kafka \
python3dist-confluent-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
python-abi \
python313-Authlib \
python313-attrs \
python313-cachetools \
python313-certifi \
python313-httpx"

inherit rpm
