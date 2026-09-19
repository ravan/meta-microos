SUMMARY = "Driver plugins for tslib, an abstraction layer for touchscreens"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel events. \
 \
The idea of tslib is to have a core library and a set of plugins to \
manage the conversion and filtering as needed. \
 \
This subpackage contains the hardware driver plugins for tslib."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.24"

RPM_NAME = "tslib-plugins-1.24-1.4.aarch64.rpm"
RPM_HASH = "0ef785671f4476e32ad6bd0b4411e2bb679b986e5682405c72ab3716454fc86a47607dfe1189c4e6680cf5ad6ca8ddb9a73535d27ff8285cdc8317a2d0c1b582"

RPROVIDES:${PN} += "tslib-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libts.so.0"

inherit rpm
