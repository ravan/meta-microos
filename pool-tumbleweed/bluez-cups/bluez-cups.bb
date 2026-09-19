SUMMARY = "CUPS Driver for Bluetooth Printers"
DESCRIPTION = "Contains the files required by CUPS for printing to Bluetooth-connected \
printers."
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "bluez-cups-5.82-2.4.aarch64.rpm"
RPM_HASH = "7e4cfc1afa4f5b0066bd3987792377595a710f38413be8925601b78b05bb207b77db0cad41cf7d3845b1ae32a6a2774098a9b78610c83f3275ecb526b018c429"

RPROVIDES:${PN} += "bluez-cups"

RDEPENDS:${PN} += "bluez \
cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0"

inherit rpm
