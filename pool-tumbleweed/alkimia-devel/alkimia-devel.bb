SUMMARY = "Development Files for libalkimia"
DESCRIPTION = "The development files for libalkimia."
LICENSE = "LGPL-2.1-or-later"

PV = "8.2.1"

RPM_NAME = "alkimia-devel-8.2.1-1.6.aarch64.rpm"
RPM_HASH = "2a5d5ef6e28410104d1faf4b4bdc7cd2cc1e0018b7874a559f48b86af90300df57f51b645374052e1aae707577ee87f6030681fd4a7fc33521a604e74a5966a5"

RPROVIDES:${PN} += "alkimia-devel \
cmake-LibAlkimia6 \
pkgconfig-libalkimia6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6WebEngineWidgets \
libalkimia6-8"

inherit rpm
