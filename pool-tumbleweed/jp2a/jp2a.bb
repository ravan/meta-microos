SUMMARY = "Converts JPEG images to ASCII"
DESCRIPTION = "jp2a is a JPEG to ASCII converter."
LICENSE = "GPL-2.0-only"

PV = "1.3.3"

RPM_NAME = "jp2a-1.3.3-1.6.aarch64.rpm"
RPM_HASH = "fd51e140e770bbfe2e90184764d8ced27b4401308b7221211cde22b6dda402182d8167f53684606384f1dea56f403370a959529f5573984a86d51843c252c2be"

RPROVIDES:${PN} += "jp2a"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexif.so.12 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libwebp.so.7"

inherit rpm
