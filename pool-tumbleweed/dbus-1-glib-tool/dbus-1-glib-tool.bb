SUMMARY = "Tool package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on tool to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains dbus-binding-tool and manpage."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.114"

RPM_NAME = "dbus-1-glib-tool-0.114-1.3.aarch64.rpm"
RPM_HASH = "e57a02986ef50174085dc8bb3377be70c6f3a0836a010b0bf2be8835cad3f8de258e7f64d40a0c26635da8f56ff68197e7442ff0a927df8ed2a4ffd54b552dbd"

RPROVIDES:${PN} += "dbus-1-glib-tool"

RDEPENDS:${PN} += "dbus-1-glib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libexpat.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
