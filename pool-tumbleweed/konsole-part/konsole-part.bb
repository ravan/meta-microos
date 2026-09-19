SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment. \
This package provides KPart of the Konsole application."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konsole-part-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b9647749582db5f89441864dd77037cee3beb23e390e8ab5c50f23bd6d4175801b0f73eae342bed6897a508cf0ec768da2b05bc1a68142ffd20c545f8648cc43"

RPROVIDES:${PN} += "konsole-part \
libkonsoleprivate.so.26.08.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Parts.so.6 \
libKF6Pty.so.6 \
libKF6Service.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libicuuc.so.78 \
libm.so.6 \
libssh.so.4 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
