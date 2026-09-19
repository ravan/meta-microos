SUMMARY = "Raspberry Pi rpiboot tool"
DESCRIPTION = "The raspberrypi-usbboot allows you to flash the eMMC through an USB cable."
LICENSE = "Apache-2.0"

PV = "20240926.102326.3"

RPM_NAME = "raspberrypi-rpiboot-20240926.102326.3-1.8.aarch64.rpm"
RPM_HASH = "5f34c68c348f3944bef5d5c2728ad2256edc7eee5d3a40e3931575fd34c5eb4879a1bc217332bd0682f4c57441e9bc377a23dfc00ffbab2ba0272c2e8e33a0be"

RPROVIDES:${PN} += "raspberrypi-rpiboot"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
