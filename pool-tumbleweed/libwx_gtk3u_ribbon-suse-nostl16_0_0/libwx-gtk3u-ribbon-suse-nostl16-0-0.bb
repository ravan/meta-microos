SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_ribbon-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "a82ca5c1589677e0d428f58b802dc6e3669ed438cd365fd97c89e08abd47cc5a33442864f4e0d1af79489c97f2b43f56b06a132b11849c3deb7fb3d2c6a871b9"

RPROVIDES:${PN} += "libwx-gtk3u-ribbon-suse-nostl.so.16.0.0 \
libwx-gtk3u-ribbon-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
