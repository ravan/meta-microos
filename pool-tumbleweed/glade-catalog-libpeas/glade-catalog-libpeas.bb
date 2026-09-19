SUMMARY = "Glade catalog for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package provides a catalog for Glade, to allow the use the libpeas \
widgets in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "glade-catalog-libpeas-1.38.1-1.3.noarch.rpm"
RPM_HASH = "6e373bab688d76de349865810aefdb95d893df1c2e79ee6dd5c320282efa07af372dbbe47279dabf055685e6c1493edb8bb3a9c23fe140d9d6dfb8a3c95f59f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glade-catalog-libpeas"

RDEPENDS:${PN} += "glade \
libpeas-gtk-1-0-1"

inherit rpm
