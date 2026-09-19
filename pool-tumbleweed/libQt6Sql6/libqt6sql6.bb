SUMMARY = "Qt 6 SQL related library"
DESCRIPTION = "A Qt 6 library which is used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Sql6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "8985305c00b25145ceabf3b0f8e03a43154b21002614fb830548b2004dcf8a0815cb2df97ab7b1eb3562bbd6880dae924334274649dc6cb72f2f23538f7e3c27"

RPROVIDES:${PN} += "libQt6Sql.so.6 \
libQt6Sql6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
