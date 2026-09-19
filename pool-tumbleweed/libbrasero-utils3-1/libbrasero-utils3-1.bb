SUMMARY = "Brasero miscellaneous utility function library"
DESCRIPTION = "Brasero is an application to burn CD/DVDs for the GNOME Desktop. It is \
 \
This subpackage contains a library of Brasero with utility functions \
that did not fit in the other two categories (brasero-burn, \
brasero-media)."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "libbrasero-utils3-1-3.12.3+43-3.3.aarch64.rpm"
RPM_HASH = "580a011ee3e380916b08de0f2e293a64fc5d8c95a46284c3608fd3595d86f975e4ca3713b6eabedc066d7d1cfcc3cb55b24537b7a6085d736e18d14a2e0df6b9"

RPROVIDES:${PN} += "libbrasero-utils3-1 \
libbrasero-utils3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtotem-plparser.so.18"

inherit rpm
