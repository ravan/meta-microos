SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-3-devel-2.2.20-1.25.aarch64.rpm"
RPM_HASH = "7ca30e1e1843d73d83fa99304c5420e9949fbf0443ebccb6c4d12826d2745713d17a161626da1d8240915d9799709e0f9f4194a02b61889cbef5d56d27aa3b4e"

RPROVIDES:${PN} += "libcxx-gtk-utils-3-devel \
pkgconfig-c++-gtk-utils-3-2.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcxx-gtk-utils-3-2-2-0 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
