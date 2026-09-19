SUMMARY = "MathGL wxWidgets library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "libmgl-wx8-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "49183e83daac22f43f14a89e8a648c95743a0e951376ec51a3e30c7f601a3241cf4c0e9f07d69a5bcfafd5ec92f2b191cd5116104a495a8e9d73c563759eaaeb"

RPROVIDES:${PN} += "libmgl-wx.so.8 \
libmgl-wx8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
