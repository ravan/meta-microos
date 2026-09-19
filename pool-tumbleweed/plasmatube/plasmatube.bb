SUMMARY = "YouTube client"
DESCRIPTION = "PlasmaTube allows you to watch YouTube videos on your phone or desktop using a \
elegant user interface integrated with the rest of Plasma."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasmatube-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "665476a41b7ac769b948635492837ce63542932c6417c32bd2235c33c8dfc67170e66d89b76f1c5ba5587b11f7f15cdec558ee28ee41bdbd6bd8aff6a3108010"

RPROVIDES:${PN} += "plasmatube"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6WindowSystem.so.6 \
libMpvQt.so.3 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6 \
yt-dlp"

inherit rpm
