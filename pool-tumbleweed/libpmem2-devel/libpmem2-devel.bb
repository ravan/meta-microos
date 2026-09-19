SUMMARY = "Development files for the low-level persistent memory library"
DESCRIPTION = "libpmem2 provides low level persistent memory support. In particular, \
support for the persistent memory instructions for flushing changes \
to pmem is provided. \
 \
This library is provided for software which tracks every store to \
pmem and needs to flush those changes to durability. Most developers \
will find higher level libraries like libpmemobj to be much more \
convenient. libpmem2 has a new API that addresses many of the shortcommings \
of libpmem1"
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmem2-devel-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "8fdb041d10636b92d8381c0878a744aebd3e639abff69855e830344aa174f3bc1c642c509c087af1381d08420f3464d5dd8f6273734ab914eca1d33ca1c5262c"

RPROVIDES:${PN} += "libpmem2-devel \
pkgconfig-libpmem2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem2-1"

inherit rpm
