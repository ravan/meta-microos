SUMMARY = "Development Files and Libraries for the Berkeley DB library Version 4.8"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the header files and libraries."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb-4_8-devel-4.8.30-48.3.aarch64.rpm"
RPM_HASH = "4b931aecde6873966ff8b56cafadb9e319d9dd792ffea05f33c0bbd415a85c101362ec529815de80efe81e4d0362f0f7c875884d20026a14043755bb11bf75e3"

RPROVIDES:${PN} += "db-devel \
libdb-4-8-devel"

RDEPENDS:${PN} += "glibc-devel \
libdb-4-8"

inherit rpm
