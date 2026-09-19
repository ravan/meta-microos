SUMMARY = "Abstraction layer for touchscreen"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.24"

RPM_NAME = "tslib-1.24-1.4.aarch64.rpm"
RPM_HASH = "a2d08f3ce0fe1162dd4fe77f70a18e4bca48035b284ef782ac42f0695710d6324219b76337217c69bf18dded128ee42c76e23f8694d4a415540a1b9202aa48e2"

RPROVIDES:${PN} += "config-tslib \
tslib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libts.so.0"

inherit rpm
