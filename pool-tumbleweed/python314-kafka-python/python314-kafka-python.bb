SUMMARY = "Pure Python client for Apache Kafka"
DESCRIPTION = "This module provides low-level protocol support for Apache Kafka as well as \
high-level consumer and producer classes. Request batching is supported by the \
protocol as well as broker-aware request routing. Gzip and Snappy compression \
is also supported for message sets."
LICENSE = "Apache-2.0"

PV = "3.0.11"

RPM_NAME = "python314-kafka-python-3.0.11-1.1.noarch.rpm"
RPM_HASH = "f80d73048038f655f979a1a9ae46f8fb81b55373afc1fa43715a5f13ea3bfa397226364609d81c12d9175b23104fefc02d43f6da0c28d359caf526fc5f200121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kafka-python \
python314-kafka-python \
python3dist-kafka-python"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
