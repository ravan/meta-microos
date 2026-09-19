SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "47.2"

RPM_NAME = "libgnome-bluetooth-3_0-13-47.2-1.3.aarch64.rpm"
RPM_HASH = "27f2856afae57d4c492064a822c7bb214e43eeb3624076057e1937e13511c59dd8a01fb591c0e7a12f099ba737ffeae48dc50c24e12ce0fb52b00d9ae22247a4"

RPROVIDES:${PN} += "libgnome-bluetooth-3-0-13 \
libgnome-bluetooth-3.0.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libudev.so.1 \
libupower-glib.so.3"

inherit rpm
