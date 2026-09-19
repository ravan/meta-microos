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

PV = "17.11"

RPM_NAME = "postgresql17-llvmjit-17.11-2.2.aarch64.rpm"
RPM_HASH = "6325a277eb33f041e73dec3084477e14855d3d47172d183bc2c331fb0797ad18746b31504153f38f9ba1334c2913815e33363e4a20107bf40e8b053e9a1e193c"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql17-llvmjit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
postgresql-llvmjit-noarch \
postgresql17-server"

inherit rpm
