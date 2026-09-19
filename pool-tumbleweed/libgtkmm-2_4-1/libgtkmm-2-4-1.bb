SUMMARY = "C++ Interface for GTK2 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm2 wraps \
GTK+ 2. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.5"

RPM_NAME = "libgtkmm-2_4-1-2.24.5-5.6.aarch64.rpm"
RPM_HASH = "eaddf4cc54991976a51c6e1fd417ab90be68a1d4f18d73efb087ecca24f3bfb0aaf1901c3f8f60c3276f3cfa6d561cd132a114e41800639f8685ebf2eb9f3e56"

RPROVIDES:${PN} += "gtkmm2 \
gtkmm24 \
libgdkmm-2.4.so.1 \
libgtkmm-2-4-1 \
libgtkmm-2.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
