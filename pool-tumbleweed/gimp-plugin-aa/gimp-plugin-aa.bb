SUMMARY = "The GNU Image Manipulation Program -- ASCII-Art output plugin"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "gimp-plugin-aa-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "e2cb30850015906e782e1ca716dd5c333bc304e408a51e6d257e0525a46ed8d2b21021d659cf9d19ca9d19ac61edfe5d9412c13604b299b1f4b4048d9e67b053"

RPROVIDES:${PN} += "gimp-3.0-plugin-aa \
gimp-plugin-aa"

RDEPENDS:${PN} += "gimp \
ld-linux-aarch64.so.1 \
libaa.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgegl-0.4.so.0 \
libgimp-3.0.so.0 \
libgimpui-3.0.so.0 \
libgimpwidgets-3.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
