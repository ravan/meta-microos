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

RPM_NAME = "python314-pysnmp-7.1.25-1.2.noarch.rpm"
RPM_HASH = "cac3e391f9b9408dd39cd7c4f677ec396f171813a0b797c3d27ca4192537558feaccf340de5354316358d87293a5c51310558eb8cec064f9f54aad4d8cbffdf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysnmp \
python314-pysnmp \
python3dist-pysnmp"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-pyasn1 \
python314-pysmi"

inherit rpm
