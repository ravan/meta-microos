SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "3.0.11"

RPM_NAME = "python313-kafka-python-3.0.11-1.1.noarch.rpm"
RPM_HASH = "0d102d62df87731f6c7eb8c512abb0f6697e2d7fc61123dc31b35425e5bc3f52d55d6c8a4412e94bb18207977565b3e977aa821b4a023beaf81709be13c918fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kafka-python \
python3.13dist-kafka-python \
python313-kafka-python \
python3dist-kafka-python"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
