SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.5.4"

RPM_NAME = "python314-pysaml2-7.5.4-1.1.aarch64.rpm"
RPM_HASH = "f80744dcdf891220f2594296ae557fc027759e6102d7f39d8f4ba12416097a0d1d634621cd68a51b7b5ad9343c4dfbe66677c5625fe4779c16d9fb2ea51d42c6"

RPROVIDES:${PN} += "python3.14dist-pysaml2 \
python314-pysaml2 \
python3dist-pysaml2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cryptography \
python314-defusedxml \
python314-pymongo \
python314-python-dateutil \
python314-requests \
python314-xmlschema \
update-alternatives"

inherit rpm
