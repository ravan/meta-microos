SUMMARY = "DBI driver for CSV files"
DESCRIPTION = "The DBD::CSV module is yet another driver for the DBI (Database independent \
interface for Perl). This one is based on the SQL 'engine' SQL::Statement \
and the abstract DBI driver DBD::File and implements access to so-called \
CSV files (Comma Separated Values). Such files are often used for exporting \
MS Access and MS Excel data. \
 \
See DBI for details on DBI, SQL::Statement for details on SQL::Statement \
and DBD::File for details on the base class DBD::File."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.640.0"

RPM_NAME = "perl-DBD-CSV-0.640.0-1.1.noarch.rpm"
RPM_HASH = "1a19e30cc5d1af802e24c737dc8f7007b9b6daf0a7d61796b5e8f21de79188a15c6490e0a2aad275732c1b86339f6f0390b07a815bb5defdf2c155cc371e989e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBD--CSV \
perl-DBD-CSV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBD--File \
perl-DBI \
perl-SQL--Statement \
perl-Test--More \
perl-Text--CSV-XS"

inherit rpm
