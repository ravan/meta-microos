SUMMARY = "GLib-based library for using D-Bus"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains the shared library files."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.114"

RPM_NAME = "libdbus-glib-1-2-0.114-1.3.aarch64.rpm"
RPM_HASH = "cef0d636f615e3d0b0ca24740dfd8b5e5bdca9bedfb6439492186886815abe98df3892df4501e8f44aac8ab00e90d097a89bacc87bef2781eeeddb1a3c28dfe7"

RPROVIDES:${PN} += "dbus-1-glib \
dbus-1-glib-/usr/lib64/libdbus-glib-1.so.2 \
libdbus-glib-1-2 \
libdbus-glib-1.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
