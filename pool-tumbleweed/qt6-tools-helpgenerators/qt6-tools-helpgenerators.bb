SUMMARY = "Qt Help files generator"
DESCRIPTION = "Qt 6 tool for generating .qch help catalogs."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-helpgenerators-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "87736b7d047c6c6c4df7718b1d5f745b32ef72b362ab114322183ce9312e1fadf56559cc02ab9c57a71af1266c6abb346cd1a35974923c3871e4a54f6b536d04"

RPROVIDES:${PN} += "qt6-tools-helpgenerators"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-docs-common \
qt6-sql-sqlite"

inherit rpm
