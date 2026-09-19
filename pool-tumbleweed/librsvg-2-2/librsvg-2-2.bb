SUMMARY = "A Library for Rendering SVG Data"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later & MIT"

PV = "2.62.3"

RPM_NAME = "librsvg-2-2-2.62.3-2.2.aarch64.rpm"
RPM_HASH = "384ab97866dfed39805b3b46642fe630cce6d0bad9f432a8f3c0aa13825d37b27c28993c00c6f29a0c30d344ee25b26029cfb38f18c4974e67b2b991c63048a0"

RPROVIDES:${PN} += "librsvg \
librsvg-2-2 \
librsvg-2.so.2 \
librsvg2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdav1d.so.7 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16"

inherit rpm
