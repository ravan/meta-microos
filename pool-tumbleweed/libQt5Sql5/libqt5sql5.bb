SUMMARY = "Qt 5 SQL related libraries"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Sql5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "52233aa00a73f3c3870e867e1ac81314cd1a24487f50184db6f189d69ce5cf4af5d5c1fe1ad1630159fd2ad5410253cc40d561e18537c354c393ad1cc253f8e4"

RPROVIDES:${PN} += "libQt5Sql.so.5 \
libQt5Sql5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
