SUMMARY = "Xwayland Xserver"
DESCRIPTION = "This package contains the Xserver running on the Wayland Display Server."
LICENSE = "MIT"

PV = "24.1.13"

RPM_NAME = "xwayland-24.1.13-1.2.aarch64.rpm"
RPM_HASH = "08c5cebf0d375f33b2fe760d548f08e50f9d2228aa71cd565888d82f25e628004f66dd66589b991a7818dae75cb6fac6b41354578a9f4888edb1eaded4f74bf5"

RPROVIDES:${PN} += "xorg-x11-server-wayland \
xwayland"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libXau.so.6 \
libXdmcp.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libdecor-0.so.0 \
libdrm.so.2 \
libei.so.1 \
libepoxy.so.0 \
libgbm.so.1 \
libm.so.6 \
liboeffis.so.1 \
libpixman-1-0 \
libpixman-1.so.0 \
libtirpc.so.3 \
libwayland-client.so.0 \
libxcvt.so.0 \
libxshmfence.so.1 \
pkgconfig \
xkbcomp \
xkeyboard-config"

inherit rpm
