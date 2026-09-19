SUMMARY = "Allow transactions to be nested in DBI"
DESCRIPTION = "DBIx::Transaction is a wrapper around DBI that helps you manage your \
database transactions. \
 \
 \
 \
Authors: \
-------- \
    Tyler 'Crackerjack' MacDonald <japh@crackerjack.net>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.100"

RPM_NAME = "perl-DBIx-Transaction-1.100-23.46.aarch64.rpm"
RPM_HASH = "08485bf3a5758d6dcae76c3da27fd12e4afb7c8af38fc1016650748891685a5939bb71d2bb91c4fcb7496dba9133fec9536d4d029e812811c3c7e067a89b369b"

RPROVIDES:${PN} += "perl-DBIx--Transaction \
perl-DBIx--Transaction--db \
perl-DBIx--Transaction--st \
perl-DBIx-Transaction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBI"

inherit rpm
