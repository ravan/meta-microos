SUMMARY = "Multilingual text processing library for the C language"
DESCRIPTION = "A multilingual text processing library for the C language"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.5"

RPM_NAME = "m17n-lib-devel-1.8.5-1.6.aarch64.rpm"
RPM_HASH = "61b0f72d4c8d73da182a40b942ac6e9a55de0db1381ffe68550a194901cc64f1f4ab393f8579e1406b0305b2dd11cceb1b96072554a11d4869d3b8e1b10eeeed"

RPROVIDES:${PN} += "m17n-lib-devel \
pkgconfig-m17n-core \
pkgconfig-m17n-flt \
pkgconfig-m17n-gui \
pkgconfig-m17n-shell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
m17n-lib"

inherit rpm
