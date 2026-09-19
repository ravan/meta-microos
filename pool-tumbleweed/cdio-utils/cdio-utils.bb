SUMMARY = "Utility programs making use of libcdio, a CD-ROM access library"
DESCRIPTION = "This package contains a number of utility programs that make use of \
libcdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "cdio-utils-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "922325387f5ec39f65e52786fe00ebcf27170031a9a0cc649f4ce9266e2c57330d2dcb4eb5a85cff56053277a7a231b26a122eed746e29c883ceed6b0d1e478c"

RPROVIDES:${PN} += "cdio-utils \
libcdio-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcddb.so.2 \
libcdio.so.19 \
libiso9660.so.12 \
libncurses.so.6 \
libtinfo.so.6 \
libudf.so.0 \
libvcdinfo.so.0"

inherit rpm
