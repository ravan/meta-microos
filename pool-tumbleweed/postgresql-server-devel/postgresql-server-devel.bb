SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql18-devel package."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-server-devel-18-3.4.noarch.rpm"
RPM_HASH = "d71010a4dafe26d20241e2abcad50afde09f7760abd9c427087d565e7a2ba144751d1cda4d01633f8f12ad0cb12538951f6328fc9256e1d7d94e74025b0613a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-noarch \
rpm-macro-make-pgxs \
rpm-macro-make-pgxs-install \
rpm-macro-pg-config-bindir \
rpm-macro-pg-config-cc \
rpm-macro-pg-config-cflags \
rpm-macro-pg-config-cflags-sl \
rpm-macro-pg-config-configure \
rpm-macro-pg-config-cppflags \
rpm-macro-pg-config-docdir \
rpm-macro-pg-config-htmldir \
rpm-macro-pg-config-includedir \
rpm-macro-pg-config-includedir-server \
rpm-macro-pg-config-ldflags \
rpm-macro-pg-config-ldflags-ex \
rpm-macro-pg-config-ldflags-sl \
rpm-macro-pg-config-libdir \
rpm-macro-pg-config-libs \
rpm-macro-pg-config-localedir \
rpm-macro-pg-config-mandir \
rpm-macro-pg-config-pgxs \
rpm-macro-pg-config-pkgincludedir \
rpm-macro-pg-config-pkglibdir \
rpm-macro-pg-config-sharedir \
rpm-macro-pg-config-sysconfdir \
rpm-macro-pg-obsolete-llvm-subpackage \
rpm-macro-pg-server-requires \
rpm-macro-pg-version-from-name \
rpm-macro-postgresql-has-llvm"

RDEPENDS:${PN} += "postgresql \
postgresql-noarch \
postgresql-server-devel-implementation"

inherit rpm
