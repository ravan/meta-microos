SUMMARY = "Hdll libraries for HashLink"
DESCRIPTION = "This subpackage provides the hdll libraries for HashLink."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "hashlink-hdlls-1.15-4.2.aarch64.rpm"
RPM_HASH = "3048e91e339407d78c1cec6f8237039966cef43498cc111ae306fc838c817d3281640cb8d543f4a1c322df2b117902017da9d5b92c35ce98c57166f9aca5fac9"

RPROVIDES:${PN} += "hashlink-hdlls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libhl.so.1 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libopenal.so.1 \
libpng16.so.16 \
libturbojpeg.so.0 \
libuv.so.1 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
