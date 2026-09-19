SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python314-bsddb3-6.2.9-4.11.aarch64.rpm"
RPM_HASH = "82cf241139b8926446babe55be53daf477a1343826db2aad442042d64f5e627f0e8be7a8f466fe9e7df5bb32a931588cd9a66c848a8cb345d40f62cd007e1f65"

RPROVIDES:${PN} += "python3.14dist-bsddb3 \
python314-bsddb3 \
python3dist-bsddb3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
python-abi"

inherit rpm
