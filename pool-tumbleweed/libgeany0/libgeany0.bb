SUMMARY = "Geany libraries"
DESCRIPTION = "Geany's core library"
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "libgeany0-2.1-1.7.aarch64.rpm"
RPM_HASH = "f899e02c177e79836e5fef7c72c467e527744a779c637bbfd1d978b1865d874c34f2bcaf26d8b67f2caa969f72f513499c0df044a24bc7a397a0f2facccde1a8"

RPROVIDES:${PN} += "libgeany.so.0 \
libgeany0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
