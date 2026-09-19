SUMMARY = "Header files, libraries and development documentation for protobuf21"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf21-devel-21.12-4.9.aarch64.rpm"
RPM_HASH = "aee44f1d6310305e9bc1a34c2e4a8646f92640ef439f14739fadac47d98a2ff254b387de24cad460084d29b46be9fdeba43708745bf51c3cc7842abca1461881"

RPROVIDES:${PN} += "cmake-protobuf \
libprotobuf-devel \
pkgconfig-protobuf \
pkgconfig-protobuf-lite \
protobuf-devel \
protobuf21-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc-c++ \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-lite3-21-12 \
libprotobuf3-21-12 \
libprotoc.so.3.21.12.0 \
libstdc++.so.6 \
pkgconfig-zlib"

inherit rpm
