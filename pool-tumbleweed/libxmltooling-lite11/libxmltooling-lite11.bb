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

RPM_NAME = "libxmltooling-lite11-3.3.0-1.9.aarch64.rpm"
RPM_HASH = "572697b3921940f77b2a381b495cd60c2728a213d31060106633bb7fb50d8e4346506e02e967a61b148ac4fda339379ac187e78f62171a23ad022f81261fdc6c"

RPROVIDES:${PN} += "libxmltooling-lite.so.11 \
libxmltooling-lite11 \
xmltooling"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libz.so.1"

inherit rpm
