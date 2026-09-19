SUMMARY = "Shared library files for libresidfp"
DESCRIPTION = "Cycle exact SID emulation. \
 \
This project is meant to replicate the SID as faithfully as possible \
while keeping good performance for realtime use. It is not intended \
to expose the chip internal state or adding fancy effects. Both the \
6581 and the 8580 models are emulated. \
This package provides the shared library files for libresidfp."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "liblibresidfp0-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "7d056d72d60053b75d419b268832782bf3d24301e5eecafeda6c44ddbf9bb30c6f34235599266d0f6f6de1fce0ed5d1da359558e982977a5cb4ff1e67a11e3c4"

RPROVIDES:${PN} += "liblibresidfp0 \
libresidfp.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
