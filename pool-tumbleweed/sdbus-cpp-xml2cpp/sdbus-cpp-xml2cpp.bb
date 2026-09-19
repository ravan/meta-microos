SUMMARY = "Stub code generator for sdbus-c++"
DESCRIPTION = "The stub code generator for generating the adapter and proxy interfaces \
out of the D-Bus IDL XML description."
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "sdbus-cpp-xml2cpp-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "e999186cd1a9f458f79796c82f9776a6a66fadc49c4b0e9f0d26c7a3b0db97cf10c2b4fbdc0d6604eeae89e7621d8e73657db8d9c514eda484d942f8915c67f5"

RPROVIDES:${PN} += "sdbus-cpp-xml2cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libsdbus-c++2 \
libstdc++.so.6"

inherit rpm
