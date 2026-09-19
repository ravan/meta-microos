SUMMARY = "Development files for the Persistent Memory Transactional Object Store library"
DESCRIPTION = "The libpmemobj library provides a transactional object store, \
providing memory allocation, transactions, and general facilities for \
persistent memory programming. Developers new to persistent memory \
probably want to start with this library."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmemobj-devel-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "b0101d51880f271ee7e4b3e13e8aa82a9ac4704515e0077cc478ef2c1f1b32818c20d550f92241bd363d901a261b408ac0ecf328f6348411143a0626c381cafd"

RPROVIDES:${PN} += "libpmemobj-devel \
pkgconfig-libpmemobj"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmemobj1 \
pkgconfig-libdaxctl \
pkgconfig-libndctl \
pkgconfig-libpmem"

inherit rpm
