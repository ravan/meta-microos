SUMMARY = "ASN.1 types and codecs"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.6.4"

RPM_NAME = "python313-pyasn1-0.6.4-1.1.noarch.rpm"
RPM_HASH = "e798d1f1b421a632001ba28eb107e986800df247cd3a426ec373b340633944489267f288639757e912059e533a8374fa8c03697f474ea1db81b11530ef06fa96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasn1 \
python3.13dist-pyasn1 \
python313-pyasn1 \
python3dist-pyasn1"

RDEPENDS:${PN} += "python-abi"

inherit rpm
