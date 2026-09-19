SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql15-server-devel package."
LICENSE = "PostgreSQL"

PV = "15.19"

RPM_NAME = "postgresql15-llvmjit-devel-15.19-2.2.aarch64.rpm"
RPM_HASH = "ff595a5c5b3f7c9a89b71e7e68686eb7b4d73a9b0adc11dff00d86e77326a51a58ea851ab91a13d7a4cdc97ec994395414b182d60c2b33fcebd104771d905788"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql15-llvmjit-devel"

RDEPENDS:${PN} += "/usr/bin/clang \
/usr/bin/llc \
postgresql-llvmjit-devel-noarch \
postgresql15-llvmjit \
postgresql15-server-devel"

inherit rpm
