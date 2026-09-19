SUMMARY = "Library Package for Keybinder"
DESCRIPTION = "Library for registering global keyboard shortcuts. Keybinder \
works with GTK-based applications using the X Window System. \
 \
The library contains: \
- A C library, libkeybinder \
- Gobject-Introspection bindings"
LICENSE = "MIT & X11"

PV = "0.3.2"

RPM_NAME = "libkeybinder-3_0-0-0.3.2-1.36.aarch64.rpm"
RPM_HASH = "bbcafa849974696ad45dbdfa3c673ad79c3e4c4469747a3e2d2b330c9db8d021ef2995ed7920779ca561577d0869a71703f1eb3c83d926be2d8a04e468c97779"

RPROVIDES:${PN} += "libkeybinder-3-0-0 \
libkeybinder-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
