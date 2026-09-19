SUMMARY = "Apache XML security C++ library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "libxml-security-c30-3.0.0-1.8.aarch64.rpm"
RPM_HASH = "63c7df73f10cc215c8df9e7a9f4f950681d26381146313b6f5d8c932e14c94a80477613e2ed02dae3835290bb52f19d5eb3847259e54f4f244749d6c7a928862"

RPROVIDES:${PN} += "libxml-security-c.so.30 \
libxml-security-c30 \
xml-security-c"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxerces-c-3.3.so"

inherit rpm
