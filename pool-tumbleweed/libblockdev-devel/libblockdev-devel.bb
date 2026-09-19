SUMMARY = "Development files for the LibBlockDev library"
DESCRIPTION = "This package provides header files, pkg-config modules and API documentation \
needed for development with the LibBlockDev library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libblockdev-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "6532b1a97f2deb3a676e1497095ffbb031ea88b0ebe8b3324d80b70cb6aef2d11ef7497bb80b9b364829dc1262ee3f1bc64d97c3d964d574f6c41c5a890f0181"

RPROVIDES:${PN} += "libblockdev-devel \
pkgconfig-blockdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libblockdev3 \
pkgconfig-glib-2.0"

inherit rpm
