SUMMARY = "An XSLT Transformation Engine in C++"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath)."
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "xalan-c-1.12-3.5.aarch64.rpm"
RPM_HASH = "3c03ef25f309b9f2ccdffb65c6947c7740f446b7fce552bd70f977821205df704f9cab15c2e5a7503d8e3416324d2d67220d2b8cf9f98c8bc0b1e645c6145717"

RPROVIDES:${PN} += "Xalan-C \
xalan-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxalan-c.so.112 \
libxerces-c-3.3.so"

inherit rpm
