SUMMARY = "Power Device Enumeration Framework - Library"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.91.3"

RPM_NAME = "libupower-glib3-1.91.3-1.2.aarch64.rpm"
RPM_HASH = "1cd024b9c205330cc765e80e077515daab495f62edc8ba0937cd6fcc5d284d446a6b632570114f5f0d483574e1f800beb0a851a67f2c93f1f18b02923f8dc2a6"

RPROVIDES:${PN} += "libupower-glib.so.3 \
libupower-glib3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
