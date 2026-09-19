SUMMARY = "Development files for the Poppler Glib wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-glib-devel-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "9e604ef562d49475fedda7276ac2c14b2fafda6eebc2c95e16e582854ae59f64a4cbe141c854fd3b5919d7c61b84453f657945654fcad3f195f78847c9d9e1e1"

RPROVIDES:${PN} += "libpoppler-glib-devel \
pkgconfig-poppler-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpoppler-glib8 \
pkgconfig-cairo \
pkgconfig-freetype2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-poppler \
typelib-1-0-Poppler-0-18"

inherit rpm
