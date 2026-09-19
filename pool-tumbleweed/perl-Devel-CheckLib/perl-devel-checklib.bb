SUMMARY = "Check that a library is available"
DESCRIPTION = "Devel::CheckLib is a perl module that checks whether a particular C library \
and its headers are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.160.0"

RPM_NAME = "perl-Devel-CheckLib-1.160.0-1.7.aarch64.rpm"
RPM_HASH = "d5c69dd25bd30538246fe0816f5f2ad258dc7cb3b88264b11df1463210770b48882651b90ae245cababf4d66440f3b8fc6ce8f0ede0bc870b520d07b7a671c8f"

RPROVIDES:${PN} += "perl-Devel--CheckLib \
perl-Devel-CheckLib"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
