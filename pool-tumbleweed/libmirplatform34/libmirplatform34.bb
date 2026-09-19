SUMMARY = "Mir platform library"
DESCRIPTION = "Component library of the Mir compositing stack"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmirplatform34-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "27e1d7cf5974a21d49e6dd03fa33167d01d64fcbfe20033c504613dea3608664552d97a97b4b667fbfde1c42c2869c459774c3ed0d729a9acc970d8d291073dd"

RPROVIDES:${PN} += "libmirplatform.so.34 \
libmirplatform34"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libdisplay-info.so.3 \
libdrm.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libmircommon.so.12 \
libmircore.so.2 \
libmirwayland.so.6 \
libpixman-1.so.0 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-server.so.0"

inherit rpm
