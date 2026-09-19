SUMMARY = "GlobalQSS style engine for Qt 6"
DESCRIPTION = "This engine allows theming of Qt applications using QSS files, \
similar to how GTK applications are themed with CSS files. \
 \
This package provides the program for Qt 6. \
 \
After installation you must restart your session. \
After uninstallation be sure to remove the config file: \
 /etc/profile.d/qt6-style-globalqss.sh"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "qt6-globalqss-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "1b613a72d008e6562d898bb1bb3c06c25fbdb5d2aea8c615729149eeeba8314b18b2bb4e9325c5aba64605940ea8b300e46aec0723aca5ebd19d1e244ac516c9"

RPROVIDES:${PN} += "config-qt6-globalqss \
libglobalqssplugin.so \
qt6-globalqss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
