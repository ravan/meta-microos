SUMMARY = "Development files for the Glib C++ API"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.1"

RPM_NAME = "glibmm2-devel-2.88.1-1.2.aarch64.rpm"
RPM_HASH = "066ab208848e60e30b701fff89d75092d367e1b219feebe6113c68b86761768a7b7a48a18f293e92b2f87cf160c5076f4099d69b955864f8de9059cbe17dfd20"

RPROVIDES:${PN} += "glibmm2-devel \
glibmm2-doc \
pkgconfig-giomm-2.68 \
pkgconfig-glibmm-2.68"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
libgiomm-2-68-1 \
libglibmm-2-68-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-glibmm-2.68 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-sigc++-3.0"

inherit rpm
