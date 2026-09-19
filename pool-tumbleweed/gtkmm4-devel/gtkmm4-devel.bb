SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.0"

RPM_NAME = "gtkmm4-devel-4.22.0-1.3.aarch64.rpm"
RPM_HASH = "fe98c95c3d076e51ff531186f419f73a3f660c7e21ff93c563afc9739b71ecf1b998cc31f9fd6bc41764aba3060b3bd78e51a07546802fea51b80ff531ff0613"

RPROVIDES:${PN} += "gtkmm4-devel \
pkgconfig-gtkmm-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkmm-4-0-0 \
pkgconfig-cairomm-1.16 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-giomm-2.68 \
pkgconfig-gtk4 \
pkgconfig-gtk4-unix-print \
pkgconfig-pangomm-2.48 \
pkgconfig-vulkan"

inherit rpm
