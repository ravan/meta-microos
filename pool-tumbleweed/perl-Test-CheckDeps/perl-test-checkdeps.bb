SUMMARY = "Check for presence of dependencies"
DESCRIPTION = "This module adds a test that assures all dependencies have been installed \
properly. If requested, it can bail out all testing on error."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.010"

RPM_NAME = "perl-Test-CheckDeps-0.010-3.42.noarch.rpm"
RPM_HASH = "cb7f0c40c393f7b2e432ddf718eca682ce2232b41c0deacf67251e4c06fe543fb5cb47694d0abb715a115bef3f2fda8f8447031b1b665003c4639b4417545c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckDeps \
perl-Test-CheckDeps"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta \
perl-CPAN--Meta--Check"

inherit rpm
