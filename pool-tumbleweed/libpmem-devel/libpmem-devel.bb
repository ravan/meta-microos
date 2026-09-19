SUMMARY = "Development files for the low-level persistent memory library"
DESCRIPTION = "libpmem provides low level persistent memory support. In particular, \
support for the persistent memory instructions for flushing changes \
to pmem is provided. \
 \
This library is provided for software which tracks every store to \
pmem and needs to flush those changes to durability. Most developers \
will find higher level libraries like libpmemobj to be much more \
convenient."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmem-devel-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "e68a1a1cb5fce7393b2134ff370fca21fc19daadaa54cc72f409585445614b07618eeac6af1d1b561ddc9f1a9d1e8263182c913c0603724ca6070593b5bc5aad"

RPROVIDES:${PN} += "libpmem-devel \
pkgconfig-libpmem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem1"

inherit rpm
