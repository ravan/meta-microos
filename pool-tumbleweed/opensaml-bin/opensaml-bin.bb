SUMMARY = "Utilities for OpenSAML library"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package contains the utility programs."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "opensaml-bin-3.3.1-2.5.aarch64.rpm"
RPM_HASH = "e8ae3b05b91094d48a071ae94455a7f48331b4330c799e7d1f8a8bb0c18b0b3095a4d29db2fc9129036ac777c7923c49ed8f793fa62c3b7a8cc5bdeac743dca3"

RPROVIDES:${PN} += "opensaml-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libsaml.so.13 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libxmltooling.so.11"

inherit rpm
