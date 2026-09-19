SUMMARY = "Database connectivity and creation framework - MySQL driver"
DESCRIPTION = "This package contains the MySQL driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-mysql-driver-3.2.0-10.7.aarch64.rpm"
RPM_HASH = "0c436a2a3cd320c79149f4c821e1a598ca6b84044aff1097a9c136dfc66425eb7ed932e8fdf9875fbd39358ea1826b7262e354761b0b9277796d1be4ddcebdcd"

RPROVIDES:${PN} += "calligra-kexi-mysql-driver \
kdb-mysql-driver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDb3.so.4 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
