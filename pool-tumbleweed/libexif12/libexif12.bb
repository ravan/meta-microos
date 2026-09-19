SUMMARY = "An EXIF Tag Parsing Library for Digital Cameras"
DESCRIPTION = "This library is used to parse EXIF information from JPEGs created by \
digital cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.26"

RPM_NAME = "libexif12-0.6.26-1.3.aarch64.rpm"
RPM_HASH = "1700368d936e1bf38b17c45d3cc8fa31ced1a8058dc8c297567fbfad4c6de5ec9da21414b999d6b4a105d310622e763b1a1ef61caebe35971191e6dce7d60154"

RPROVIDES:${PN} += "libexif \
libexif.so.12 \
libexif12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
