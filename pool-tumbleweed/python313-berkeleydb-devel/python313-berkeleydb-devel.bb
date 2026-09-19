SUMMARY = "Development files for python313-berkeleydb"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
berkeleydb.db module. \
 \
This package contains the development files for python313-berkeleydb"
LICENSE = "BSD-3-Clause"

PV = "18.1.15"

RPM_NAME = "python313-berkeleydb-devel-18.1.15-1.8.aarch64.rpm"
RPM_HASH = "c396bf0c8b14149d33fb01c5b20c0029c1c87b8469d9789e4b7d0720d5773320140957ac8a1f035cefbd21ca1c1d70240483260c251832ca95c8612c74f8f377"

RPROVIDES:${PN} += "python3-berkeleydb-devel \
python313-berkeleydb-devel"

RDEPENDS:${PN} += "python313-berkeleydb"

inherit rpm
