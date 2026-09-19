SUMMARY = "Kernel firmware files for Marvell WiFi fullmac drivers"
DESCRIPTION = "This package contains kernel firmware files for Marvell WiFi fullmac drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-mwifiex-20260610-1.2.noarch.rpm"
RPM_HASH = "6f8d234c0b0c8a3eb28af7c3d37717168b531aa952e008b866d06163a075be387c4f53f42043f75166879f265aa24c7ad0be152415fb215bc2db7e88b788acfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mrvl/pcie8897-uapsta.bin \
firmware-mrvl/pcie8997-wlan-v4.bin \
firmware-mrvl/pcieuart8997-combo-v4.bin \
firmware-mrvl/pcieusb8997-combo-v4.bin \
firmware-mrvl/sd8787-uapsta.bin \
firmware-mrvl/sd8797-uapsta.bin \
firmware-mrvl/sd8801-uapsta.bin \
firmware-mrvl/sd8887-uapsta.bin \
firmware-mrvl/sd8897-uapsta.bin \
firmware-mrvl/sdsd8977-combo-v2.bin \
firmware-mrvl/sdsd8997-combo-v4.bin \
firmware-mrvl/usb8766-uapsta.bin \
firmware-mrvl/usb8797-uapsta.bin \
firmware-mrvl/usb8801-uapsta.bin \
firmware-mrvl/usb8897-uapsta.bin \
firmware-mrvl/usbusb8997-combo-v4.bin \
kernel-firmware-mwifiex"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
