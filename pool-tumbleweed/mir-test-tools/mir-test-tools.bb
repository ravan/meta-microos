SUMMARY = "Testing tools for Mir"
DESCRIPTION = "This package provides tools for testing Mir"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "mir-test-tools-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "5422ff9e00658dc8019eb3acc6dc4e5260c64efa3837ad6d2463afe24064ae3c923d6920665c9457beb9cc99f1db08df389af3ef8d791e498be353895ad7625c"

RPROVIDES:${PN} += "libmirserverlttng.so \
mir-test-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libXcursor.so.1 \
libboost-iostreams.so.1.91.0 \
libc.so.6 \
libdrm.so.2 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmock.so.1.17.0 \
libgobject-2.0.so.0 \
libgtest.so.1.17.0 \
liblttng-ust.so.1 \
libm.so.6 \
libmiral.so.7 \
libmircommon.so.12 \
libmircore.so.2 \
libmirplatform.so.34 \
libmirserver.so.67 \
libmirserver67 \
libmirwayland.so.6 \
libstdc++.so.6 \
libuuid.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-render.so.0 \
libxcb-res.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxkbcommon.so.0 \
wlcs"

inherit rpm
