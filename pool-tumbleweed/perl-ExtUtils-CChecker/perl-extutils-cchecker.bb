SUMMARY = "Configure-time utilities for using C headers,"
DESCRIPTION = "Often Perl modules are written to wrap functionality found in existing C \
headers, libraries, or to use OS-specific features. It is useful in the \
_Build.PL_ or _Makefile.PL_ file to check for the existance of these \
requirements before attempting to actually build the module. \
 \
Objects in this class provide an extension around ExtUtils::CBuilder to \
simplify the creation of a _.c_ file, compiling, linking and running it, to \
test if a certain feature is present. \
 \
It may also be necessary to search for the correct library to link against, \
or for the right include directories to find header files in. This class \
also provides assistance here."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.120.0"

RPM_NAME = "perl-ExtUtils-CChecker-0.120.0-1.12.noarch.rpm"
RPM_HASH = "e515c512990b689eb63dfbf5dcad8f24f481c0cdaa7a9f620ff9f75db92f5743a32995029979ccfd805848c66618badcb1cac2b1dcbb4fdedb607b2603920fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--CChecker \
perl-ExtUtils-CChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--CBuilder"

inherit rpm
