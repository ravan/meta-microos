SUMMARY = "Acceptance tests for Future::IO implementations"
DESCRIPTION = "This module contains a collection of acceptance tests for implementations \
of Future::IO."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.210.0"

RPM_NAME = "perl-Test-Future-IO-Impl-0.210.0-1.3.noarch.rpm"
RPM_HASH = "097db429f8d183fef58264da02a645c92f92b27a6c65bdc81ebd7d6670581775d6eeeaf0b361f3f7ecc0d583cb430cc44f4f6967c132c60a1ed8a79c0cca57f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Future--IO--Impl \
perl-Test-Future-IO-Impl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test2--V0"

inherit rpm
