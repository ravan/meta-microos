SUMMARY = "Bluetooth manager written in Qt"
DESCRIPTION = "A Bluetooth manager and Bluez front-end. With it, you can pair devices, connect to and remove devices, turn Bluetooth on and off, and more. \
Bluejay is powered by the Qt6 graphical toolkit and KDE Frameworks."
LICENSE = "MPL-2.0"

PV = "1.0.3+0"

RPM_NAME = "bluejay-1.0.3+0-1.2.aarch64.rpm"
RPM_HASH = "0bf1b9355beee1260f8c26a26d6be212d9afa36d419176d457a2844881853015f708f772ac3594e0abe370147f202b31bf8810cccc31848bd62e10338dbcc83e"

RPROVIDES:${PN} += "bluejay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6BluezQt.so.6 \
libKF6ColorScheme.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKirigamiAddonsStatefulApp.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
