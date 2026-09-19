SUMMARY = "Test code which forks"
DESCRIPTION = "*THIS IS ALPHA CODE!* The implementation is unreliable and the interface is \
subject to change. \
 \
Because each test has a number associated with it, testing code which forks \
is problematic. Coordinating the test number amongst the parent and child \
processes is complicated. Test::Fork provides a function to smooth over the \
complications."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.20.0"

RPM_NAME = "perl-Test-Fork-0.20.0-1.5.noarch.rpm"
RPM_HASH = "0abae2cab35881e811ad5505d83f24daf5eb0b2d2d00dd3276dcb293a940048ef495d71f2a2cf75f29ef4d4cadd7cd2dbb08e2ac29be03a4fcffa067b43ca0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Fork \
perl-Test-Fork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
