SUMMARY = "A light-weight C library for loading PNG images"
DESCRIPTION = "pnglite is a C library for loading PNG images. It was created as a \
substitute for libpng in situations when libpng is more than enough. It \
currently requires zlib for inflate and CRC checking and it can read the \
most common types of PNG images. The library has a small and simple to use \
interface."
LICENSE = "Zlib"

PV = "0.1.17"

RPM_NAME = "libpnglite0-0.1.17-2.9.aarch64.rpm"
RPM_HASH = "41e7e76174c2be0df6e54c06eef1c0076ad66e44fcbebd6d972b453ee9eda643b0667e3fcaeffa8e7d175a19f2c5024d642a34aae7152271098189c34fbfe70b"

RPROVIDES:${PN} += "libpnglite.so.0 \
libpnglite0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
