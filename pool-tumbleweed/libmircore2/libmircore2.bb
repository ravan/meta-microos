SUMMARY = "Mir core library"
DESCRIPTION = "Component library of the Mir compositing stack"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmircore2-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "2108d89474df1fe343a0a651001e3eba8cff62ff3dbe83fdebd1b8cbc50fd19ecc279c9456d71533ddec6db783ee8b8173a671b68ff25b47e53e0693def61210"

RPROVIDES:${PN} += "libmircore.so.2 \
libmircore2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
