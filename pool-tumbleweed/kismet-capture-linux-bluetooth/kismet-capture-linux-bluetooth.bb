SUMMARY = "Kismet Linux Bluetooth capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet Linux Bluetooth capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-linux-bluetooth-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "34559e6c27fdc17362a9ea68d3f65683bcb11d6847cdb5004024e358c7fd8ecacc59377a2e8a65eeda6ac2a0a0cd8f5a09fd29e85969065015bf3ea8723e8dd9"

RPROVIDES:${PN} += "kismet-capture-linux-bluetooth"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kismet \
kismet-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libwebsockets.so.22 \
permissions"

inherit rpm
