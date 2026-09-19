SUMMARY = "OpenSAML schemas and catalog"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package includes XML schemas and related files."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "opensaml-schemas-3.3.1-2.5.aarch64.rpm"
RPM_HASH = "c2ba63a35491abd4fe3cc742e9cfe6513776fc756062e5090a50255b9df8708db7c8e835c904bd928e0d874ccfcff36163c23755ce0b9bd686b289f0ec02f3b2"

RPROVIDES:${PN} += "opensaml-schemas"

RDEPENDS:${PN} += ""

inherit rpm
