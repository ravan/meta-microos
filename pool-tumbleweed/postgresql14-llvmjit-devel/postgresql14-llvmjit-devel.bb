SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql14-server-devel package."
LICENSE = "PostgreSQL"

PV = "14.24"

RPM_NAME = "postgresql14-llvmjit-devel-14.24-2.2.aarch64.rpm"
RPM_HASH = "d2614ee1fb47f74cf591c88f13354d0b89e9bfee50f4ef70069ec6ae7225a4530f3c0aaf040995656af833aca49731a0ee29dc12c775d1d5a7183c2b9c037fd1"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql14-llvmjit-devel"

RDEPENDS:${PN} += "/usr/bin/clang \
/usr/bin/llc \
postgresql-llvmjit-devel-noarch \
postgresql14-llvmjit \
postgresql14-server-devel"

inherit rpm
