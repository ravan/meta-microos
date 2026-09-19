SUMMARY = "Development files for Libgee"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides all the files needed for development using Libgee."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.8"

RPM_NAME = "libgee-devel-0.20.8-1.8.aarch64.rpm"
RPM_HASH = "ff1b469029a74d267e4f7f8288aedf3236cd813ecef4bea501dd88424306e0d4035b313fe2d344bb66503ff850559006c0da712453a40d70bb707222f6d11bd5"

RPROVIDES:${PN} += "libgee-devel \
pkgconfig-gee-0.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgee-0-8-2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Gee-0-8"

inherit rpm
