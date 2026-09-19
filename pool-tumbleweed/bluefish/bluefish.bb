SUMMARY = "A feature-Rich HTML Editor"
DESCRIPTION = "Bluefish is a HTML editor designed for the experienced Web designer \
(supports HTML, PHP, Java, Perl, Python, Ruby, C, Pascal and more). \
 \
It is based on Gtk+."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.17"

RPM_NAME = "bluefish-2.2.17-1.9.aarch64.rpm"
RPM_HASH = "1545eb52fcad784759ee34246363ac949221802eb3d32a684351f69ceab5598e665c80c5c3ed7a321d8112d9b2c950e0e2559e6c93080683b7389d9c85042e32"

RPROVIDES:${PN} += "bluefish \
bluefish-unstable"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgucharmap-2-90.so.7 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpython3.13.so.1.0 \
libxml2.so.16 \
sgml-skel"

inherit rpm
