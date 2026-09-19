SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libsmartcols-devel-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "58060d6604119b9bd2c7a7c889333d74532300e17d3e84c08382d92c849c0ff35aaeb71375476c345b219f0e473ce610391181ce184f59aa61401395274e4915"

RPROVIDES:${PN} += "libsmartcols-devel \
pkgconfig-smartcols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmartcols1"

inherit rpm
