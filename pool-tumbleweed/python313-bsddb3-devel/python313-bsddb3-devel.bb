SUMMARY = "Development files for python313-bsddb3"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module. \
 \
This package contains the development files for python313-bsddb3"
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python313-bsddb3-devel-6.2.9-4.11.aarch64.rpm"
RPM_HASH = "482586121eb4006219eec82ac4d4c9180da6f21b100c13e9d81a30c9364b551d97d90b10a967d4f73f0afce4678b4fc7acb203e0f440dc8b66c103b4129ae080"

RPROVIDES:${PN} += "python3-bsddb3-devel \
python313-bsddb3-devel"

RDEPENDS:${PN} += "python313-bsddb3"

inherit rpm
