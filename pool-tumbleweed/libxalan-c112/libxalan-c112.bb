SUMMARY = "An XSLT Transformation Engine in C++"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath)."
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "libxalan-c112-1.12-3.5.aarch64.rpm"
RPM_HASH = "12835034a9c84154a539b39608ab345462ef3800a70fb5c775760323341d17b74cb1966877f4505817a1abd9b1d07178ccc82296b0b47539908d83bbd0d2e902"

RPROVIDES:${PN} += "libXalan-c111 \
libxalan-c.so.112 \
libxalan-c112 \
libxalanMsg.so.112"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxerces-c-3.3.so"

inherit rpm
