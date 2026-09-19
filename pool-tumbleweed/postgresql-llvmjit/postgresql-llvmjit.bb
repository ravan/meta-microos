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

PV = "18"

RPM_NAME = "postgresql-llvmjit-18-3.4.noarch.rpm"
RPM_HASH = "facce6fa18b7f7df46b5444fdc0270cc5b5cdd2928ef5c0a8f31a6f037788e1fbba5dc0daac6cf27447bb84d41ac148e08cc65103eb8450667a28bb00412ea3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit \
postgresql-llvmjit-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-llvmjit-implementation \
postgresql-noarch"

inherit rpm
