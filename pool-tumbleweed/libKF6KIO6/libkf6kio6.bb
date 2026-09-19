SUMMARY = "KIO Libraries"
DESCRIPTION = "Network transparent access to files and data"
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6KIO6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6316491fdc1b79a86c12fff6803efe63c2a6c4bd7634b082c43e062702242ea62fb472610f103fba62cc64c7c7ea26719b5d32e40a2e70cda366f6874443e22e"

RPROVIDES:${PN} += "libKF6KIO6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kio \
ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libacl.so.1 \
libc.so.6 \
libmount.so.1 \
libstdc++.so.6"

inherit rpm
