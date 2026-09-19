SUMMARY = "Library Implementing the freedesktop.org Desktop Menu Specification"
DESCRIPTION = "Garcon is a library based on GLib and GIO which implements the freedesktop.org \
Desktop Menu Specification. It is the sucessor to libxfce4menu and covers \
almost every part of the menu specification except for legacy menus and a few \
XML attributes. It is capable of loading menus modified with menu editors such \
as Alacarte and also supports merging."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.20.0"

RPM_NAME = "libgarcon-1-0-4.20.0-1.8.aarch64.rpm"
RPM_HASH = "c8807ecb270b7be630834f4793899f4a19199438768452e3dd7545d1d9d82a9bbfa53288c01a5941da458e2801aef3c32882479e10f45b143a2dedf0f035e3ab"

RPROVIDES:${PN} += "libgarcon-1-0 \
libgarcon-1.so.0 \
libgarcon-gtk3-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgarcon-data \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
