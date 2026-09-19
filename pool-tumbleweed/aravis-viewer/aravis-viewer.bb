SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "This package contains arv-viewer, GUI application for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.36"

RPM_NAME = "aravis-viewer-0.8.36-2.3.aarch64.rpm"
RPM_HASH = "9c6c04335626131cdbd285522c3c5fb56240022773e99979990e87de330255cf490957a17f15f879848e9dc445eaef1f2150fd6a8ad476bdfc992900b576dbb7"

RPROVIDES:${PN} += "aravis-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
