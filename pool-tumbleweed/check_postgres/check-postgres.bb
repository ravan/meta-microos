SUMMARY = "Postgres monitoring script"
DESCRIPTION = "check_postgres.pl is a Perl script that runs many different tests against one \
or more Postgres databases. It uses the psql program to gather the information, \
and outputs the results in one of three formats: Nagios, MRTG, or simple."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "check_postgres-2.26.0-1.18.noarch.rpm"
RPM_HASH = "fda197e6cb207a14931224b057811da95c3d4c90ab3b93a8ee39ee1dc6b4dce44e12f7b9eda81c7bbd29146d86fba58f639ddb9ef3a3c80f8940d61f87ea4000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "check-postgres"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Cwd \
perl-Data--Dumper \
perl-File--Basename \
perl-File--Temp \
perl-Getopt--Long \
perl-Time--HiRes \
postgresql"

inherit rpm
