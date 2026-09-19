SUMMARY = "protobuf generator and headers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "protobuf-c-devel-1.5.2-2.6.aarch64.rpm"
RPM_HASH = "b51d2d0d860043737e04a05769def72fd965412d0b56023c392608db77fe91399f1e29440fbed64b256f4df3fb40ca576ecaaf0e9fef38491484e9ec27a241ee"

RPROVIDES:${PN} += "libprotobuf-c-devel \
pkgconfig-libprotobuf-c \
protobuf-c \
protobuf-c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-c1 \
libprotobuf.so.36.1.0 \
libprotoc.so.36.1.0 \
libstdc++.so.6"

inherit rpm
