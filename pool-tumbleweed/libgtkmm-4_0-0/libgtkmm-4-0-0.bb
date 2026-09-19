SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.0"

RPM_NAME = "libgtkmm-4_0-0-4.22.0-1.3.aarch64.rpm"
RPM_HASH = "fef61db495c9ead7201198780fbc75ce4b0dac60f7ec2af0504bcbccce0765f4f9bbc59ee92661e6bed88dee0eacea635d7c990243609bd3832aa3e6e07bf6ac"

RPROVIDES:${PN} += "libgtkmm-4-0-0 \
libgtkmm-4.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairomm-1.16.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libpangomm-2.48.so.1 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
