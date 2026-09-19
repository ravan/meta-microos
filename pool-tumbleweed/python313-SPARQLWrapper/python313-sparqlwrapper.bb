SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "2.0.0"

RPM_NAME = "python313-SPARQLWrapper-2.0.0-2.5.noarch.rpm"
RPM_HASH = "9b0aa809be0a77873bee0029db23cb5a765c51b071c52e6f2b012cf5af8985fc550f8db98053ad2206737a44350dba44758d7522a437a2ee96f48bb9710b676a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SPARQLWrapper \
python3.13dist-sparqlwrapper \
python313-SPARQLWrapper \
python3dist-sparqlwrapper"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-rdflib \
update-alternatives"

inherit rpm
