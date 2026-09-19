SUMMARY = "Helper package to pull all dependencies to build with llvm support"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package will pull all the dependencies to build extensions with llvm \
support if the base distro has llvm enabled. \
 \
Otherwise it will just pull the postgresqlXY-server-devel package"
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-llvmjit-devel-18-3.4.noarch.rpm"
RPM_HASH = "5d14218ccbb2fc2bf032c957b1fb7b2cc0fb884bfe3927669d388e35d44f4e226d7daab386e562d7f66fa552ef318d39bfecb19af99bf4ab239d74a992a1c6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-llvmjit-devel \
postgresql-llvmjit-devel-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-llvmjit-devel-implementation \
postgresql-noarch \
postgresql-server-devel-noarch"

inherit rpm
