SUMMARY = "Spreadsheet-like interface to SQLite databases"
DESCRIPTION = "SQLite Database Browser is a visual tool for creating, designing and \
editing database files compatible with SQLite. It provides a \
spreadsheet-like interface, without the need to learn SQL commands. \
Controls and guided dialogs are available for users to: \
 \
	* Create and compact database files \
	* Create, define, modify and delete tables \
	* Create, define and delete indexes \
	* Browse, edit, add and delete records \
	* Search records \
	* Import and export records as text \
	* Import and export tables from/to CSV files \
	* Import and export databases from/to SQL dump files \
	* Issue SQL queries and inspect the results \
	* Examine a log of all SQL commands issued by the application"
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.13.99"

RPM_NAME = "sqlitebrowser-3.13.99-2.4.aarch64.rpm"
RPM_HASH = "4e2a0a042f72e968040d50b925e8a050f5801fe9afde0e03d4bb9ab24d3ff7999aa9529710298800cbaa72b2a60099a65e1de74123a8261f27b7e8f9e0b9798d"

RPROVIDES:${PN} += "sqlitebrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqhexedit.so.0 \
libqscintilla2-qt6.so.15 \
libsqlcipher.so.0 \
libstdc++.so.6"

inherit rpm
