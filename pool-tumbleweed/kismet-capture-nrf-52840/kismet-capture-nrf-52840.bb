SUMMARY = "Kismet nRF 52840 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 52840 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-nrf-52840-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "311fc377f075e2e7095204e7811fa6d14730df0dac6ffda06211a30d76b052439a7cfe4f75f68ca7bd5792be626618ab15d0b22ad977d0d8b2abe170259ebdd4"

RPROVIDES:${PN} += "kismet-capture-nrf-52840"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libwebsockets.so.22"

inherit rpm
