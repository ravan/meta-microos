SUMMARY = "Kismet TI CC2540 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments CC2540 BTLE capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-ti-cc2540-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "22b27cc0514db0222b794d400adc0360ba3bd0e15e32d402a3389e45ea1a1ad7f9d199c9dff37fc7d12027b7b9333893ce23e1fab194c7d3d8550b09bb9180ea"

RPROVIDES:${PN} += "kismet-capture-ti-cc2540"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libusb-1.0.so.0 \
libwebsockets.so.22"

inherit rpm
