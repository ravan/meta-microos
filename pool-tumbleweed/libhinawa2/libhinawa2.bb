SUMMARY = "I/O library for IEEE 1394 asynchronous transactions"
DESCRIPTION = "I/O library for IEEE 1394 asynchronous transactions to/from units on the bus, \
with GObject Introspection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libhinawa2-2.4.0-1.19.aarch64.rpm"
RPM_HASH = "7b2793d5812a469c6a8e18eaf6cbf5ec818cd97b587a731912c158705d5905897a0832c587c51677798f1a4682d17cf78e4bf66ce05785f69dda8336c33fc601"

RPROVIDES:${PN} += "libhinawa.so.2 \
libhinawa2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
