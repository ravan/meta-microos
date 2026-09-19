SUMMARY = "A library to parse and emit YAML"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML. \
 \
ryml parses both read-only and in-situ source buffers; the resulting \
data nodes hold only views to sub-ranges of the source buffer. No \
string copies or duplications are done."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libryml0_8_0-0.8.0-1.5.aarch64.rpm"
RPM_HASH = "37476015ff908e103d326724e4c9c46b9871195afb922195f9ab78ce18e893666e633c47cfef96c2d386477b77e02bd4db0fe04ef458575cdb939dd19bb89550"

RPROVIDES:${PN} += "libryml.so.0.8.0 \
libryml0-8-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
