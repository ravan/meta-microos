SUMMARY = "Information about the currently running perl"
DESCRIPTION = "This module provides methods for obtaining information about the currently \
running perl interpreter. It originally began life as code in the \
'Module::Build' project, but has been externalized here for general use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.30.0"

RPM_NAME = "perl-Probe-Perl-0.30.0-1.5.noarch.rpm"
RPM_HASH = "3a30627879505864f3a4ed377437309a01b3c268f074c01a5f8d4930f1da2359fdc39987cdabe49c7301fce343084b81fd1cc6710065ec77ae946072bb510812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Probe--Perl \
perl-Probe-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
