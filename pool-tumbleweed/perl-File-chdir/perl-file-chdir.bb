SUMMARY = "More sensible way to change directories"
DESCRIPTION = "Perl's 'chdir()' has the unfortunate problem of being very, very, very \
global. If any part of your program calls 'chdir()' or if any library you \
use calls 'chdir()', it changes the current working directory for the \
*whole* program. \
 \
This sucks. \
 \
File::chdir gives you an alternative, '$CWD' and '@CWD'. These two \
variables combine all the power of 'chdir()', File::Spec and Cwd."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.1011"

RPM_NAME = "perl-File-chdir-0.1011-1.26.noarch.rpm"
RPM_HASH = "1dcc812feb7e98aaaa3205d21a4458fb0339414898e682f8f9b5460730da6c71ed427f2eab2b228c03e2de73003d5f90cefacb47ff06a48e9bf7d927ad24a0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--chdir \
perl-File--chdir--ARRAY \
perl-File--chdir--SCALAR \
perl-File-chdir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cwd \
perl-File--Spec--Functions"

inherit rpm
