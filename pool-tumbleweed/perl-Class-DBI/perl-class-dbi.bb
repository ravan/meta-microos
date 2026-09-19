SUMMARY = "Simple Database Abstraction"
DESCRIPTION = "Simple Database Abstraction"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "3.0.17"

RPM_NAME = "perl-Class-DBI-3.0.17-5.43.noarch.rpm"
RPM_HASH = "f27d78e682ea0a4ced795d0288a036f6ac1841161255163efa7fee85718c90f22ab9deb1968ff0beac94da8e27af28a47ad36319e827c46be81eeb4e0d88e935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--DBI \
perl-Class--DBI------Base \
perl-Class--DBI--Attribute \
perl-Class--DBI--Cascade--Delete \
perl-Class--DBI--Cascade--Fail \
perl-Class--DBI--Cascade--None \
perl-Class--DBI--Column \
perl-Class--DBI--ColumnGrouper \
perl-Class--DBI--Iterator \
perl-Class--DBI--Query \
perl-Class--DBI--Query--Base \
perl-Class--DBI--Relationship \
perl-Class--DBI--Relationship--HasA \
perl-Class--DBI--Relationship--HasMany \
perl-Class--DBI--Relationship--MightHave \
perl-Class--DBI--SQL--Transformer \
perl-Class--DBI--Search--Basic \
perl-Class--DBI--Test--SQLite \
perl-Class-DBI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-Class--Trigger \
perl-Clone \
perl-Ima--DBI \
perl-UNIVERSAL--moniker \
perl-version"

inherit rpm
