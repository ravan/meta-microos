SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.3.13"

RPM_NAME = "python314-pymssql-2.3.13-1.5.aarch64.rpm"
RPM_HASH = "360902f210a1ef2c96b2da6631f51d37c3fc9f93d79a5ad5c3340f5fe95b6a215d85c65399fe74e739b26d51d812abc865e752f38e87ec5b4eb1181c71e41667"

RPROVIDES:${PN} += "python3.14dist-pymssql \
python314-pymssql \
python3dist-pymssql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsybdb.so.5 \
python-abi"

inherit rpm
