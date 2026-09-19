SUMMARY = "Classic single screen vertical shoot em up"
DESCRIPTION = "XGalaga++ is a classic vertical scrolling shoot em up. \
It requires no X Window extension and its window is freely resizable. \
It is inspired by XGalaga, but rewritten from scratch, \
except for the graphics."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "xgalaga++-0.9-2.12.aarch64.rpm"
RPM_HASH = "f45ff4184c0bed3b0703df258035e567704cd1571a203c4ea766021282263473ae69d220c167072a47ab903a0348792d60d827a8752e991d8f0ba70f8446fd34"

RPROVIDES:${PN} += "xgalaga++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
