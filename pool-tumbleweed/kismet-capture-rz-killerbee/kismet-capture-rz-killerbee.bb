SUMMARY = "Kismet Killerbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Killerbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-rz-killerbee-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "30457060daae77b4060542addc11c1169b2410753ca5d8c766c07926ebeb9705fbf985e7c5cce9745affb42534959f449990289717754bdb5f17333c70256b13"

RPROVIDES:${PN} += "kismet-capture-rz-killerbee"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libusb-1.0.so.0 \
libwebsockets.so.22"

inherit rpm
