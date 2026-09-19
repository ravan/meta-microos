SUMMARY = "Development files for the BAMF window matching library"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains files that are needed to build applications."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-devel-0.5.6-1.17.aarch64.rpm"
RPM_HASH = "c936ea52bffe75d20d0058a6e31706844d3f60de8d3d988c4241c3b5c5b1d1e69fa818393619fdc8b48e25deacf47002847f85e736e31509d4ef80606d477fd0"

RPROVIDES:${PN} += "bamf-devel \
pkgconfig-libbamf3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbamf3-2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Bamf-3-0"

inherit rpm
