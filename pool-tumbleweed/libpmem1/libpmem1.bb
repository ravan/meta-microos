SUMMARY = "Low-level persistent memory support library"
DESCRIPTION = "libpmem provides low level persistent memory support, in particular, \
support for the persistent memory instructions for flushing changes \
to pmem."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmem1-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "a71a357fa695c5027cd49f017f774ac691312601033c7fc1f8adf74d716a68e604d1f5ee8f04194ccf4a44c75b86f02986d8f03c106ecc88a933259b0b63a7c4"

RPROVIDES:${PN} += "libpmem.so.1 \
libpmem1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6"

inherit rpm
