SUMMARY = "Qt 5 unixODBC plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QODBC driver allows to connect to an ODBC driver manager and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Sql5-unixODBC-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "2e6516d7658810dc1ed90b82ff3b6eea39cbfa10b2c2b984ede8915b75d78443af93b7b39a87fb520b6a0b0dc166b4ee726deba6a7946a107120b2b1c28bcefd"

RPROVIDES:${PN} += "libQt5Sql5-unixODBC \
libqsqlodbc.so \
libqt5-sql-backend \
libqt5-sql-unixODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
