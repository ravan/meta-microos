SUMMARY = "Development files for libblockdev-utils"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_utils library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_utils-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "8a8aefed5408f4c83c86fdcba148cf01f778e6bc7a54fea7cf0b9d9329d536bebe195ab7bd6008c826040245a45557793d9b57a7044abc2f8fec8942af141202"

RPROVIDES:${PN} += "libbd-utils-devel \
libblockdev-utils-devel \
pkgconfig-blockdev-utils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libbd-utils3 \
pkgconfig-glib-2.0"

inherit rpm
