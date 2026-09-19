SUMMARY = "Boost.Stacktrace runtime library"
DESCRIPTION = "This package contains the Boost.Stacktrace runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_stacktrace1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "cee60cd8ed8902da2bb32949722bc717a5ff39a86d4a291a52aed4a41c9191075c7dc1ea6d0a0afa8af159c243288ba395151e0599e09c4dec625407c55edc97"

RPROVIDES:${PN} += "libboost-stacktrace-addr2line.so.1.91.0 \
libboost-stacktrace-basic.so.1.91.0 \
libboost-stacktrace-noop.so.1.91.0 \
libboost-stacktrace1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
