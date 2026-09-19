SUMMARY = "Basic Desktop Shell leveraging KDE Frameworks6 libraries"
DESCRIPTION = "liquidshell is a basic Desktop Shell leveraging KDE Frameworks6 libraries."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.1"

RPM_NAME = "liquidshell-1.10.1-1.5.aarch64.rpm"
RPM_HASH = "fc0b1ef8f58f28613c4d4d7f51ef1b19881c0efa4227b589bd7798502dc8c4d8aafa072c7d6cf9bc2f3aa4399c0f6a90ffa308dde45fbfae0a22a131aff1babc"

RPROVIDES:${PN} += "liquidshell"

RDEPENDS:${PN} += "/usr/bin/bash \
kmenuedit6 \
kscreen6 \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6BluezQt.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtils.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libpackagekitqt6.so.2 \
libstdc++.so.6 \
plasma6-nm \
plasma6-workspace"

inherit rpm
