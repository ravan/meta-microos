SUMMARY = "PCSC driver for Schlumberger Reflex 60 smartcard readers"
DESCRIPTION = "This package contains a driver for the Reflex 62 and Reflex 64 smart \
card readers produced by Schlumberger. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "pcsc-reflex60-2.2.0-159.5.aarch64.rpm"
RPM_HASH = "5179899f693378caacd79ea1f60e19fdb5159992ed48389606751588bb1800ba332ae1dfbfd6f46d96949d695833498815a6f4283dc31e07d5ac0f8a302d7ddc"

RPROVIDES:${PN} += "libslb-rf60.so \
pcsc-reflex60"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-lite"

inherit rpm
