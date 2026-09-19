SUMMARY = "Pulse audio bridge for VNC client connections -- Introspection bindings"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package provides the GObject Introspection bindings for the \
libgvncpulse library."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "typelib-1_0-GVncPulse-1_0-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "ef30a847fbb70bdd3d00f44c05136b3fc0645bd78f5f3c5fef1c1eb27e0f51926bd1f273c0b12e4471e040e7f0d3a17b8c00ae2f020b1e930908628610d0c515"

RPROVIDES:${PN} += "typelib-1-0-GVncPulse-1-0 \
typelib-GVncPulse"

RDEPENDS:${PN} += "libgvncpulse-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GVnc \
typelib-Gio"

inherit rpm
