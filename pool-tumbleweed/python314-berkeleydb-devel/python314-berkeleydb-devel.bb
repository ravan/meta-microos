SUMMARY = "Development files for python314-berkeleydb"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
berkeleydb.db module. \
 \
This package contains the development files for python314-berkeleydb"
LICENSE = "BSD-3-Clause"

PV = "18.1.15"

RPM_NAME = "python314-berkeleydb-devel-18.1.15-1.8.aarch64.rpm"
RPM_HASH = "acf11c5b4178fa2505fb3f2520e95da8243ba9cbe9fa01ed62c093afca92e796eb7402a4d09638d52347f5c3237a2f3cbdf1d8807d65e019a1a289973ae9606f"

RPROVIDES:${PN} += "python314-berkeleydb-devel"

RDEPENDS:${PN} += "python314-berkeleydb"

inherit rpm
