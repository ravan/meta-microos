SUMMARY = "C language interface for the GEOS library"
DESCRIPTION = "This subpackage contains a shared library providing a C linkage \
interface for the (C++) GEOS library."
LICENSE = "LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "libgeos_c1-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "aa511003c03d754427ea465fbdeb6f3a2648c0e8b702ae08576aba1b68443c21d027a6aeaa2ee15b87dfef499bee772f064f6f37d7f9ba26f6ae595fe79b851e"

RPROVIDES:${PN} += "libgeos-c.so.1 \
libgeos-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgeos.so.3.15.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
