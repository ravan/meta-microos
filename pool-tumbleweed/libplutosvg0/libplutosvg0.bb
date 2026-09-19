SUMMARY = "Tiny SVG rendering library in C"
DESCRIPTION = "PlutoSVG is a compact and efficient SVG rendering library written in C. \
It is specifically designed for parsing and rendering SVG documents embedded in OpenType fonts, \
providing an optimal balance between speed and minimal memory usage. \
It is also suitable for rendering scalable icons."
LICENSE = "MIT"

PV = "0.0.7"

RPM_NAME = "libplutosvg0-0.0.7-1.5.aarch64.rpm"
RPM_HASH = "c4cd3b166f300f1e4f0b1e3799b1a453cfc4dfe95cfbc546f3749972af36a0be85af5705d79cc1e8b3147a4346e1fc0b5207788203caf5d753a6a99ed3e0c5f7"

RPROVIDES:${PN} += "libplutosvg.so.0 \
libplutosvg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libplutovg.so.1"

inherit rpm
