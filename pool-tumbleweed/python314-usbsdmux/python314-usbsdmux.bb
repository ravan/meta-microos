SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "25.8"

RPM_NAME = "python314-usbsdmux-25.8-1.5.aarch64.rpm"
RPM_HASH = "18470684c492ceb9bf38271f382c1031a3e687243fdb9a07c9122ce3490997b9d1a311b4be1025064cfebce46f8949490625c7e9e551b53b0e0c969c5a9d4aea"

RPROVIDES:${PN} += "python3.14dist-usbsdmux \
python314-usbsdmux \
python3dist-usbsdmux"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives \
usbsdmux-udev"

inherit rpm
