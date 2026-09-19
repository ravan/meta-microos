SUMMARY = "Library for linear arithmetic over GF(2)"
DESCRIPTION = "M4RI is a library for arithmetic with dense matrices over the \
Galois Field GF(2)."
LICENSE = "GPL-2.0-or-later"

PV = "20260122"

RPM_NAME = "libm4ri2-20260122-1.6.aarch64.rpm"
RPM_HASH = "d1177a485ba22e3d30ee3ee616b974928176587e06da9dcbe36eb680231a1a7c253460bf57c01f7314bce4358fce92b84bf2bd7fdbe5a3a91e86e11d8a2df5ad"

RPROVIDES:${PN} += "libm4ri.so.2 \
libm4ri2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
