SUMMARY = "Neko virtual machine shared library"
DESCRIPTION = "Shared library for the Neko virtual machine."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libneko2-2.4.1-3.3.aarch64.rpm"
RPM_HASH = "255f405623a59da98843d5e339b2d5417900032ad8ff471009f83fff8903be9f0c5c544eaca198bcba1d3ed5c24d314e6ab1d0d6b1b3d428a33e9acd5c16dc2b"

RPROVIDES:${PN} += "libneko.so.2 \
libneko2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgc.so.1 \
libm.so.6"

inherit rpm
