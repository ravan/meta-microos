SUMMARY = "XML module for Qore"
DESCRIPTION = "This package contains the xml module for the Qore Programming Language. \
 \
XML is a markup language for encoding information."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "qore-xml-module-2.0.0-1.8.aarch64.rpm"
RPM_HASH = "6d99aa7f80a1a4faf4b4a419dfc651d1248e6af3f9a6ba45ee367e7d439d027c189a74a7ad24cd029a7d46f0c8b544f2e32a0475c10e5fd0898909ad76ced5d9"

RPROVIDES:${PN} += "qore-xml-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.16 \
qore-module-abi"

inherit rpm
