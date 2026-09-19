SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql16-server-devel package."
LICENSE = "PostgreSQL"

PV = "16.15"

RPM_NAME = "postgresql16-llvmjit-devel-16.15-2.2.aarch64.rpm"
RPM_HASH = "327e49085a85faea069c2dbcc84d2db0bd75c44fc9e38795d53f044ed3f8492c00b3df86146b510d64081fc20b89542a3737c7ce32f8355e1232859e884e6b64"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql16-llvmjit-devel"

RDEPENDS:${PN} += "/usr/bin/clang \
/usr/bin/llc \
postgresql-llvmjit-devel-noarch \
postgresql16-llvmjit \
postgresql16-server-devel"

inherit rpm
