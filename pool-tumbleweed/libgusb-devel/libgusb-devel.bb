SUMMARY = "Development files for libgusb, a GObject-based wrapper for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.9"

RPM_NAME = "libgusb-devel-0.4.9-1.10.aarch64.rpm"
RPM_HASH = "0103e904ae0e55cd05a45c2cdc7ad6dbefb09245777467773b880d3bba1b8558b806fc89577c347a06e63335b373233778c9557d0d7aa15d34d4bf6fa085fc30"

RPROVIDES:${PN} += "libgusb-devel \
pkgconfig-gusb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgusb.so.2 \
libgusb2 \
libjson-glib-1.0.so.0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libusb-1.0 \
typelib-1-0-GUsb-1-0"

inherit rpm
