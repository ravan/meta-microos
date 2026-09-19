SUMMARY = "Just-in-time compilation support for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-llvmjit-18.6-1.2.aarch64.rpm"
RPM_HASH = "43e8fa55f804ecdc76c256ddbd263c103277f37c32f728229b06a1b84a012825e506266224b25c8070eb1508279eaa8ddda45467bdc1c3fcbb17997307d313ea"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql18-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql18-server"

inherit rpm
