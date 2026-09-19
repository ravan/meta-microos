SUMMARY = "KDE Privacy Utility"
DESCRIPTION = "Helps clean unwanted traces the user leaves on the system."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "sweeper-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "fa08e66f6c5fb0147120e778351ec211a30079cea5b9e0e65ff90db9f0b14f4d7920c6d1d34188c33c27189d40f671f39fe5b67a6d0207c8a3bf7ccdf8c6bcee"

RPROVIDES:${PN} += "sweeper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libPlasmaActivitiesStats.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
