SUMMARY = "Python implementation of SAML Version 2 to be used in a WSGI environment"
DESCRIPTION = "PySAML2 is a pure python implementation of SAML2. \
It contains all necessary pieces for building a \
SAML2 service provider or an identity provider."
LICENSE = "Apache-2.0"

PV = "7.5.4"

RPM_NAME = "python313-pysaml2-7.5.4-1.1.aarch64.rpm"
RPM_HASH = "acee9b752058551e656891e4a49ecd494f2eb454fa48040dd9fabef709819dcc6341733b5dd003a4be04cde3df242bb150f3fd78eb9546fd34a801b95f107792"

RPROVIDES:${PN} += "python3-pysaml2 \
python3.13dist-pysaml2 \
python313-pysaml2 \
python3dist-pysaml2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cryptography \
python313-defusedxml \
python313-pymongo \
python313-python-dateutil \
python313-requests \
python313-xmlschema \
update-alternatives"

inherit rpm
