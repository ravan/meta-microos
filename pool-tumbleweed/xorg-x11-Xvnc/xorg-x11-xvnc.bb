SUMMARY = "TigerVNC implementation of Xvnc"
DESCRIPTION = "This is the TigerVNC implementation of Xvnc."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "xorg-x11-Xvnc-1.16.1-3.1.aarch64.rpm"
RPM_HASH = "561f1f3d906243ff2632369573464de91c4c428393389fa9f07b0172944e621968f7d29d5c539445f795e215f4d8afb1102ed09bb63ba16a15ee033fc3a2feaa"

RPROVIDES:${PN} += "config-xorg-x11-Xvnc \
group-vnc \
tightvnc \
user-vnc \
xorg-x11-Xvnc \
xorg-x11-Xvnc-/usr/lib/vnc/with-vnc-key.sh"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/hostname \
/usr/bin/perl \
/usr/bin/sh \
group-shadow \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXau.so.6 \
libXdamage.so.1 \
libXdmcp.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXfont2.so.2 \
libXrandr.so.2 \
libXtst.so.6 \
libXvnc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libhogweed.so.6 \
libjpeg.so.8 \
libm.so.6 \
libnettle.so.8 \
libpam.so.0 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libselinux.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libuuid.so.1 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
libz.so.1 \
openssl-cli \
systemd \
sysuser-shadow \
windowmanager \
xauth \
xkbcomp \
xkeyboard-config \
xorg-x11-fonts-core"

inherit rpm
