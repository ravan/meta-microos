SUMMARY = "Shared library for AVFS, an archive look-inside filesystem"
DESCRIPTION = "This package includes the runtime shared library for the package avfs. \
AVFS is a system, which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libavfs1-1.2.0-3.5.aarch64.rpm"
RPM_HASH = "5b8462d025877d22b7852beb1b34b6709a4012e9fc66ebf5d361d8235d48be1547587867cb3f92dec18d402ea7a7f6ffabe4ddccb7aa50b01911fb2c400830a9"

RPROVIDES:${PN} += "libavfs.so.1 \
libavfs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz.so.1 \
liblzma.so.5 \
libneon.so.27 \
libz.so.1 \
libzstd.so.1"

inherit rpm
