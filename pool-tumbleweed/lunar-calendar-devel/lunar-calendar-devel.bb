SUMMARY = "Development tools for ibus"
DESCRIPTION = "The lunar-calendar-devel package contains the header files and developer \
docs for lunar-calendar."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-calendar-devel-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "d4ad872925d6b2506509d68dd7fc93e1bf56c23949cb7e70cffcb030a98e1c28d19ea16be60f1ed2a8bcc3b8d727e3d4b89c73e72a741268b8e7cf478ea9c05b"

RPROVIDES:${PN} += "lunar-calendar-devel \
pkgconfig-lunar-calendar-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblunar-calendar-3-0-1 \
pkgconfig-gtk+-3.0 \
pkgconfig-lunar-date-3.0"

inherit rpm
