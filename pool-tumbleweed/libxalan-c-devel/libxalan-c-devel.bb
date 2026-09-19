SUMMARY = "An XSLT Transformation Engine in C++ - Development Files"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and a robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). \
 \
This package contains files needed for development with Xalanc"
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "libxalan-c-devel-1.12-3.5.aarch64.rpm"
RPM_HASH = "b6b05369a093ed0b122c0440eefe66562fb873b2d2c6656ad0cb4d024ab0a411298653f00c6218c035c4a7451f920a5165b18405205ca479dcb848131f87efeb"

RPROVIDES:${PN} += "Xalan-c-devel \
cmake-XalanC \
libXalan-c-devel \
libxalan-c-devel \
pkgconfig-xalan-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxalan-c112"

inherit rpm
