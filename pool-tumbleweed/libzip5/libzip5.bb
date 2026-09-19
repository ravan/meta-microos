SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "This is libzip, a C library for reading, creating, and modifying zip \
archives.  Files can be added from data buffers, files, or compressed \
data copied directly from other zip archives.  Changes made without \
closing the archive can be reverted.  The API is documented by man \
pages."
LICENSE = "BSD-3-Clause"

PV = "1.11.4"

RPM_NAME = "libzip5-1.11.4-1.5.aarch64.rpm"
RPM_HASH = "e249b67a4a896e373ced91c29f55081c590b836c8af93bcc3dacfef1ba07f999db917365019a71ced20e24e7f01e559faa174a3b67c1bea6220a1d1fa7c0b611"

RPROVIDES:${PN} += "libzip.so.5 \
libzip5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgnutls.so.30 \
liblzma.so.5 \
libnettle.so.8 \
libz.so.1 \
libzstd.so.1"

inherit rpm
