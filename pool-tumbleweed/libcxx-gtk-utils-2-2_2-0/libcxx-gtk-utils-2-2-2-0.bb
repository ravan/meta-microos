SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-2-2_2-0-2.2.20-1.23.aarch64.rpm"
RPM_HASH = "c5b1db4ab0c99da46b4d4e6a55bf214c320d578c8ac8db379809578c3e28fc6babed1b7afabe674deea43ddbe0c378197b2b0dad8da6092d510c019524f5a6b2"

RPROVIDES:${PN} += "libcxx-gtk-utils-2-2-2-0 \
libcxx-gtk-utils-2-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
