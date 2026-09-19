SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotobuf-lite3_21_12-21.12-4.9.aarch64.rpm"
RPM_HASH = "d2f12d5a5dce1d8d57a6266a7b514c4da03d2b22e7a247095da0ffa2daedc6561f84ae7d06280aeed176a31f8a76e2443e3ceea381f9bf47d7cbe6b33f3ac1b4"

RPROVIDES:${PN} += "libprotobuf-lite.so.3.21.12.0 \
libprotobuf-lite3-21-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
