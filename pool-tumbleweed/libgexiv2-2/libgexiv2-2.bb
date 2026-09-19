SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.6"

RPM_NAME = "libgexiv2-2-0.14.6-2.4.aarch64.rpm"
RPM_HASH = "3dcc0172c4de785bb337a3da2b7d3ead7d7648904233ee9741393fa5d968308a349218372dd3782731e2ba2abdedf605f9de9d472cddcc0463cd6e96812fd0fe"

RPROVIDES:${PN} += "libgexiv2-2 \
libgexiv2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
