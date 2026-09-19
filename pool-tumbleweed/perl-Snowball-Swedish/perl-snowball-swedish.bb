SUMMARY = "Porters stemming algorithm for swedish"
DESCRIPTION = "Porters stemming algorithm for swedish."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.200.0"

RPM_NAME = "perl-Snowball-Swedish-1.200.0-1.9.noarch.rpm"
RPM_HASH = "d265cc3790fcfac87d085530eda7d155895a240b7d909a1c24e67403a51c2f90bdac54471c8d5c1e82f511b266253621ef6ec42bb9b3add5a89d0f718073f7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--Se \
perl-Snowball-Swedish"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
