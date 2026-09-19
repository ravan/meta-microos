SUMMARY = "Driver for Samsung Printer Language printers"
DESCRIPTION = "SpliX is a set of CUPS printer drivers for SPL (Samsung Printer \
Language) printers. Some Samsung, Xerox and Dell printers use that \
language."
LICENSE = "GPL-2.0"

PV = "2.0.0.315"

RPM_NAME = "splix-2.0.0.315-4.8.aarch64.rpm"
RPM_HASH = "2d6f00d5136ce9996e1d9deff2c6abde93ee36623beeb2a83344efe549dbf4053b550cb0192a22a446fdbf6da313c27274b0c204fa7fc60d9539ca5d7509d802"

RPROVIDES:${PN} += "cups-drivers-splix \
splix"

RDEPENDS:${PN} += "/usr/bin/sh \
cups \
ghostscript \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libjbig85.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
