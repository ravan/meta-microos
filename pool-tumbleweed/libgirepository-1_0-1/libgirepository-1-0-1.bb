SUMMARY = "GObject Introspection Library"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.86.0"

RPM_NAME = "libgirepository-1_0-1-1.86.0-3.4.aarch64.rpm"
RPM_HASH = "91920a7fdba3ffa6409406f71cff0620a807c03079afe5d580e18fdee1ff7e1bd7ad58fe178c063706ca842d8d1eacb9f6ff0b61cfe69e5e3c001d5776011883"

RPROVIDES:${PN} += "libgirepository-1-0-1 \
libgirepository-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
girepository-1-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
