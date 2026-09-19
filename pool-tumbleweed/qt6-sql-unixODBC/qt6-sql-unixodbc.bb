SUMMARY = "Qt 6 unixODBC plugin"
DESCRIPTION = "A plugin to connect to an ODBC driver manager in Qt applications and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sql-unixODBC-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "e775535275378563b66cfc277f934c98eb045d0b5587180f1ea35c2abb600a9025298b75e11097d54162a2844462d12a0f670cdb6da3eca4d5c6204ee9d949bd"

RPROVIDES:${PN} += "libqsqlodbc.so \
qt6-sql-unixODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
