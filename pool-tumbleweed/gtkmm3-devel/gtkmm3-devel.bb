SUMMARY = "C++ Interface for GTK3 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "gtkmm3-devel-3.24.11-1.3.aarch64.rpm"
RPM_HASH = "7522ab21208544ba34afdde3da81dce423f09de86e87b0188a5bcc693f61006ee847619ac0408d44bebd0cfa8f90080a819cca108ba2194fb854d01d971598de"

RPROVIDES:${PN} += "gtkmm3-devel \
pkgconfig-gdkmm-3.0 \
pkgconfig-gtkmm-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkmm-3-0-1 \
pkgconfig-atkmm-1.6 \
pkgconfig-cairomm-1.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gdkmm-3.0 \
pkgconfig-giomm-2.4 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk+-unix-print-3.0 \
pkgconfig-pangomm-1.4"

inherit rpm
