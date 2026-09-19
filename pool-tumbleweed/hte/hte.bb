SUMMARY = "Disassembler, object dumper and hex editor"
DESCRIPTION = "The HT editor is a file viewer, editor and analyzer for text, binary, \
and (especially) executable files."
LICENSE = "GPL-2.0-only"

PV = "2.1.0"

RPM_NAME = "hte-2.1.0-4.6.aarch64.rpm"
RPM_HASH = "7b3c6abb0816724ca3fc54bccec6e8323cf55102c02d67fdafca91408b7106958be727dbbb2e3a34232ce7ed6ef88d5cbc92fd6b67f229ee953c5e8140a5eebc"

RPROVIDES:${PN} += "hte"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzo2.so.2 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
