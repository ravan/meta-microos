SUMMARY = "Kismet nRF MouseJack capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF MouseJack capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-nrf-mousejack-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "331d29b17377f019bdd7d760c30452ccc69decf98ccb6c132b67dafa877fa93253eeae7774b5a7100094400f685df3d936e4358648de741846e054c9b428c558"

RPROVIDES:${PN} += "kismet-capture-nrf-mousejack"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libusb-1.0.so.0 \
libwebsockets.so.22"

inherit rpm
