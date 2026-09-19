SUMMARY = "SIXEL encoder/decoder"
DESCRIPTION = "A C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.5"

RPM_NAME = "libsixel1-1.10.5-2.7.aarch64.rpm"
RPM_HASH = "019b7468991db51b82585a4f599956079c8b49eadc99369d1874f3e7875654b544c023f01b1712771bfc167718dc95aaaf871e562d94eafc2287f5f2f1fcc307"

RPROVIDES:${PN} += "libsixel.so.1 \
libsixel1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgd.so.3 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16"

inherit rpm
