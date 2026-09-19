SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "7.1.4"

RPM_NAME = "python-rdflib-doc-7.1.4-3.6.noarch.rpm"
RPM_HASH = "f7380e260ec746da0389f3fcd20c7a268a6085ffd7a99db1cfadfa01d5d32c4f66c042b8286ee5eba526297e9fd432e07b64a5ab7dd827eba989ff0549a70521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rdflib-doc \
python2-rdflib-doc \
python313-rdflib-doc \
python314-rdflib-doc"

RDEPENDS:${PN} += "alts"

inherit rpm
