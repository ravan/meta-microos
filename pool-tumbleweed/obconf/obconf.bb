SUMMARY = "Openbox Configuration Tool"
DESCRIPTION = "This is the official application from the Openbox developers to \
configure the Openbox window manager. It is not needed, but highly \
recommended when installing Openbox."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "obconf-2.0.4-10.8.aarch64.rpm"
RPM_HASH = "d9ead412d8525c3048206e2b60fa15842bf72b9179d4d2c3672a3f1c6f6dce8773c046019d9344ea89906ab6edc9b1a453b9ea085dc50f868f7463e5c4063dfd"

RPROVIDES:${PN} += "obconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libstartup-notification-1.so.0 \
libxml2.so.16 \
openbox"

inherit rpm
