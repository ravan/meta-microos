SUMMARY = "Non-ABI stable API for the Qt 6 SQL library"
DESCRIPTION = "This package provides private headers of libQt6Sql that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sql-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "0501ae861125644e03268fdd7a4007af59d07ebf50bd7995e47115287e7d3c6cf1a641cc5a85d65bba52d29d864378864be2d6163aa20244999e25cc8abfd5c5"

RPROVIDES:${PN} += "cmake-Qt6SqlPrivate \
qt6-sql-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Sql"

inherit rpm
