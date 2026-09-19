SUMMARY = "QR code scanner for Plasma"
DESCRIPTION = "Qrca is a simple application for Plasma Desktop and Plasma Mobile that lets \
you scan many barcode formats and create your own QR code images."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "qrca-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4a0883bd81e3f6661ab97b2b66b023d708793caec4344421cf78738d45994526a54d2b8eccdd15aedc3b6b93ee77f2eb2bd0a2ec719e93a5e8f2cd89aba5c91e"

RPROVIDES:${PN} += "qrca"

RDEPENDS:${PN} += "kf6-kconfig-imports \
kf6-kirigami-imports \
kf6-prison-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KIOGui.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Notifications.so.6 \
libKF6Prison.so.6 \
libKF6PrisonScanner.so.6 \
libKF6Service.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-multimedia-imports"

inherit rpm
