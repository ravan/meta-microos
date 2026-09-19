SUMMARY = "Qt 5 gtk2 plugin"
DESCRIPTION = "Qt 5 plugin for better integration with gtk-based desktop enviroments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-platformtheme-gtk2-5.0.0+git20170311-10.34.aarch64.rpm"
RPM_HASH = "bd60aede1c31d8a45e42c1e18c740650e981be3db555640f006e0ecbd6f375a3b8ae779c4f867efd0f927663fd3ac7d244ff205c67d0e5b9a2d7fcccadffa75a"

RPROVIDES:${PN} += "libqgtk2.so \
libqgtk2style.so \
libqt5-qtstyleplugins-platformtheme-gtk2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
