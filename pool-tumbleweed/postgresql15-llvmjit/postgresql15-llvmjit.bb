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

PV = "15.19"

RPM_NAME = "postgresql15-llvmjit-15.19-2.2.aarch64.rpm"
RPM_HASH = "36ef29c01521bab41d6147dda1ef47cf7d41c7a983ec28f632f82882f3eb8d2c74d75f52ff52798a1671caf1f76d2511523dc9e78d4110c8e41dec2b84936c95"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql15-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql15-server"

inherit rpm
