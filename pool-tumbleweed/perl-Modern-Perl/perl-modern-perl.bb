SUMMARY = "Enable all of the features of Modern Perl with one import"
DESCRIPTION = "enable all of the features of Modern Perl with one import"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20250607"

RPM_NAME = "perl-Modern-Perl-1.20250607-1.7.noarch.rpm"
RPM_HASH = "fff32cf99141a66717c5b010a66ecc9a778f1beda9992419060f425056f352d99e776c2fc0038cdc461eb55e7f796f7fc46a131c467ae8c33bd105d45769c101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Modern--Perl \
perl-Modern-Perl \
perl-odern--Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-feature \
perl-mro"

inherit rpm
