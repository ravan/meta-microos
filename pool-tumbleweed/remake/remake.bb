SUMMARY = "A gnu make version including a debuger"
DESCRIPTION = "remake is a patched and modernized version of GNU make utility that \
adds improved error reporting, the ability to trace execution in a \
comprehensible way, and a debugger."
LICENSE = "GPL-3.0-or-later"

PV = "4.3_1.6"

RPM_NAME = "remake-4.3_1.6-1.3.aarch64.rpm"
RPM_HASH = "8bb16ffb8d45ef9ea40be5bb8a8729163b9359cc61a7a7187864dd39ba93b1b0b3e424f256044dbcadb55c568f52a7e5f295698daa3f3fc2878f9b4529475fc2"

RPROVIDES:${PN} += "remake"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
