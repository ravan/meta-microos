SUMMARY = "Dump data and repopulate a database using rules"
DESCRIPTION = "Dump fixtures from source database to filesystem then import to another \
database (with same schema) at any time. Use as a constant dataset for \
running tests against or for populating development databases when \
impractical to use production clones. Describe fixture set using relations \
and conditions based on your DBIx::Class schema."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001039"

RPM_NAME = "perl-DBIx-Class-Fixtures-1.001039-1.33.noarch.rpm"
RPM_HASH = "b28025a7de5c3c5d84a6d91c3601517edba4dc7f53263a99b751c9e7601574c5bf61fedf9510a25245663fd553d367e3733787a3e4d169957ba48ce8d6229dc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--Fixtures \
perl-DBIx--Class--Fixtures--DBI \
perl-DBIx--Class--Fixtures--DBI--Pg \
perl-DBIx--Class--Fixtures--DBI--mysql \
perl-DBIx--Class--Fixtures--External--File \
perl-DBIx--Class--Fixtures--Schema \
perl-DBIx-Class-Fixtures"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Grouped \
perl-Config--Any \
perl-DBIx--Class \
perl-DBIx--Class--Schema--Loader \
perl-Data--Dump--Streamer \
perl-Data--Visitor \
perl-DateTime \
perl-DateTime--Format--MySQL \
perl-DateTime--Format--Pg \
perl-DateTime--Format--SQLite \
perl-File--Copy--Recursive \
perl-File--Temp \
perl-Hash--Merge \
perl-IO--All \
perl-JSON--Syck \
perl-Path--Class \
perl-Scalar--Util"

inherit rpm
