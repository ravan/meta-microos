SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.3.13"

RPM_NAME = "python313-pymssql-2.3.13-1.5.aarch64.rpm"
RPM_HASH = "83413ae762a09b5fab0ad6bdbc078aa341f0c86da95d96573e5ee27aee476885bc67031961a4dd436d2d32f7e13dcfb30e6a790d4dc5dacf62658062e58521ab"

RPROVIDES:${PN} += "python3-pymssql \
python3.13dist-pymssql \
python313-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
