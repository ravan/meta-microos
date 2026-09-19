SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "7.1.4"

RPM_NAME = "python314-rdflib-7.1.4-3.5.noarch.rpm"
RPM_HASH = "86ecb2053643bfcfd5099790b6e6527fbcff9de2e601a484da4f59be37cb13aa270e7cddc5d614a2967a9e7934d16371005eb4ba918e21d2ed39b16eda9a360b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rdflib \
python314-rdflib \
python3dist-rdflib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pyparsing"

inherit rpm
