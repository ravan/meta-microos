SUMMARY = "A Library for Accessing Compressed Text Files"
DESCRIPTION = "Libzio provides a wrapper function for reading or writing gzip or bzip2 \
files with FILE streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.15"

RPM_NAME = "libzio1-1.15-1.3.aarch64.rpm"
RPM_HASH = "fcd73acec8a3ed18ce5284f6c832f4fb37ac46c74e4ef09ec94bd2eb6816754faa0fd2fc9fecb5c34577b1c08a728be8f7cf1efc11fe684d9068e4c093808db9"

RPROVIDES:${PN} += "libzio \
libzio.so.1 \
libzio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
