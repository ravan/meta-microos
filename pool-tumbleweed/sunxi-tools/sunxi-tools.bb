SUMMARY = "Tools for Allwinner A10 devices"
DESCRIPTION = "Tools to help hacking Allwinner A10 (aka sun4i) based devices \
and its successors."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2+git20200914103652"

RPM_NAME = "sunxi-tools-1.4.2+git20200914103652-1.19.aarch64.rpm"
RPM_HASH = "7ceaf9583671ec4d0560528d962ccf4b259c6da6910faf936a295f2966e8c7d3ce63ca45a71119b995d374c11f674ea16c2d5e06afbfde678db0fda1e7be30b1"

RPROVIDES:${PN} += "sunxi-tools"

RDEPENDS:${PN} += "libc.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
