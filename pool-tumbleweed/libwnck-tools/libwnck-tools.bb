SUMMARY = "Window Navigator Construction Kit -- Tools"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs. \
 \
This package provides some utilities based on libwnck."
LICENSE = "LGPL-2.1-or-later"

PV = "43.3"

RPM_NAME = "libwnck-tools-43.3-2.4.aarch64.rpm"
RPM_HASH = "01f0051fff74e6dacbb5490be38e376dc0990ea43d530822a3e3241a5ba7121797066a9760aac47dfb62e041a98f87a0ebe0e2ddc493c8061e020530c9770015"

RPROVIDES:${PN} += "libwnck-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwnck-3.so.0"

inherit rpm
