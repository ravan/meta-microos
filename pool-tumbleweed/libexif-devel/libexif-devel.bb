SUMMARY = "An EXIF Tag Parsing Library for Digital Cameras (Development files)"
DESCRIPTION = "This library is used to parse EXIF information from JPEGs created by \
digital cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.26"

RPM_NAME = "libexif-devel-0.6.26-1.3.aarch64.rpm"
RPM_HASH = "7515ec67357eeee90c27c77bd049eed62f0f18b2ef892b30aed56a7e7a0f6f8bd7b5caca632cd028e3511b2abc6356d84ed189cd11a4d67ef5894e520fb2c1da"

RPROVIDES:${PN} += "libexif-devel \
pkgconfig-libexif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexif12"

inherit rpm
