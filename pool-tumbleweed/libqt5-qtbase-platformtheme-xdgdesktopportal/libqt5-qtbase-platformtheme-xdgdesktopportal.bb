SUMMARY = "Qt 5 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 5 plugin for integration with flatpak and snap."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libqt5-qtbase-platformtheme-xdgdesktopportal-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "7fa4774b349e12447613040e31b172cc84bffb3cdb95833623f1e8755de235867636b528803237e75e9d5d7875867f0fa263d08f46e20a0a77261d38947c9b1c"

RPROVIDES:${PN} += "libqt5-qtbase-platformtheme-flatpak \
libqt5-qtbase-platformtheme-xdgdesktopportal \
libqxdgdesktopportal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
