SUMMARY = "Distributed relational database built on SQLite"
DESCRIPTION = "rqlite is a relational database which combines SQLite's simplicity with the \
power of a robust, fault-tolerant, distributed system. It's designed for easy \
deployment and lightweight operation, offering a developer-friendly and \
operator-centric solution for multiple platforms."
LICENSE = "MIT"

PV = "10.3.1"

RPM_NAME = "rqlite-10.3.1-1.1.aarch64.rpm"
RPM_HASH = "15a1cd70248b9186aa30e69d827f6763b1d574a605cb600c4cff821772a4034628f50dea9d4c16525aad0184a33b972a7591b24ae3db1ed826bb158083f003eb"

RPROVIDES:${PN} += "rqlite"

RDEPENDS:${PN} += "libc.so.6 \
libsqlite3.so.0"

inherit rpm
