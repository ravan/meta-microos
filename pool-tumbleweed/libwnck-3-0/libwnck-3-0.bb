SUMMARY = "Window Navigator Construction Kit (Library Package)"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs."
LICENSE = "LGPL-2.1-or-later"

PV = "43.3"

RPM_NAME = "libwnck-3-0-43.3-2.4.aarch64.rpm"
RPM_HASH = "4e373670e477da0f30e67f594b2c18e467b236b28b4f42cd6e92cb4893c108dde6f541eba28b74e0383fdcf51c0cd8563d07537cada94bdf44cfbfee68eda075"

RPROVIDES:${PN} += "libwnck \
libwnck-3-0 \
libwnck-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXRes.so.1 \
libXrender.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libstartup-notification-1.so.0"

inherit rpm
