SUMMARY = "Deflate/zlib compatible compression library"
DESCRIPTION = "Zopfli Compression Algorithm is a compression library programmed in C to \
perform very good, but slow, deflate or zlib compression."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopfli1-1.0.3-2.12.aarch64.rpm"
RPM_HASH = "24dfd710309a69879cb6421a26d98bb205ade7d66c18ae3bf6346c8cea7f4337446eb2a3d5d3bccaf4d448a51c3d94d3fcd294b07938dbfc50e7450d4f78e34e"

RPROVIDES:${PN} += "libzopfli.so.1 \
libzopfli1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
