SUMMARY = "Helper for Dealing with Pg During Tests"
DESCRIPTION = "Test::Mojo::Pg makes the creation and removal of a transitory database \
during testing when using Mojo::Pg. This is useful when every test should \
work from a 'clean' database."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.33"

RPM_NAME = "perl-Test-Mojo-Pg-0.33-1.38.noarch.rpm"
RPM_HASH = "849aeb8af23e51834a928204c8be69af089ad952c840babbcf07015df245ad6fafc7228da9583080a4200250f8b652ef1a553b59e2b34f8bc2c45eefa26a21c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mojo--Pg \
perl-Test-Mojo-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mojo--Base \
perl-Mojo--Pg"

inherit rpm
