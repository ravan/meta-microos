SUMMARY = "A chat client for Matrix, the decentralized communication protocol"
DESCRIPTION = "Neochat is a client for Matrix, the decentralized communication protocol for \
instant messaging."
LICENSE = "BSD-2-Clause & GPL-3.0-only & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "neochat-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2516203ff4dfec3153417b327715c482b5f49069737a54222848d21e315a4397fb26e37002a4aa6617b1da78f58a97622ef2388f0f7ce9e696bfbe875afbfdb0"

RPROVIDES:${PN} += "neochat"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-kitemmodels-imports \
kf6-kquickcharts \
kf6-prison-imports \
kf6-qqc2-desktop-style \
kf6-syntax-highlighting-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Purpose.so.6 \
libKF6Service.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6WindowSystem.so.6 \
libKUnifiedPush.so.1 \
libKirigamiAddonsComponents.so.6 \
libKirigamiApp.so.6 \
libKirigamiPlatform.so.6 \
libQCoro6Network.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6TextToSpeech.so.6 \
libQt6WebView.so.6 \
libQt6Widgets.so.6 \
libQuotientQt6.so.0.9 \
libc.so.6 \
libcmark.so.0.31.1 \
libicuuc.so.78 \
libm.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6 \
qt6-location \
qt6-positioning-imports \
qt6qmlimport-org.kde.kquickimageeditor.1"

inherit rpm
