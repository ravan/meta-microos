SUMMARY = "Development files for the Qt5 SQL library"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Sql-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "50d94547489ac6d3706c3c52b4e2e5cd17d7835d20b417cf4e04b085f148fb6af74af2a1c3fc1602bbcd920ff1c0a8f861342da7e04f54566bca0fa7d9bd3a10"

RPROVIDES:${PN} += "cmake-Qt5Sql \
libQt5Sql-devel \
pkgconfig-Qt5Sql"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Sql5 \
pkgconfig-Qt5Core"

inherit rpm
