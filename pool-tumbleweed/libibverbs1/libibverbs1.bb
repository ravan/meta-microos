SUMMARY = "Ibverbs runtime library"
DESCRIPTION = "This package contains the ibverbs runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libibverbs1-63.0-1.3.aarch64.rpm"
RPM_HASH = "7b1bbc4fed414d4ccfeab58dedb066480246b30ce62c5e98e0c8b82b7f1162696ae8fecb4339abe738f5eccad5afc0327a43b945bf37e58aa47055ae4c890c93"

RPROVIDES:${PN} += "libibverbs.so.1 \
libibverbs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
