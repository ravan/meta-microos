SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.6.4"

RPM_NAME = "python314-pyasn1-0.6.4-1.1.noarch.rpm"
RPM_HASH = "d4fb23b0d4d89cc5c3451c7dd86d95066251e9e812b1e28e030b1e0101308c03147d2ffebc7e9bd6c1b040089c04ec3a7db442949248f8ad09d53f4c9e32f069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyasn1 \
python314-pyasn1 \
python3dist-pyasn1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
