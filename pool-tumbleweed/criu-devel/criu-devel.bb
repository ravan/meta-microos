SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications with CRIU library."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.1"

RPM_NAME = "criu-devel-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "f1772e24619be2d576652c701e68fbe8eaec53c84601ba7d2b3092ce0b71ebb6bc0d83f26f8b6d56128e1f438c5e429bb08d03c2de9e061b008f95ba2e42f2b1"

RPROVIDES:${PN} += "criu-devel \
pkgconfig-criu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcompel1 \
libcriu2"

inherit rpm
