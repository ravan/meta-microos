SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python313-pyasn1-modules-0.4.2-2.4.noarch.rpm"
RPM_HASH = "f790d6728f8b0937c93ff86c66b7072b910d3d9c2dd479892dad954844a1d2f2b2373429e4d378e18022fb9c9cb0c9a3c702b6988465eecccb3878bc008dad6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasn1-modules \
python3.13dist-pyasn1-modules \
python313-pyasn1-modules \
python3dist-pyasn1-modules"

RDEPENDS:${PN} += "python-abi \
python313-pyasn1"

inherit rpm
