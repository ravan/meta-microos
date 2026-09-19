SUMMARY = "Mir server library"
DESCRIPTION = "Component library of the Mir compositing stack"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmirserver67-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "e31546a5a079d27ed5b05b7b3fac2b2bcf1940ea9de14a886ab736e2198885026ce1ff173efabe8853f2658378a8c95d714967d2d89703755371f7f8c6a3ef83"

RPROVIDES:${PN} += "libmirserver.so.67 \
libmirserver67"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libXcursor.so.1 \
libboost-iostreams.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libdrm.so.2 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblttng-ust.so.1 \
libm.so.6 \
libmircommon.so.12 \
libmircore.so.2 \
libmirevdev10 \
libmirplatform.so.34 \
libmirserverplatform23 \
libmirwayland.so.6 \
libstdc++.so.6 \
libuuid.so.1 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-render.so.0 \
libxcb-res.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
