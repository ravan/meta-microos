SUMMARY = "Initiate a persistent database connection"
DESCRIPTION = "This module initiates a persistent database connection. \
 \
The database access uses Perl's DBI. For supported DBI drivers see: \
 \
 http://dbi.perl.org/ \
 \
When loading the DBI module (do not confuse this with the Apache::DBI \
module) it checks if the environment variable 'MOD_PERL' has been set and \
if the module Apache::DBI has been loaded. In this case every connect \
request will be forwarded to the Apache::DBI module. This checks if a \
database handle from a previous connect request is already stored and if \
this handle is still valid using the ping method. If these two conditions \
are fulfilled it just returns the database handle. The parameters defining \
the connection have to be exactly the same, including the connect \
attributes! If there is no appropriate database handle or if the ping \
method fails, a new connection is established and the handle is stored for \
later re-use. There is no need to remove the disconnect statements from \
your code. They won't do anything because the Apache::DBI module overloads \
the disconnect method."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.120.0"

RPM_NAME = "perl-Apache-DBI-1.120.0-1.7.noarch.rpm"
RPM_HASH = "6a8ddf312f4e6340fbb4a04c2dc46e0839831eae9d0511c1bbd0d3eb75c70cce277eae78006c99edf408a3cf080a715b71b33501c17eca9e4499e973da9922e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--AuthDBI \
perl-Apache--DBI \
perl-Apache--DBI--db \
perl-Apache-DBI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBI \
perl-Digest--SHA1"

inherit rpm
