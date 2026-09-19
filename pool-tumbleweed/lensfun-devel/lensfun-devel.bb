SUMMARY = "Header and library definition files for lensfun"
DESCRIPTION = "Header and library definition files for developing applications \
that use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "lensfun-devel-0.3.4-7.5.aarch64.rpm"
RPM_HASH = "0e5cd661630156c4b54dbf1d8010a838114ad3166b872ec98d6b3ca1aeba05ac9b81221ec69efb9bf147167d48cf7ece2b23be1c0ee5057203b5b3ce8b6072d3"

RPROVIDES:${PN} += "lensfun-devel \
pkgconfig-lensfun"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lensfun-data \
liblensfun1 \
pkgconfig-glib-2.0"

inherit rpm
