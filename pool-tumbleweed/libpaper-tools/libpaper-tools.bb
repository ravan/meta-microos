SUMMARY = "Tools that make use of libpaper"
DESCRIPTION = "This package provides the 'paper' binary"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.8"

RPM_NAME = "libpaper-tools-2.2.8-1.3.aarch64.rpm"
RPM_HASH = "c9210e4e3c47b5c4505e00778bd99e8c8372d7273e05d6c06567e8a06a8b3b656e86fc84de76f875f4d46f8710322b7f94f64c8bd1ad677eafd8e5196e8c679e"

RPROVIDES:${PN} += "libpaper-tools \
libpaper-utils \
paper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpaper.so.2"

inherit rpm
