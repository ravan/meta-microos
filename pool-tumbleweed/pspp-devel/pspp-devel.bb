SUMMARY = "Development files for PSPP, a statistical analysis program"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains libraries and header files for developing \
applications that want to build pspp plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.1"

RPM_NAME = "pspp-devel-2.1.1-2.2.aarch64.rpm"
RPM_HASH = "4d06cf4b9e3e47039ba2bd4ae3a6a8e0f5328a7432031d34568cf8be01a21ddf26b924187cdcdf52cd2e16c12c1e1065d23df2f94849988aa2c7ab016c9f03d6"

RPROVIDES:${PN} += "pspp-devel"

RDEPENDS:${PN} += "cairo-devel \
glib2-devel \
glibc-devel \
gsl-devel \
harfbuzz-devel \
libxml2-devel \
pango-devel \
postgresql-devel \
xz-devel \
zlib-devel"

inherit rpm
