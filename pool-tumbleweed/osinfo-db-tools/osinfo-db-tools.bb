SUMMARY = "Tools for managing the osinfo database"
DESCRIPTION = "This package provides tools for managing the osinfo database of \
information about operating systems for use with virtualization"
LICENSE = "LGPL-2.1+ & GPL-2.0+"

PV = "1.12.0"

RPM_NAME = "osinfo-db-tools-1.12.0-2.6.aarch64.rpm"
RPM_HASH = "55ffc52e780fb2ec4e6c74cbb44162ea4b00a8890798abeb792cb1a629bd00940181cb5f9f4660916cc3ad982df05edde708839ad46c1e7993fe63248bcbb4a2"

RPROVIDES:${PN} += "osinfo-db-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
