SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql18-server-devel package."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-llvmjit-devel-18.6-1.2.aarch64.rpm"
RPM_HASH = "f3e9c8130c3b06716947c87e6558073a8a97478ffa8aa3cf71a4956945ae348a2b2b4514431bfb61da363c1d00bd49e7b652d373e308b95de62306d8efda88e0"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql18-llvmjit-devel"

RDEPENDS:${PN} += "/usr/bin/clang \
/usr/bin/llc \
postgresql-llvmjit-devel-noarch \
postgresql18-llvmjit \
postgresql18-server-devel"

inherit rpm
