SUMMARY = "Commandline application for updating Flipper Zero firmware"
DESCRIPTION = "Commandline application for updating Flipper Zero firmware \
 \
* Update Flipper's firmware and supplemental data with a press of one button \
* Repair a broken firmware installation \
* Stream Flipper's display and control it remotely \
* Install firmware from a .dfu file \
* Backup and restore settings, progress and pairing data"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.3+git0.1699609231.bfce851"

RPM_NAME = "qFlipper-cli-1.3.3+git0.1699609231.bfce851-4.11.aarch64.rpm"
RPM_HASH = "f64586d855d3b5bb3179b4f83e692755a1e9a5d7a4fa10feb4b8b5f158c53088a9a6726abc227dc827e43bb0ededd7feb2c84863ec65eb3b06699e1366c99a76"

RPROVIDES:${PN} += "qFlipper-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Network.so.6 \
libQt6SerialPort.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
qFlipper-base \
qFlipper-libflipperproto"

inherit rpm
