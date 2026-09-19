SUMMARY = "Development files for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the files necessary for developing software using \
gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "gspell-devel-1.14.4-2.1.aarch64.rpm"
RPM_HASH = "73decd91c6cc001e6eebfa922abc3509cc8511cee222f6c168a65a3c9b0d17656f73ac202e687d8ef06aafbac70eb5c1f872a4d39de8795253a88aa33bf93a89"

RPROVIDES:${PN} += "gspell-devel \
pkgconfig-gspell-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgspell-1-3 \
pkgconfig-enchant-2 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-icu-uc \
typelib-1-0-Gspell-1"

inherit rpm
