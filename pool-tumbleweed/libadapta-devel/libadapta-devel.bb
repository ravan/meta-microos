SUMMARY = "Development files for libadapta"
DESCRIPTION = "Development files for libadapta."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "libadapta-devel-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "efebdcf27a5a0f8c5c5c8b5b74774db70bc225a409eba28edb08135e0e419ae74b44765360e2b5cb0c856642f329cf33aebd413984a6cf0d5cbd2d952c7cab5a"

RPROVIDES:${PN} += "libadapta-devel \
pkgconfig-libadapta-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-appstream \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk4"

inherit rpm
