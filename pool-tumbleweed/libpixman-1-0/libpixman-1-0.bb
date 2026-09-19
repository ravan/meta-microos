SUMMARY = "Pixel manipulation library"
DESCRIPTION = "Pixman is a pixel manipulation library for X and cairo."
LICENSE = "MIT"

PV = "0.46.4"

RPM_NAME = "libpixman-1-0-0.46.4-2.6.aarch64.rpm"
RPM_HASH = "ea6f1f74a826738d42aa0a5203c8e9dcff0ebecc060fdd7289039252b2d2bae85011b03dac4c962217d7e4c8529c586bb780f36549d5b4ec6c4a17f7120e918e"

RPROVIDES:${PN} += "libpixman-1-0 \
libpixman-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
