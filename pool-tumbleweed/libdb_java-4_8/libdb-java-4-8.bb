SUMMARY = "Java Bindings for the Berkeley DB"
DESCRIPTION = "These are the Java bindings for the Berkeley DB. They are needed for \
the Java support of db and dbxml."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb_java-4_8-4.8.30-48.3.aarch64.rpm"
RPM_HASH = "8f5990f021bd44d07fd385e2f235d509a64e165dccc595477b7827895847d5ff6b1901a913b8798368ee4f57bcaff040693149525488e67a053476b29ad5f22d"

RPROVIDES:${PN} += "db-java \
libdb-java-4-8 \
libdb-java-4.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4-8"

inherit rpm
