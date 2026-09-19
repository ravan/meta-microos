SUMMARY = "GLib2 binding for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Glib2 binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.4"

RPM_NAME = "libgpiod-glib1-2.2.4-1.3.aarch64.rpm"
RPM_HASH = "97ee59262d2a81b3e7ef3ab5e17d43069c51c086e3f1ab1ffb0e108d75fa3757d69501caf3b42f6ec842a87b39e7c37c7f2033162093f2586b0cd763b5111687"

RPROVIDES:${PN} += "libgpiod-glib.so.1 \
libgpiod-glib1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpiod.so.3"

inherit rpm
