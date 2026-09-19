SUMMARY = "Development for libHX, a routines collection for C and C++ programming"
DESCRIPTION = "libHX is a C library (with some C++ bindings available) that provides \
data structures and functions commonly needed, such as maps, deques, \
linked lists, string formatting and autoresizing, option and config \
file parsing, type checking casts and more. \
 \
This subpackage contains the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4"

RPM_NAME = "libHX-devel-5.4-1.3.aarch64.rpm"
RPM_HASH = "651ad77a9db4d54b971077f23484a924a69cf3b087f9dc9aae64b6fd02381e73c4eb12ba8dda6dcf820e4a46b16215101eff94b7872672f96d748b4163ad175e"

RPROVIDES:${PN} += "libHX-devel \
pkgconfig-libHX"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libHX43"

inherit rpm
