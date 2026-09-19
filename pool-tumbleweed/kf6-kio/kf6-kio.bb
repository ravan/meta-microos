SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kio-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "1de43602808ab74fc6dfd83dd9bc1777dbb9aeeee41e196cd7929ceeb28c9a55e614c51b8d40997576ceb1dd1cf20c523eecf71c7ddbcc78defbf435f8c4d8da"

RPROVIDES:${PN} += "kf6-kio \
libkuriikwsfiltereng-private.so"

RDEPENDS:${PN} += "kf6-kded \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6DocTools.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libacl.so.1 \
libc.so.6 \
libexslt.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
