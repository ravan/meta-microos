SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_aui-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "81b9038161d3ec4048c652f2263f4d60dbbf91d9ebbbdfd21ca654d87249d53065d63f28a94f792117a0d047c544eee316411bcf11e9d283f50883c5ee357060"

RPROVIDES:${PN} += "libwx-gtk3u-aui-suse-nostl.so.16.0.0 \
libwx-gtk3u-aui-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0"

inherit rpm
