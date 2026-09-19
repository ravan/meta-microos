SUMMARY = "PostgreSQL Database Driver for LibreOffice"
DESCRIPTION = "This package allows to access PostgreSQL databases from LibreOffice Base."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-base-drivers-postgresql-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "1c53766ed795b3e047738e668d6fd12658a5f90644c54a0c7f042d9c011c22c9ab73a40964527865d486f9829858c085ccec407baf10fb4c3eae8d37f86ff529"

RPROVIDES:${PN} += "libpostgresql-sdbc-impllo.so \
libpostgresql-sdbclo.so \
libreoffice-base-drivers-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libpq.so.5 \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
postgresql \
rtld-GNU-HASH"

inherit rpm
