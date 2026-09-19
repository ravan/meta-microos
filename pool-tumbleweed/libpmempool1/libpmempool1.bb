SUMMARY = "Persistent Memory pool management library"
DESCRIPTION = "The libpmempool library provides a set of utilities for off-line administration, \
analysis, diagnostics and repair of persistent memory pools created \
by libpmemobj libraries."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "libpmempool1-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "cc7dfda10ed85a872735a54cacb9a578e0d8fe64cf4d23e3f458cf98eba028a580159a55c0333a6617129698686d8f9cfb23edf967bf1f23abfea3bbfadca7ae"

RPROVIDES:${PN} += "libpmempool.so.1 \
libpmempool1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
