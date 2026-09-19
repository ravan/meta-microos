SUMMARY = "Python bindings for Oracle Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
berkeleydb.db module. The database objects can use various access methods: \
btree, hash, recno, queue and heap.  Complete support of Oracle Berkeley DB \
distributed transactions. Complete support for Oracle Berkeley DB Replication \
Manager. Complete support for Oracle Berkeley DB Base Replication."
LICENSE = "BSD-3-Clause"

PV = "18.1.15"

RPM_NAME = "python314-berkeleydb-18.1.15-1.8.aarch64.rpm"
RPM_HASH = "526808c13fe3c737ab28754228e2a7b450d4d0ddd9cf4b3a7492afdcc01ff459afd985345739138ed4edf66cf81d0471e840e0a7ebbb1866df9cc530bfd3e25b"

RPROVIDES:${PN} += "python3.14dist-berkeleydb \
python314-berkeleydb \
python3dist-berkeleydb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
python-abi"

inherit rpm
