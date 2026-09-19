SUMMARY = "GlobalQSS style engine for Qt 5"
DESCRIPTION = "This engine allows theming of Qt applications using QSS files, \
similar to how GTK applications are themed with CSS files. \
 \
This package provides the program for Qt 5. \
 \
After installation you must restart your session. \
After uninstallation be sure to remove the config file: \
 /etc/profile.d/qt5-style-globalqss.sh"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "qt5-globalqss-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "2b0b1ead76314937110692b67ebafba0c41981835015530cfdef886de64bc420b1392a7f241baf921d5d6c8157fcc1975673e9acf8ec74825317f7db9a1b1f47"

RPROVIDES:${PN} += "config-qt5-globalqss \
libglobalqssplugin.so \
qt5-globalqss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
