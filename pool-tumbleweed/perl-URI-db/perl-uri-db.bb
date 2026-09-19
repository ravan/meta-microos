SUMMARY = "Database URIs"
DESCRIPTION = "Database URIs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.230.0"

RPM_NAME = "perl-URI-db-0.230.0-1.10.noarch.rpm"
RPM_HASH = "4b1e323a40180ea08aac03c5e61688722a4dae71f5761e18fabb96a770a3634223a55039c85097ef6955eac17e540a958ce0dc0823329cb83e082bf97ae1adf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--cassandra \
perl-URI--clickhouse \
perl-URI--cockroach \
perl-URI--cockroachdb \
perl-URI--couch \
perl-URI--couchdb \
perl-URI--cubrid \
perl-URI--db \
perl-URI--db2 \
perl-URI--derby \
perl-URI--exasol \
perl-URI--firebird \
perl-URI--hive \
perl-URI--impala \
perl-URI--informix \
perl-URI--ingres \
perl-URI--interbase \
perl-URI--ldapdb \
perl-URI--maria \
perl-URI--mariadb \
perl-URI--max \
perl-URI--maxdb \
perl-URI--monet \
perl-URI--monetdb \
perl-URI--mongo \
perl-URI--mongodb \
perl-URI--mssql \
perl-URI--mysql \
perl-URI--oracle \
perl-URI--pg \
perl-URI--pgsql \
perl-URI--pgxc \
perl-URI--postgres \
perl-URI--postgresql \
perl-URI--postgresxc \
perl-URI--redshift \
perl-URI--snowflake \
perl-URI--sqlite \
perl-URI--sqlite3 \
perl-URI--sqlserver \
perl-URI--sybase \
perl-URI--teradata \
perl-URI--unify \
perl-URI--vertica \
perl-URI--yugabyte \
perl-URI--yugabytedb \
perl-URI-db"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI \
perl-URI--Nested"

inherit rpm
