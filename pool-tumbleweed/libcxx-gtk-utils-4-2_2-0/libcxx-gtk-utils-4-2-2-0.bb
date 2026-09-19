SUMMARY = "Lightweight library for GTK+ programs using C++"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-4-2_2-0-2.2.20-1.22.aarch64.rpm"
RPM_HASH = "415e59547ae55109a7446d229420674c98da7d274ad03619f9df04f87cff5391e92457c97fe39cc9c9cd8834aa2194a2c831e904124bc46cd814f8d4e8654d7a"

RPROVIDES:${PN} += "libcxx-gtk-utils-4-2-2-0 \
libcxx-gtk-utils-4-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
