SUMMARY = "Development package for libkleo"
DESCRIPTION = "The development package for the libkleo libraries."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkleo-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8b11539c3f33f184c9d0c4381252ccd2b7e95decceba6bd21033ffdb5fc6fd4e69e266bf35db276de3196a02b77a4274c735bb41ca5797658f18005716603fc8"

RPROVIDES:${PN} += "cmake-KPim6Libkleo \
libkleo-devel"

RDEPENDS:${PN} += "cmake-Gpgmepp \
cmake-QGpgmeQt6 \
libKPim6libkleo6"

inherit rpm
