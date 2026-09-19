SUMMARY = "Graphical desktop application for updating Flipper Zero firmware"
DESCRIPTION = "Graphical desktop application for updating Flipper Zero firmware \
 \
* Update Flipper's firmware and supplemental data with a press of one button \
* Repair a broken firmware installation \
* Stream Flipper's display and control it remotely \
* Install firmware from a .dfu file \
* Backup and restore settings, progress and pairing data"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.3+git0.1699609231.bfce851"

RPM_NAME = "qFlipper-1.3.3+git0.1699609231.bfce851-4.11.aarch64.rpm"
RPM_HASH = "9e72af3fd2cc3f4393c0489b9bebf5b637db411e5394a500b6df0cfe770ddc41c29692f8217cb93e8aedeef42079f773a2a40a16e571001d1d8ec9f5456f391e"

RPROVIDES:${PN} += "qFlipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
qFlipper-base \
qFlipper-libflipperproto"

inherit rpm
