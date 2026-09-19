SUMMARY = "LibreOffice Base"
DESCRIPTION = "This module allows you to manage databases, create queries and reports \
to track and manage your information by using LibreOffice office \
suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-base-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "5b781305542e7dd82df14abdb086231ccfef3b616da5ff5941438e63909963e42378f873c2e66db0c2d2da93d7fe7f4d829db5a3d09bfe871ac949b9f79301b5"

RPROVIDES:${PN} += "libabplo.so \
libdbplo.so \
libdbulo.so \
libmysqlclo.so \
libreoffice-base \
librptlo.so \
librptuilo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
jre \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbalo.so \
libgcc-s.so.1 \
libi18nlangtag.so \
libm.so.6 \
libmariadb.so.3 \
libmergedlo.so \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
rtld-GNU-HASH"

inherit rpm
