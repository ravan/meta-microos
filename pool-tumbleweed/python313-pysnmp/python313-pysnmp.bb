SUMMARY = "A pure-Python SNMPv1/v2c/v3 library"
DESCRIPTION = "This project is a SNMP v1/v2c/v3 engine written in the Python \
programming language. \
 \
    * Complete SNMPv1/v2c and SNMPv3 engine support \
    * Can act as Manager and/or Agent \
    * Manager and Agent side MIB support \
    * Asynchronous operations support \
    * Pure-Python implementation \
    * py2exe and .egg friendly \
    * Twisted binding"
LICENSE = "BSD-2-Clause"

PV = "7.1.25"

RPM_NAME = "python313-pysnmp-7.1.25-1.2.noarch.rpm"
RPM_HASH = "1496121eac93d062d7cb8bff65c784645a63d81db00a0ba50cb7ecd2b9a236e89c9233b97df6763528eacfd65e3cdb6853906f6b7ce61970e5cc52e9e752adcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysnmp \
python3.13dist-pysnmp \
python313-pysnmp \
python3dist-pysnmp"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-pyasn1 \
python313-pysmi"

inherit rpm
