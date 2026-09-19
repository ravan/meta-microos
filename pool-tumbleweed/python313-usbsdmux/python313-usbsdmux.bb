SUMMARY = "Tool to control an usb-sd-mux from the command line"
DESCRIPTION = "Tool to control USB-SD-mux hardware from linux-automation.com \
 \
Full manual is available at https://www.linux-automation.com/usbsdmux-M01/"
LICENSE = "LGPL-2.1-or-later"

PV = "25.8"

RPM_NAME = "python313-usbsdmux-25.8-1.5.aarch64.rpm"
RPM_HASH = "0698b354f2a41ab5782ff3ca9696ed69e4418341deb97bfa971f4a116cef4a179e27aefd75dc0d1b7b0afee64e4e39979a9387a36407888881dcab20ce40f231"

RPROVIDES:${PN} += "python3-usbsdmux \
python3.13dist-usbsdmux \
python313-usbsdmux \
python3dist-usbsdmux"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives \
usbsdmux-udev"

inherit rpm
