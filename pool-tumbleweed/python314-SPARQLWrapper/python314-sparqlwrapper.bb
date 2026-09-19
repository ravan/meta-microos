SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "2.0.0"

RPM_NAME = "python314-SPARQLWrapper-2.0.0-2.5.noarch.rpm"
RPM_HASH = "034b1561362f4bf052305b15aefab8805fb92bbac169d5b691f071e799649680bd756a04ec52778dd7d15f5e40e5ab03dd47d54f3a3105a48ba853cfdaefb873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sparqlwrapper \
python314-SPARQLWrapper \
python3dist-sparqlwrapper"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-rdflib \
update-alternatives"

inherit rpm
