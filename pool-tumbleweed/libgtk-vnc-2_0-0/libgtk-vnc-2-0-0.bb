SUMMARY = "A GTK widget for VNC clients"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "libgtk-vnc-2_0-0-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "77e668ac8e246526eb48d490859ea29bf84e5a1e7d6e7b1adf14327fcfee0a0438ac4791bffb5fca96de79f6053f209256a5a0d462bc804f331c4d41636782fb"

RPROVIDES:${PN} += "gtk-vnc \
libgtk-vnc-2-0-0 \
libgtk-vnc-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgvnc-1.0.so.0"

inherit rpm
