SUMMARY = "Demonstration applications using Mir"
DESCRIPTION = "This package provides applications for demonstrating the capabilities of the \
Mir display server"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "mir-demos-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "305830d19e47f7b4ff4942e5ad06b2aa83ee3b8716a2efc3c355c16c8ce33c205797e97fe00b0e6013317087f21be636c34179195057df26acb28e1d711c1897"

RPROVIDES:${PN} += "mir-demos"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
gnu-free-fonts \
hicolor-icon-theme \
inotify-tools \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libmiral.so.7 \
libmircommon.so.12 \
libmircore.so.2 \
libmirserver.so.67 \
libmirserver67 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
xkeyboard-config \
xwayland"

inherit rpm
