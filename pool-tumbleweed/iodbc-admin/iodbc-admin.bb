SUMMARY = "Administration tools for iODBC"
DESCRIPTION = "The iODBC Driver Manager is an implementation of the SAG CLI and \
ODBC compliant driver manager which allows developers to write ODBC \
compliant applications that can connect to various databases using \
appropriate backend drivers. \
 \
This package provides tools for configuring and administering iODBC."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.16"

RPM_NAME = "iodbc-admin-3.52.16-2.3.aarch64.rpm"
RPM_HASH = "ecb65dbdd2022f0cb86c8a763386c99ca29bf337bcae4586d15922a73cb6fb9f539ac45979730235387e13d1ba0f2572f87ccd88dd2e6615dada68c93ef593cb"

RPROVIDES:${PN} += "iodbc-admin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgtk-x11-2.0.so.0 \
libiodbcinst.so.2"

inherit rpm
