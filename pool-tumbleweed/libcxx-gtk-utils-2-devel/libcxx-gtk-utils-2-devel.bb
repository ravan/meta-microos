SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-2-devel-2.2.20-1.23.aarch64.rpm"
RPM_HASH = "c72dc460b2b55ca18eeccbd83f3762a0443e059c35eb8dfd762ae8bb9e3e25c5bf9d701c04495eeaa05ed5dae14e05b9a939b63e035e38526b23cd4a6718cd2a"

RPROVIDES:${PN} += "libcxx-gtk-utils-2-devel \
pkgconfig-c++-gtk-utils-2-2.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcxx-gtk-utils-2-2-2-0 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
