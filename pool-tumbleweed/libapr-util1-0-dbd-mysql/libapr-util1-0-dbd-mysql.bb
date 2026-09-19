SUMMARY = "DBD driver for MySQL"
DESCRIPTION = "DBD driver for MySQL database."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.5"

RPM_NAME = "libapr-util1-0-dbd-mysql-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "9910850b73fb172c590db91de8c7d700bd6c75ccff7b62ef8a530205d591248e5b15e267031722a0e22d62b8c6a66084c9092eca430754715b0dc299ae5ede36"

RPROVIDES:${PN} += "libapr-util1-0-dbd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-util1-0 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
