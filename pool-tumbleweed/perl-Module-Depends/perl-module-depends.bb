SUMMARY = "Identify the Dependencies of a Distribution"
DESCRIPTION = "Module::Depends extracts module dependencies from an unpacked distribution \
tree. \
 \
Module::Depends only evaluates the META.yml shipped with a distribution. \
This won't be effective until all distributions ship META.yml files, so we \
suggest you take your life in your hands and look at \
Module::Depends::Intrusive."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.16"

RPM_NAME = "perl-Module-Depends-0.16-7.12.noarch.rpm"
RPM_HASH = "4237e10697e5c916037b3ddbe4917674e574c6c3986ab0039cc4e2863c0f67ad74a75506e13b33bd5ab89126c2a7351f39ff74a57cec42aa0cee3ec8694dbaf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Depends \
perl-Module--Depends--Intrusive \
perl-Module--Depends--Intrusive--Fake--Module--Build \
perl-Module-Depends"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Chained \
perl-Parse--CPAN--Meta"

inherit rpm
