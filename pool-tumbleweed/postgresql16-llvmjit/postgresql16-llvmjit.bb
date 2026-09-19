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

PV = "16.15"

RPM_NAME = "postgresql16-llvmjit-16.15-2.2.aarch64.rpm"
RPM_HASH = "952c70439c49da44dea6b1f9ff850d5b6a2ef36864f68d3a5771e3c4f28dd9cc42905b893d2f06990d433e61744117decdd9d743677f33ef33f0eac07a51b974"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql16-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql16-server"

inherit rpm
