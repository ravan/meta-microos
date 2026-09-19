SUMMARY = "Java Bindings for the Berkeley DB"
DESCRIPTION = "These are the Java bindings for the Berkeley DB. They are needed for \
the Java support of db and dbxml. \
 \
These are the development files."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb_java-4_8-devel-4.8.30-48.3.aarch64.rpm"
RPM_HASH = "97ba38837ef3651eab2c21650f9abdcfdaf32434dd34f86b9443eb2d513f6e1b3d13a43d952c01ac497d82ccd962de81d5f9c0501b4b234e5e34b44b4322b505"

RPROVIDES:${PN} += "db-java-devel \
libdb-java-4-8-devel"

RDEPENDS:${PN} += "glibc-devel \
libdb-java-4-8"

inherit rpm
