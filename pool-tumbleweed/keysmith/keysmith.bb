SUMMARY = "OTP client"
DESCRIPTION = "OTP client for Plasma Mobile and Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "keysmith-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "65bae425ca84fe9e8d8d539b8e33047ab5f1c7030b0d2e06156bfe275bd3cf7b2d2061373d8e2cc23d4660303405a9ba3939b6edf5ee0fac1e27d928ec9678ba"

RPROVIDES:${PN} += "keysmith"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-prison-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libsodium.so.26 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-multimedia-imports"

inherit rpm
