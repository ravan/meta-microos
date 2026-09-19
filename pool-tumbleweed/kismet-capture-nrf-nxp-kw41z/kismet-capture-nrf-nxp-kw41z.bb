SUMMARY = "Kismet NXP KW41Z BTLE and Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the NXP KW41Z BTLE and Zigbee Sniffer capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-nrf-nxp-kw41z-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "07ed75af1e0a286f4ea37cd2b38ccc3a8200728dbdeb8589f9d61cc0f13f38055e6a71430ea97079a7b1d75ed1288439265d6caa3a3d0836f076f82a85753f16"

RPROVIDES:${PN} += "kismet-capture-nrf-nxp-kw41z"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libwebsockets.so.22"

inherit rpm
