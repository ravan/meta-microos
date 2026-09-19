SUMMARY = "Handy utf8 tests"
DESCRIPTION = "This module is a collection of tests useful for dealing with utf8 strings \
in Perl. \
 \
This module has two types of tests: The validity tests check if a string is \
valid and not corrupt, whereas the characteristics tests will check that \
string has a given set of characteristics."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.30.0"

RPM_NAME = "perl-Test-utf8-1.30.0-1.10.noarch.rpm"
RPM_HASH = "692364ba223ae33260f3521f793e278ee3061a6ef8b9bee52358308b6ba03ec7d4c73a6b9b4af4908f0e7cba9d5c1b8bab5823a39c3b8ce5c6ca6e518c9f4438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--utf8 \
perl-Test-utf8"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
