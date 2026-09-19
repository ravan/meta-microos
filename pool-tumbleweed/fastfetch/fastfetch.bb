SUMMARY = "Neofetch-like tool written mostly in C"
DESCRIPTION = "Fastfetch is a neofetch-like tool for fetching system information and \
displaying them in a pretty way.  It is written mainly in C, with performance and \
customizability in mind."
LICENSE = "MIT"

PV = "2.68.1"

RPM_NAME = "fastfetch-2.68.1-1.1.aarch64.rpm"
RPM_HASH = "9ceae1ddfb851a4ba037b51af8471e487d585c9abbec4a4520400eb02f24abf483be245e5a9204f99eb7c96fe549331db8bf6b99be79c6077af8a1d2acb30966"

RPROVIDES:${PN} += "fastfetch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
