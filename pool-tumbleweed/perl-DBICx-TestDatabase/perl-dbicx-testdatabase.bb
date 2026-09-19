SUMMARY = "Create a Temporary Database From a Dbix::Class::Schema"
DESCRIPTION = "This module creates a temporary SQLite database, deploys your DBIC schema, \
and then connects to it. This lets you easily test your DBIC schema. Since \
you have a fresh database for every test, you don't have to worry about \
cleaning up after your tests, ordering of tests affecting failure, etc."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-DBICx-TestDatabase-0.05-2.35.noarch.rpm"
RPM_HASH = "b5f011ce1ca7dddf64845cc435145ae03834ab86df398ff60913a9e3c840b30cc0cea35197054809415ccff9c6d48d5112cf920a5b3decd81c5f6f81ee06bcee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBICx--TestDatabase \
perl-DBICx--TestDatabase--Subclass \
perl-DBICx-TestDatabase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBD--SQLite \
perl-SQL--Translator"

inherit rpm
