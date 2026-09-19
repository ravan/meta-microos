SUMMARY = "Extracts POD documentation and shows usage information"
DESCRIPTION = "*pod2usage* will print a usage message for the invoking script (using its \
embedded pod documentation) and then exit the script with the desired exit \
status. The usage message printed may have any one of three levels of \
'verboseness': If the verbose level is 0, then only a synopsis is printed. \
If the verbose level is 1, then the synopsis is printed along with a \
description (if present) of the command line options and arguments. If the \
verbose level is 2, then the entire manual page is printed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.05"

RPM_NAME = "perl-Pod-Usage-2.05-1.7.noarch.rpm"
RPM_HASH = "23687ea03f9f9be2d1767c1a20aed9eb06e682366c4078d47c904dfeeb16640564deb1cf040627b40e9858ae6beb61c935f6fbfe5aaade2b10815f8a05c8247e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Usage \
perl-Pod-Usage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Pod--Perldoc \
perl-Pod--Simple \
perl-Pod--Text"

inherit rpm
