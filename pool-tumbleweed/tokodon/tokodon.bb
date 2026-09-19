SUMMARY = "Mastodon client by KDE"
DESCRIPTION = "Tokodon is a Mastodon client. It allows you to interact with the Fediverse \
community."
LICENSE = "GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "tokodon-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8e65a74e529cc3a52f78faeab0e39798edaec3ceea1c0b35c366f7ac493e5059b5d6f5ec5d6092fbe279b1e01e3a469a267eea5371670a6796875a5eff9905e8"

RPROVIDES:${PN} += "tokodon"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-kitemmodels-imports \
kf6-sonnet-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Purpose.so.6 \
libKF6Service.so.6 \
libKF6WindowSystem.so.6 \
libKUnifiedPush.so.1 \
libKirigamiAddonsStatefulApp.so.6 \
libKirigamiApp.so.6 \
libKirigamiPlatform.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebSockets.so.6 \
libQt6WebView.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-webview \
qt6-webview-imports"

inherit rpm
