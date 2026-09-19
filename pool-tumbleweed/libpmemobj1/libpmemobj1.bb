SUMMARY = "Persistent Memory Transactional Object Store library"
DESCRIPTION = "The libpmemobj library provides a transactional object store, \
providing memory allocation, transactions, and general facilities for \
persistent memory programming."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmemobj1-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "8b5b839d6af90db4d937891a63dddb491be673b27bafc0da5546045355835c5ada71d98bbd4c5d43722a9351cd82705717965f839401169e48706ccfd3f97ee0"

RPROVIDES:${PN} += "libpmemobj.so.1 \
libpmemobj1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
