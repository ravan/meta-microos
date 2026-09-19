SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "libswscale9-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "87f85e57babc4b988e36f2a5b0381316ea5b608a9a8f4d86ceece23797786ba3faa1b0106367f15760d7d371cde337602edbff60185c3048a7881c0e3c5c496d"

RPROVIDES:${PN} += "libswscale.so.9 \
libswscale9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.60 \
libavutil60 \
libc.so.6 \
libm.so.6 \
libshaderc-shared.so.1 \
libz.so.1"

inherit rpm
