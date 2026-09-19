SUMMARY = "Tools from libgsf, a structured file formats handling library"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.58"

RPM_NAME = "libgsf-tools-1.14.58-1.3.aarch64.rpm"
RPM_HASH = "6f9ecd04d8302c3bb8ccae959d666e517dd4536c74b2d6bb7478b05e6eeeebcb489f639b9a242262af403dfe8472e791a9448f4d0152609c104e2a07b6c98176"

RPROVIDES:${PN} += "libgsf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm
