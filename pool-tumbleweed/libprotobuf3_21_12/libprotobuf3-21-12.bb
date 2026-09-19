SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotobuf3_21_12-21.12-4.9.aarch64.rpm"
RPM_HASH = "1227f796e276567926e49bd25d523d80f91ed7dd86e00a652eb29be7a3f7b4af5d15da33c7718fb13e5e31fd9dae72ea771c841d01f3f68f412382594a6f31d6"

RPROVIDES:${PN} += "libprotobuf.so.3.21.12.0 \
libprotobuf3-21-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
