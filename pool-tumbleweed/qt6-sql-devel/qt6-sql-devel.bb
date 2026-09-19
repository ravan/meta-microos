SUMMARY = "Development files for the Qt 6 SQL library"
DESCRIPTION = "Development files for the Qt 6 SQL library"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sql-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "29ed94ccc21d11ab7c5842f72e01b6ac46a1991f87a7051003e610688c1ef78bac24727c565cfce8c44c8f3c90317739f97186937c91775bd5ff5a529e435179"

RPROVIDES:${PN} += "cmake-Qt6Sql \
pkgconfig-Qt6Sql \
qt6-sql-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sql6 \
pkgconfig-Qt6Core"

inherit rpm
