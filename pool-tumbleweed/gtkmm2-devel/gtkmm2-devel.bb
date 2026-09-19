SUMMARY = "C++ Interface for GTK2 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm2 wraps \
GTK+ 2. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.5"

RPM_NAME = "gtkmm2-devel-2.24.5-5.6.aarch64.rpm"
RPM_HASH = "7e9941cbce124caf004b11b95794f2ee049b9c2dd46788e6fa5c9c9a24e4ff5fa4d7b883d7d8ee2f1525ed54fcaad79787afc1af032cde98fa3cb3d49fc2d2dc"

RPROVIDES:${PN} += "gtkmm2-devel \
gtkmm2-doc \
gtkmm24-devel \
pkgconfig-gdkmm-2.4 \
pkgconfig-gtkmm-2.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkmm-2-4-1 \
pkgconfig-atkmm-1.6 \
pkgconfig-gdkmm-2.4 \
pkgconfig-giomm-2.4 \
pkgconfig-gtk+-2.0 \
pkgconfig-gtk+-unix-print-2.0 \
pkgconfig-pangomm-1.4"

inherit rpm
