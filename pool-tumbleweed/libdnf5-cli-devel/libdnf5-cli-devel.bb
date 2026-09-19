SUMMARY = "Development files for libdnf5-cli"
DESCRIPTION = "Development files for libdnf5-cli."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5-cli-devel-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "a7d2dfdf3d0001c54672eef45b28e83873aef97c199e530df961c10a33ad9e179929cf95ad1f998b2a60d51d27d1a465a97b8975081d01d6ed72e9a7af8d59c8"

RPROVIDES:${PN} += "libdnf5-cli-devel \
pkgconfig-libdnf5-cli"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdnf5-cli3 \
pkgconfig-fmt \
pkgconfig-smartcols"

inherit rpm
