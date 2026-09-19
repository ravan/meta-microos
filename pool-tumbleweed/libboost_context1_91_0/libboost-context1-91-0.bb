SUMMARY = "Boost.Context runtime library"
DESCRIPTION = "Runtime support for Boost.Context, a library that providing cooperative \
multitasking support."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_context1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f6b3ffa590e87e306c268406a7de8d952dba7a21d1ba10f79c19186a46d7397ec620098508aeaa28fadd031249e48154b526bdf6de0db487e3ba7aed299add63"

RPROVIDES:${PN} += "libboost-context.so.1.91.0 \
libboost-context1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
