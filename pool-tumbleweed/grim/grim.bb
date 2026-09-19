SUMMARY = "Wayland compositor image grabber"
DESCRIPTION = "This tool can grab images from a Wayland compositor."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "grim-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "490988bab73c135baaf1bbafa5ce60d5657f371384b97dad2900e2e80330234fd948d9d60493f8923b6fb493971382f6cd618b1f16784f415a1ab73d1790c589"

RPROVIDES:${PN} += "grim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0"

inherit rpm
