SUMMARY = "VLC-based Multimedia Player"
DESCRIPTION = "Kaffeine is a media player. \
What makes it different from the others is its support of digital TV (DVB). \
Kaffeine has a user-friendly interface so that even first-time users can start \
immediately playing their movies: from DVD (including DVD menus, titles, \
chapters, etc.), VCD, or a file."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.19git.20250316T013712~afc3f87"

RPM_NAME = "kaffeine-2.0.19git.20250316T013712~afc3f87-1.6.aarch64.rpm"
RPM_HASH = "d2ee24f2882a67125c98aabbf6d1c8cd9e884fb3f5134234c706ff9246185ed981ba3dab531fe8665b4518e2db1dfac77176c79a1d8555d22fc9b2d32750830b"

RPROVIDES:${PN} += "kaffeine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdvbv5.so.0 \
libm.so.6 \
libstdc++.so.6 \
libvlc.so.5 \
qt6-sql-sqlite \
vlc-noX"

inherit rpm
