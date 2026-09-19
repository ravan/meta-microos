SUMMARY = "Shared Libraries for Cinnamon JS module"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package provides libraries for cjs."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "140.0"

RPM_NAME = "libcjs0-140.0-2.1.aarch64.rpm"
RPM_HASH = "82d7fa61529073fd05cac12857934cc9ebaabbe37f6917ffa5da4b16c165e54407673bd55dde5d9fa09aad16cf60433ead5ff4418fe838ab0f80eb178bc235e8"

RPROVIDES:${PN} += "libcjs.so.0 \
libcjs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
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
