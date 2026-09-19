SUMMARY = "Development files for Persistent Memory pool management library"
DESCRIPTION = "The libpmempool library provides a set of utilities for off-line administration, \
analysis, diagnostics and repair of persistent memory pools created \
by libpmemobj libraries."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmempool-devel-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "83caf76aa632f6e77cc0836a57e35193cf14eb10f859f90f01cccca7f62415f0b457e372a347b6d86939c83098dbbdb753669e97f403f596e3ff7bbab41ff293"

RPROVIDES:${PN} += "libpmempool-devel \
pkgconfig-libpmempool"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1 \
libpmempool1 \
pkgconfig-libdaxctl \
pkgconfig-libndctl \
pkgconfig-libpmem"

inherit rpm
