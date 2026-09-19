SUMMARY = "Development files for libserd"
DESCRIPTION = "Development files for libserd."
LICENSE = "ISC"

PV = "0.32.10"

RPM_NAME = "serd-devel-0.32.10-1.1.aarch64.rpm"
RPM_HASH = "3dbfb5dd44f49baf1f14db76490d2c8ae700b3e0b7782263d0e4ddbca2f29bb36ed28a1cba870b2e7226595056c31256fa8d87e461a5d8567e2921c2d7ef5a43"

RPROVIDES:${PN} += "libserd-0-devel \
pkgconfig-serd-0 \
serd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserd-0-0"

inherit rpm
