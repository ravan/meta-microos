SUMMARY = "Confluent's Apache Kafka client for Python"
DESCRIPTION = "Confluent's Apache Kafka client for Python"
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-confluent-kafka-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "cf4ca27f1366c695ea25b8457fa9033609650ca4878c92317d115aaf0130eb1a50d6e7a52b5da3763619909b99f5f55f7a3d725e6f993152d3a640722950b2db"

RPROVIDES:${PN} += "python3.14dist-confluent-kafka \
python314-confluent-kafka \
python3dist-confluent-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
python-abi \
python314-Authlib \
python314-attrs \
python314-cachetools \
python314-certifi \
python314-httpx"

inherit rpm
