SUMMARY = "Introspection bindings for libhinawa"
DESCRIPTION = "This package provides the GObject Introspection bindings for libhinawa, \
an I/O library for IEEE 1394 asynchronous transactions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "typelib-1_0-Hinawa-2_0-2.4.0-1.19.aarch64.rpm"
RPM_HASH = "0195abadfddc967c3a3673ee24b1e13225d74814dfecb601a16a50ef96e74574b1f366d14dfac786e0cfb6fb18300d1f5632fbb887470c299e6470a524bba197"

RPROVIDES:${PN} += "typelib-1-0-Hinawa-2-0 \
typelib-Hinawa"

RDEPENDS:${PN} += "libhinawa.so.2 \
libhinawa2 \
typelib-GLib \
typelib-GObject"

inherit rpm
