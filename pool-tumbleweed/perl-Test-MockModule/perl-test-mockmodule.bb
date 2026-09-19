SUMMARY = "Override subroutines in a module for unit testing"
DESCRIPTION = "'Test::MockModule' lets you temporarily redefine subroutines in other \
packages for the purposes of unit testing. \
 \
A 'Test::MockModule' object is set up to mock subroutines for a given \
module. The object remembers the original subroutine so it can be easily \
restored. This happens automatically when all MockModule objects for the \
given module go out of scope, or when you 'unmock()' the subroutine."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.185.3"

RPM_NAME = "perl-Test-MockModule-0.185.3-1.3.noarch.rpm"
RPM_HASH = "9a6bca6e0f3f2d1cedc2a341f5faaef97fbd4e51339a935648ea8f9e23bc0d00288ea1753a65f01a0f48cd62392ee86db73020adec54b1337dfd2b2c95f00811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockModule \
perl-Test-MockModule"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-SUPER"

inherit rpm
