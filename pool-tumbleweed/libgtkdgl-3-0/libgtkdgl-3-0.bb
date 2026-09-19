SUMMARY = "GtkD gtkdgl library"
DESCRIPTION = "This package contains the GtkDGL library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgtkdgl-3-0-3.9.0-3.10.aarch64.rpm"
RPM_HASH = "bad404432790d3ea3d7fd82a777ce6f4697548651db420e85baaf5d04ebb6e9e7c355f954e2e729177e9aedd0785c14df02b2b7b5a5783f8828709425fddee42"

RPROVIDES:${PN} += "libgtkdgl-3-0 \
libgtkdgl-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.112"

inherit rpm
