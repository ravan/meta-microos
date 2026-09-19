SUMMARY = "OpenSAML XMLTooling library"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "libxmltooling11-3.3.0-1.9.aarch64.rpm"
RPM_HASH = "d49d674e4c09427686c9d10bffbd0ba1e4e6103421b5a3800153118aa3a2a31d4897b93dfe0406c99e67a6851db2c1f0149aecff0dcd2844d71defe6eaae124a"

RPROVIDES:${PN} += "libxmltooling.so.11 \
libxmltooling11 \
xmltooling"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libssl.so.3 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libxml-security-c.so.30 \
libz.so.1"

inherit rpm
