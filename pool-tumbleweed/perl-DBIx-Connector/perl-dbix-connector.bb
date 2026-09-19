SUMMARY = "Fast, safe DBI connection and transaction management"
DESCRIPTION = "DBIx::Connector provides a simple interface for fast and safe DBI \
connection and transaction management. Connecting to a database can be \
expensive; you don't want your application to re-connect every time you \
need to run a query. The efficient thing to do is to hang on to a database \
handle to maintain a connection to the database in order to minimize that \
overhead. DBIx::Connector lets you do that without having to worry about \
dropped or corrupted connections. \
 \
You might be familiar with Apache::DBI and with the DBI's \
'connect_cached()' constructor. DBIx::Connector serves a similar need, but \
does a much better job. How is it different? I'm glad you asked!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.600.0"

RPM_NAME = "perl-DBIx-Connector-0.600.0-1.10.noarch.rpm"
RPM_HASH = "2cccc29eb57664cfaac1f3436aa68b312169ce4431a3d7b37ce156e3ace58b9b2364308f3153ce22ee4a718924d6099c62b072d10f7d4ec80ca0905da33606da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Connector \
perl-DBIx--Connector--Driver \
perl-DBIx--Connector--Driver--Firebird \
perl-DBIx--Connector--Driver--MSSQL \
perl-DBIx--Connector--Driver--MariaDB \
perl-DBIx--Connector--Driver--Oracle \
perl-DBIx--Connector--Driver--Pg \
perl-DBIx--Connector--Driver--SQLite \
perl-DBIx--Connector--Driver--mysql \
perl-DBIx--Connector--RollbackError \
perl-DBIx--Connector--SvpRollbackError \
perl-DBIx--Connector--TxnRollbackError \
perl-DBIx-Connector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBI"

inherit rpm
