SUMMARY = "Development files for python314-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python314-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python314-bsddb3-devel-6.2.9-4.11.aarch64.rpm"
RPM_HASH = "bce7962bcccfdadcd0b7df1fda86601779370cd10de6cf75d18fc32923091674442e6d19055a45413f9a5787bab9f5eb8b01979dea1e6418503bf6f16be9c1e9"

RPROVIDES:${PN} += "python314-bsddb3-devel"

RDEPENDS:${PN} += "python314-bsddb3"

inherit rpm
