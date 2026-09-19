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

PV = "14.24"

RPM_NAME = "postgresql14-llvmjit-14.24-2.2.aarch64.rpm"
RPM_HASH = "dce485f8a30bb8711a5de572a4e55da866f4d15baeffc1546c8a71b06dc1dc61658019ee2aa8b07942808391a95e4a870f0cff5eb19413ee2481424ecc5dbc81"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql14-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql14-server"

inherit rpm
