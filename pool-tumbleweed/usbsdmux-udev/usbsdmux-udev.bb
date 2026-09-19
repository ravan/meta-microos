SUMMARY = "Udev rules for usbsdmux"
DESCRIPTION = "Udev rules for usbsdmux"
LICENSE = "LGPL-2.1-or-later"

PV = "25.8"

RPM_NAME = "usbsdmux-udev-25.8-1.5.aarch64.rpm"
RPM_HASH = "88885e9e3151a516c33c01e45a9af9b8d9c5cef083f2f2ac9066c93fa97ebb9730190ee7fb85bb10a092d38bfb0234c834853c441b922e3f2f3a56c71a63eedb"

RPROVIDES:${PN} += "usbsdmux-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
