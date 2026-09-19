SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "python313-avro-1.12.1-1.4.noarch.rpm"
RPM_HASH = "d965d016e66fdfe9888c8a8c3effb7ddff82cb20363cac7220cf91e3e4c1ff6b9357a3f9c3d899c009e1643de3c96e63db8a7b2413672fe12c22279866169cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avro \
python3.13dist-avro \
python313-avro \
python3dist-avro"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
