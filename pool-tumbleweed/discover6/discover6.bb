SUMMARY = "Software store for the KDE Plasma desktop"
DESCRIPTION = "Discover is a graphical software manager for the KDE Plasma desktop. It helps users to find software they might want easily and quickly. \
 \
By allowing to navigate a software library by search, categories, top lists along with detailed application information including screenshots and reviews, users can more quickly find applications that suit their needs."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "discover6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "7b1063818bfe9494b56ba43f193b180a972f4c79d2c0fa1c733e2815801af07cd339451f843c25c3d33a3a3c1db888a0556f0af347d436ecf8faeea8a5e0ae49"

RPROVIDES:${PN} += "discover \
discover6 \
libDiscoverCommon.so \
libDiscoverNotifiers.so"

RDEPENDS:${PN} += "kf6-kdeclarative-imports \
kf6-kirigami-imports \
kf6-kuserfeedback-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.3 \
libKF6Attica.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6NewStuffCore.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKirigamiApp.so.6 \
libQCoro6Core.so.0 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebView.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
