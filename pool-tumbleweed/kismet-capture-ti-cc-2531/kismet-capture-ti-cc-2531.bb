SUMMARY = "Kismet TICC2531 802.15.4 Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments  TICC2531 802.15.4 \
Zigbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-ti-cc-2531-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "6642a90343a12dbb0b520ffef748f007fa7aa21db55d33dc86b75ac57e476ba88d62e9b402c5be5abd3bba0e926388db7568f11e524e5a918e56d8ffaf8b39cc"

RPROVIDES:${PN} += "kismet-capture-ti-cc-2531"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libusb-1.0.so.0 \
libwebsockets.so.22"

inherit rpm
