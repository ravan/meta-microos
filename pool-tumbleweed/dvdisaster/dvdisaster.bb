SUMMARY = "Additional error protection for CD/DVD media"
DESCRIPTION = "dvdisaster provides a margin of safety against data loss on CD and DVD media \
caused by scratches or aging. It creates error correction data, \
which is used to recover unreadable sectors if the disc becomes damaged \
at a later time."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.10"

RPM_NAME = "dvdisaster-0.79.10-3.4.aarch64.rpm"
RPM_HASH = "a406437c34dc8d81095086318a8b480c627f86eb20725efb81c199caae9cc68bdd896d4edc6c40d4ceab86d3caab0b4ad80bd59c3060de84c01f87cab9920635"

RPROVIDES:${PN} += "dvdisaster"

RDEPENDS:${PN} += "dvdisaster-docs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
