SUMMARY = "GObject-based Plugin Engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "libpeas-gtk-1_0-1-1.38.1-1.3.aarch64.rpm"
RPM_HASH = "1c11b9a024415178e6455567a5fe5a5672dc09b4ead9ad413c2d4f0597c4ffa5b7c5f860d20a6c01b334722db14a4bbca6c63c0639f757006a92a5668d59b47f"

RPROVIDES:${PN} += "libpeas-gtk-1-0-1 \
libpeas-gtk-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.1"

inherit rpm
