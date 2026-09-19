SUMMARY = "ODBC driver manager with some drivers included"
DESCRIPTION = "UnixODBC aims to provide a complete ODBC solution for the Linux \
platform. Further drivers can be found at http://www.unixodbc.org/."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.14"

RPM_NAME = "unixODBC-2.3.14-1.7.aarch64.rpm"
RPM_HASH = "c16942798ac0d24b4ddaf6648bec047371b7aace46ea36972c29a6c35600b9c8a31c75053f0710a6866c69a16282a5fb45d9e2079f0101587ee06423c3b224eb"

RPROVIDES:${PN} += "config-unixODBC \
libnn.so.1 \
libtemplate.so.1 \
unixODBC"

RDEPENDS:${PN} += "glibc-locale-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libodbc.so.2 \
libodbcinst.so.2 \
libreadline.so.8"

inherit rpm
