SUMMARY = "wxWidgets basic GUI class library"
DESCRIPTION = "Basic GUI classes such as GDI classes or controls are in this \
library. All wxWidgets GUI applications must link against this \
library, only console mode applications need not."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_core-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "bda092362afd5ca3d7ad16d8abec22884c54d9e0b6aca4bf32c890c53d87d4a81f1540360dbebd8d6840293eb127da350203c33ed6062ab145f81acbc6101cec"

RPROVIDES:${PN} += "libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-core-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
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
libwx-baseu-suse.so.16.0.0 \
libxkbcommon.so.0"

inherit rpm
