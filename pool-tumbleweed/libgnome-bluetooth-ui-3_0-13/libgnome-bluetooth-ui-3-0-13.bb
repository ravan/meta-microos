SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "47.2"

RPM_NAME = "libgnome-bluetooth-ui-3_0-13-47.2-1.3.aarch64.rpm"
RPM_HASH = "c3e69840d3652db7c16a632464bfd6db117e459f2da4ff67e2ef23714d91acb63a02dbde994ca8cae6142c84944472a95a320e5b2db60e6f2ef4a2b71ff438d4"

RPROVIDES:${PN} += "libgnome-bluetooth-ui-3-0-13 \
libgnome-bluetooth-ui-3.0.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libnotify.so.4 \
libudev.so.1 \
libupower-glib.so.3"

inherit rpm
