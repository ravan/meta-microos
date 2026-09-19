SUMMARY = "Command Line tools for Managing Berkeley DB Databases"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the command line tools for managing Berkeley DB \
databases."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "db48-utils-4.8.30-48.3.aarch64.rpm"
RPM_HASH = "be8d2852d9c93cc0599a454d993f297ab04db435655d50efdd36c8c0509a5045f015abaa7d08b4f0410de6ad1e931ba651bb76758c9fc4385cecbba92ebbc801"

RPROVIDES:${PN} += "db-utils \
db48-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
update-alternatives"

inherit rpm
