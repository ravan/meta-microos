SUMMARY = "libgedit-gtksourceview shared library"
DESCRIPTION = "The libgedit-gtksourceview shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "299.7.1"

RPM_NAME = "libgedit-gtksourceview-300-5-299.7.1-1.1.aarch64.rpm"
RPM_HASH = "aaf6e0102eeb98fd1deb956fb9e11ce1faf8f16923be3e00cc6e50cd9904d322387a5339f172fd8c638c8d3ee36316375417a2358c0385a1a0836ecea74bf437"

RPROVIDES:${PN} += "libgedit-gtksourceview-300-5 \
libgedit-gtksourceview-300.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgedit-amtk-5.so.0 \
libgedit-gfls-1.so.0 \
libgedit-gtksourceview \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16"

inherit rpm
