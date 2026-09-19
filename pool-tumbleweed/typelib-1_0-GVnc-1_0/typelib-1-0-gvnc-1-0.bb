SUMMARY = "Introspection bindings for gtk-vnc"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the libgvnc \
library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "typelib-1_0-GVnc-1_0-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "6d2e850be29e0b38e3ab23476e7508ab3aac6104faf88b67830884035c82367d78ec30e6df3762aa54b4d9a886e3051981a5c197912cc443819c6a76487608de"

RPROVIDES:${PN} += "typelib-1-0-GVnc-1-0 \
typelib-GVnc"

RDEPENDS:${PN} += "libgvnc-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
