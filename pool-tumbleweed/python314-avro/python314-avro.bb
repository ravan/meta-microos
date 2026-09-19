SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "python314-avro-1.12.1-1.4.noarch.rpm"
RPM_HASH = "02d149e7edc6732924cecaf68a9ecee8e452fbb0d09fd5d7a5cda2011e2d29a6a123ed03bdd3e8238feaa0f1399f1ecc807d74fcb44d61ac5ba92fb22c1df9a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-avro \
python314-avro \
python3dist-avro"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
