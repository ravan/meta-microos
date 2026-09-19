SUMMARY = "Gerber File Viewer that supports the RS-274X Standard"
DESCRIPTION = "This package contains development files for developing applications \
that use gerbv library."
LICENSE = "GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "gerbv-devel-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "603ed42f6ceb71c1ebd188dbfad7fe2f16ac35207ddfe4bd57bd92cd42fe11159a6d292a8012d6c6baab6ea2d3024cd959905303f5613e05a0f85a8e1c1b7c59"

RPROVIDES:${PN} += "gerbv-devel \
pkgconfig-libgerbv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgerbv1 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-libpng"

inherit rpm
