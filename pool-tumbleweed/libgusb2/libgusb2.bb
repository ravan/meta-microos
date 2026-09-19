SUMMARY = "GObject-based library for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.9"

RPM_NAME = "libgusb2-0.4.9-1.10.aarch64.rpm"
RPM_HASH = "a7be71300fc64f3d3075270a5cb0f8ca67b81e924069d136014d1c81c0a01c349b93ae43ddb5463183fbfebe43cb0d689436e9c6f039b7a51d268086122600c0"

RPROVIDES:${PN} += "libgusb.so.2 \
libgusb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libusb-1.0.so.0"

inherit rpm
