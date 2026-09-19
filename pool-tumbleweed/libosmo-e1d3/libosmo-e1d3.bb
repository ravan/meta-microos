SUMMARY = "Osmocom E1 daemon protocol library"
DESCRIPTION = "Osmocom E1 Daemon Protocol Library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "libosmo-e1d3-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "600848579b146c86253fbc72c2e2a50aee0d1eacccbdba3817a0a97e3345e91bfe1503557920ebb87edd88239f87c97d6a1873280f92f1ac3c79fd819da126ae"

RPROVIDES:${PN} += "libosmo-e1d.so.3 \
libosmo-e1d3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
