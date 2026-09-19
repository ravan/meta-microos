SUMMARY = "SDR driver for FL2000 based USB 3.0 to VGA adapters"
DESCRIPTION = "Osmo-fl2k allows to use USB 3.0 to VGA adapters based on the \
Fresco Logic FL2000 chip as general purpose DACs and SDR transmitter \
generating a continuous stream of samples by avoiding the HSYNC and \
VSYNC blanking intervals."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1+git.20250902"

RPM_NAME = "osmo-fl2k-0.2.1+git.20250902-1.6.aarch64.rpm"
RPM_HASH = "f27d45ecc8ea5af47ed45f1c1f1027117a4966d95ed3a08e4f4c547cd5172a00af81e5e2ca9c365c0ce61249a17336f526d44050071bffe9968b5ef4618647aa"

RPROVIDES:${PN} += "osmo-fl2k"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libosmo-fl2k.so.0"

inherit rpm
