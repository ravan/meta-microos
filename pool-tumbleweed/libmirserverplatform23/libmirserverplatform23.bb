SUMMARY = "Mir Server Platform Library"
DESCRIPTION = "Component library of the Mir server platform"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmirserverplatform23-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "467ec0637b772a5699dcf2a8170c8977f77084f51f967de40186669424aca64cacced2a284f2103702978800b4aa3ea828ff7338aed994b63463929613bcea9c"

RPROVIDES:${PN} += "libmirserverplatform23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libX11-xcb.so.1 \
libX11.so.6 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libmircommon.so.12 \
libmircore.so.2 \
libmirplatform.so.34 \
libmirwayland.so.6 \
libnvidia-egl-wayland.so.1 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libxcb-randr.so.0 \
libxcb-xfixes.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
