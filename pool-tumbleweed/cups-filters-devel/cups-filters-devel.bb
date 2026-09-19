SUMMARY = "Development files for cups-filters"
DESCRIPTION = "This package contains the development files for cups-filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT"

PV = "1.28.17"

RPM_NAME = "cups-filters-devel-1.28.17-9.1.aarch64.rpm"
RPM_HASH = "5c28ff11b27bf11d2832490a2fc819c7507c7c367cfb9e57004485c76f4f8b905154b65b58894718618f5f81b96d3dd01e46f91f3a855e2ef9a236876e9f89ac"

RPROVIDES:${PN} += "cups-filters-devel \
pkgconfig-libcupsfilters \
pkgconfig-libfontembed"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups-filters"

inherit rpm
