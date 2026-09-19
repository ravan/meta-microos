SUMMARY = "ESQL for GnuCOBOL"
DESCRIPTION = "Provides the possibility to use Cobol code in combination with databases."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "gnucobol-esql-3.2-4.2.aarch64.rpm"
RPM_HASH = "9075c1b0af0ba2d9fb06a52ce86ff124d2b4097646bd49e493e3d66a3af12e32da50a708d4c1f1c1413577d8ea35aec14295308d4080c20c130cfd38523de375"

RPROVIDES:${PN} += "esql \
gnucobol-esql \
libocsql.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
