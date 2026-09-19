SUMMARY = "Development files for libgsf, a structured file format handling library"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.58"

RPM_NAME = "libgsf-devel-1.14.58-1.3.aarch64.rpm"
RPM_HASH = "2d46f78985060b3f72de0bf2dfa8f3a5deb9239873cec72af343a4f30d32f3f4b804d1b7c7155c649669f6710dfbc002b1f4c18b08f5975bcb0e727699cebfd6"

RPROVIDES:${PN} += "libgsf-devel \
libgsf-doc \
pkgconfig-libgsf-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsf-1-114 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Gsf-1"

inherit rpm
