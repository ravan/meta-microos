SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later"

PV = "1.88.1"

RPM_NAME = "libgjs0-1.88.1-2.1.aarch64.rpm"
RPM_HASH = "eeabd475372385d8e12af10d8d8c2f0fc7b3777c62b04d4977882d056081ebf4aafec2061ab73cb4c5a686f842c695b837e570c2620d6aaa5cdfa0d6aa84f016"

RPROVIDES:${PN} += "libgjs-0 \
libgjs.so.0 \
libgjs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
GjsPrivate-by-GNOME \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libffi.so.8 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-140.so.0 \
libreadline.so.8 \
libstdc++.so.6 \
typelib-GIRepository \
typelib-GLib \
typelib-GLibUnix \
typelib-GObject \
typelib-GjsPrivate \
typelib-cairo"

inherit rpm
