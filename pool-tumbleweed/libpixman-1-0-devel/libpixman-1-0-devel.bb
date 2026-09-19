SUMMARY = "Development files for the Pixel Manipulation library"
DESCRIPTION = "Pixman is a pixel manipulation library for X and cairo."
LICENSE = "MIT"

PV = "0.46.4"

RPM_NAME = "libpixman-1-0-devel-0.46.4-2.6.aarch64.rpm"
RPM_HASH = "06c0fad6cdd7ba0b611cf7bb761dd1784f3204b620799cffc3f8b8c1e7529b0b6ce92c8e16f463f405ebd51d7cbb63960b295675cacd3b5b9c8c008570942652"

RPROVIDES:${PN} += "libpixman-1-0-devel \
pkgconfig-pixman-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpixman-1-0"

inherit rpm
