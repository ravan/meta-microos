SUMMARY = "GStreamer Clutter Plug-In"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
This plug-in for GStreamer contains elements to render to Clutter \
textures."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "gstreamer-plugin-cluttergst3-3.0.27-2.16.aarch64.rpm"
RPM_HASH = "8f2db517c3ed3abdeb000214a0eebb7a96d4a21c1531015af32c682cd7fa3e5d74f990e1a67d32da527a77cda1a4ed9d944be893235826b4c202c7e0df9476bf"

RPROVIDES:${PN} += "gstreamer-plugin-cluttergst3 \
libcluttergst3.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
