SUMMARY = "C++ API for RDF data stores"
DESCRIPTION = "Dataquay is a library that provides a C++ API for an \
RDF data store using Qt6 classes and containers."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "libdataquay0-0.9.5-1.6.aarch64.rpm"
RPM_HASH = "ee76f1bbe2518d893acd2e5f0a2215e8f752deb424cde517b30f436f43d1873881640b336fe0daf57ce3ac83f33aaee5f8b87c77b142271f4b03616d193b5418"

RPROVIDES:${PN} += "libdataquay.so.0 \
libdataquay0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libraptor2.so.0 \
librdf.so.0 \
libstdc++.so.6"

inherit rpm
