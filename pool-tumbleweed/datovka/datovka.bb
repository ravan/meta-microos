SUMMARY = "Library to access Czech eGov system 'Datove schranky'"
DESCRIPTION = "A library for accessing ISDS (Informační system datovych schranek/ \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "4.29.4"

RPM_NAME = "datovka-4.29.4-1.1.aarch64.rpm"
RPM_HASH = "298c3d11cd527b5dc64dd2be06fa0102f1b81b616336c0e31159c568b9e7536cfe2e8621adac912fa6d57215bf518329c47c231c4e5174e0c413590f6672142c"

RPROVIDES:${PN} += "datovka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdatovka.so.8 \
libgcc-s.so.1 \
libquazip1-qt6.so.1.7 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
