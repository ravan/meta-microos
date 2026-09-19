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

RPM_NAME = "python313-berkeleydb-18.1.15-1.8.aarch64.rpm"
RPM_HASH = "f2168b2932fc489102086442da658c32735d8ed514a6104668f5763942cd12df9a651aeb935bb647f0a382dfe85c88fa7ef90553f6cebb17e9d048193d2c2bcf"

RPROVIDES:${PN} += "python3-berkeleydb \
python3.13dist-berkeleydb \
python313-berkeleydb \
python3dist-berkeleydb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
python-abi"

inherit rpm
