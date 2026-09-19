SUMMARY = "Utilities for XML security C++ library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package contains the utility programs."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "xml-security-c-bin-3.0.0-1.8.aarch64.rpm"
RPM_HASH = "9635367e072b0803d2ce2f00325eefefa7573079aab27ff7cb8a9609a44481f285a4fc123ec0704e4bce50bdf8e53fa74eabfc35b59b61aacf7b805df57f60da"

RPROVIDES:${PN} += "xml-security-c-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libxml-security-c.so.30"

inherit rpm
