SUMMARY = "Collection of protocols modules written in ASN.1 language"
DESCRIPTION = "This is an implementation of ASN.1 types and codecs in Python programming \
language. It has been first written to support particular protocol (SNMP) but \
then generalized to be suitable for a wide range of protocols based on ASN.1 \
specification."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python314-pyasn1-modules-0.4.2-2.4.noarch.rpm"
RPM_HASH = "ca9f51c649c79220b5c02e9fd2060e2421bf63e81d9a0ed645628634ed734f011a87aca1a01deaa99b624e21f37d196fa5bf6bde805fb0f7e767be9e698d0e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyasn1-modules \
python314-pyasn1-modules \
python3dist-pyasn1-modules"

RDEPENDS:${PN} += "python-abi \
python314-pyasn1"

inherit rpm
