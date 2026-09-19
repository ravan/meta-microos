SUMMARY = "Development files for libpkgmanifest"
DESCRIPTION = "Development files for libpkgmanifest."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.9"

RPM_NAME = "libpkgmanifest-devel-0.5.9-2.5.aarch64.rpm"
RPM_HASH = "32a10ad837714ea215a7d8ea405a051526d2a2d3904ce42f13fdf85777d8294d42bdc35e61494d579e2063372f3d900a12e856bf4ebd37bfb9d318f50c18a7a8"

RPROVIDES:${PN} += "libpkgmanifest-devel \
pkgconfig-libpkgmanifest"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpkgmanifest0 \
pkgconfig-yaml-cpp"

inherit rpm
