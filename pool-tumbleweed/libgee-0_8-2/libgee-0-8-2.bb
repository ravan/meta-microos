SUMMARY = "GObject-based library providing commonly used data structures"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides Libgee's shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.8"

RPM_NAME = "libgee-0_8-2-0.20.8-1.8.aarch64.rpm"
RPM_HASH = "841222d5258c04eb8bdf5013d17e0bf14ec2e0d288fd8678dd44d32c74e6e8b44141db0f9c393e60cb0147522fb819b3c614d73b58bc93c9e3a5a5cb6d72bbfd"

RPROVIDES:${PN} += "libgee-0-8-2 \
libgee-0.8.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
