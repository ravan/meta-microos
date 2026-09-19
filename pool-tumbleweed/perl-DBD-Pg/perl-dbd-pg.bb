SUMMARY = "DBI PostgreSQL interface"
DESCRIPTION = "DBD::Pg is a Perl module that works with the DBI module to provide access \
to PostgreSQL databases."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.21.2"

RPM_NAME = "perl-DBD-Pg-3.21.2-1.1.aarch64.rpm"
RPM_HASH = "c78ab2333b37219c6c1aa18571f301bf3e30934036209171c5b9f10fa2c06ab5d8005f37073f45da047535a787ecf8d6976d51338ff7b004a782fa81f4498cf1"

RPROVIDES:${PN} += "perl-Bundle--DBD--Pg \
perl-DBD--Pg \
perl-DBD--Pg--DefaultValue \
perl-DBD--Pg--db \
perl-DBD--Pg--dr \
perl-DBD--Pg--st \
perl-DBD-Pg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
perl--MODULE-COMPAT-5.44.0 \
perl-DBI \
perl-version"

inherit rpm
