SUMMARY = "wxWidgets basic GUI class library"
DESCRIPTION = "Basic GUI classes such as GDI classes or controls are in this \
library. All wxWidgets GUI applications must link against this \
library, only console mode applications need not."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_core-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "405fac64c9e4a9acced4a514a2f57a779f8c03d8660befdbfc9b2959d7435c77fc21a5d9e5e4408a20a87b92529a24a06b344386ffe1b3d45e725d214096ac7e"

RPROVIDES:${PN} += "libwx-gtk3u-core-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSM.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libxkbcommon.so.0"

inherit rpm
