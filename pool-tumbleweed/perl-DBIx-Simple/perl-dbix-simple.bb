SUMMARY = "Very complete easy-to-use OO interface to DBI"
DESCRIPTION = "DBIx::Simple provides a simplified interface to DBI, Perl's powerful \
database module. \
 \
This module is aimed at rapid development and easy maintenance. Query \
preparation and execution are combined in a single method, the result \
object (which is a wrapper around the statement handle) provides easy \
row-by-row and slurping methods. \
 \
The 'query' method returns either a result object, or a dummy object. The \
dummy object returns undef (or an empty list) for all methods and when used \
in boolean context, is false. The dummy object lets you postpone (or skip) \
error checking, but it also makes immediate error checking simply \
'$db->query(...) or die $db->error'."
LICENSE = "MIT"

PV = "1.37"

RPM_NAME = "perl-DBIx-Simple-1.37-1.36.noarch.rpm"
RPM_HASH = "cbacbb21e8e3551cb32842e8c4bf1514918f1724a73aa86a399036824d6cdb506cb4b78cb67b065fac42e7821c23e1f3fbaf1aa5c9c7716ad0d667e56df45b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Simple \
perl-DBIx--Simple--DeadObject \
perl-DBIx--Simple--Dummy \
perl-DBIx--Simple--Result \
perl-DBIx--Simple--Result--RowObject \
perl-DBIx--Simple--Statement \
perl-DBIx-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBI"

inherit rpm
