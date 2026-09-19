SUMMARY = "PostgreSQL development files for extensions with LLVM support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package pulls in the right versions of llvm and clang to compile \
PostgreSQL extensions that support just-in-time compilation with LLVM, \
if llvm is supported. Otherwise it will just pull the \
postgresql17-server-devel package."
LICENSE = "PostgreSQL"

PV = "17.11"

RPM_NAME = "postgresql17-llvmjit-devel-17.11-2.2.aarch64.rpm"
RPM_HASH = "c5f2d7c3bbe0368bfa349b5f246c576f00dcebae48248d78ab306234e2a57b799539caed6b424a045b953e6989de5a050239a96dbd28bd5cea6cb0b35f7e5644"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-implementation \
postgresql17-llvmjit-devel"

RDEPENDS:${PN} += "/usr/bin/clang \
/usr/bin/llc \
postgresql-llvmjit-devel-noarch \
postgresql17-llvmjit \
postgresql17-server-devel"

inherit rpm
