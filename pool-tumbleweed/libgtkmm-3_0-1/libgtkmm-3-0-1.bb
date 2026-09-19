SUMMARY = "C++ Interface for GTK3 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "libgtkmm-3_0-1-3.24.11-1.3.aarch64.rpm"
RPM_HASH = "51112266e3592b5b0542289bfdb26879c62d8dc032375cdcef7799010b7764ba7d12a16f3ad6ba07cfe51d35bd3ffc7b988fea298b457baa5557cbe85b515961"

RPROVIDES:${PN} += "libgdkmm-3.0.so.1 \
libgtkmm-3-0-1 \
libgtkmm-3.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
