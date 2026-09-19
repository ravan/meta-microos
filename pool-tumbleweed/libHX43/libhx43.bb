SUMMARY = "Collection of routines for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4"

RPM_NAME = "libHX43-5.4-1.3.aarch64.rpm"
RPM_HASH = "cf1ca42b6ebfd336940992c8ddb4169931ce40e7f4c2b06ccce5d31dd40405982d8caa17f5c627f984155a741ac5dd3592270a8951d501e4903eeb096a0d10e6"

RPROVIDES:${PN} += "libHX.so.43 \
libHX43"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
