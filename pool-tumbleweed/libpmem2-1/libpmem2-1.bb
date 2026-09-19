SUMMARY = "Low-level persistent memory support library"
DESCRIPTION = "libpmem provides low level persistent memory support, in particular, \
support for the persistent memory instructions for flushing changes \
to pmem. libpmem2 has a new API that addresses many of the shortcommings \
of libpmem1"
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmem2-1-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "22c8014e592b9f62c1cb9bac52b0270c18a73e3e443deaf0720a91317c63a5db7a5f943cb7e3187ba3940aed99288813c9f0973f99d279d7010c4f2b369d6bf5"

RPROVIDES:${PN} += "libpmem2-1 \
libpmem2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6"

inherit rpm
