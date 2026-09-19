SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "7.1.4"

RPM_NAME = "python313-rdflib-7.1.4-3.5.noarch.rpm"
RPM_HASH = "b9f13f15b275d17f21f726f00dc4bea85295902b6ffddfc1de8ef878e3681cb329d0c50fba042a70f4218ead08c11b9bbf6fdba4cbfe5a7405f79ed6443ac31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rdflib \
python3.13dist-rdflib \
python313-rdflib \
python3dist-rdflib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pyparsing"

inherit rpm
