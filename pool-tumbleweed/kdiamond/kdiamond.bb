SUMMARY = "Single player puzzle game"
DESCRIPTION = "The objective of the game is to build lines of three similar diamonds."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdiamond-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "95a5986e45950282d512882c4daa07e0f478bdb58b9f8010f4f16bdef5d1a20c17af7e2fc912924d14b8e473f1bade5cd54d95845426b2008be30e5503010a48"

RPROVIDES:${PN} += "kdiamond \
kdiamond5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
