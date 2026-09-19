SUMMARY = "Perl extension to test methods for warnings"
DESCRIPTION = "A good style of Perl programming calls for a lot of diverse regression \
tests. \
 \
This module provides a few convenience methods for testing warning \
based-code. \
 \
If you are not already familiar with the Test::More manpage now would be \
the time to go take a look."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.370.0"

RPM_NAME = "perl-Test-Warn-0.370.0-1.7.noarch.rpm"
RPM_HASH = "2a93b65fbace24967ae721093ab6f1c0a85c4666b2fadb48932aced68101451e5c4225937ca2fa81bfc8531e6715d6f77c5d859ed76cae2f4767b0d0c4702638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Warn \
perl-Test-Warn"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-Sub--Uplevel"

inherit rpm
