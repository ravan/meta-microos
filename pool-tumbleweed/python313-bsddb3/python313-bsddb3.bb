SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python313-bsddb3-6.2.9-4.11.aarch64.rpm"
RPM_HASH = "f2ce63f840dbf1de622b1d93a68f72c81fe7e446a355317ffafcf76c1c013ce52ccc6a12b0f3868389aebce565b12d46f860313687ad2236dc4a4991414e9f80"

RPROVIDES:${PN} += "python3-bsddb3 \
python3.13dist-bsddb3 \
python313-bsddb3 \
python3dist-bsddb3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
python-abi"

inherit rpm
