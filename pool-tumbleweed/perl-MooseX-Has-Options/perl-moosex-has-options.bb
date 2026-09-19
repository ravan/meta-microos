SUMMARY = "Succinct options for Moose"
DESCRIPTION = "This module provides a succinct syntax for declaring options for the Moose \
manpage attributes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-MooseX-Has-Options-0.003-5.41.noarch.rpm"
RPM_HASH = "9740e8e262cfae599757c648aff59362f144d43c5a7453f2564934762375dc8521791aab750fdc5f422bd6cefcd38c54e824b5cc69fe65843ad9a6359fa1fa80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Has--Options \
perl-MooseX--Has--Options--Handler--Accessors \
perl-MooseX--Has--Options--Handler--NativeTypes \
perl-MooseX--Has--Options--Handler--NoInit \
perl-MooseX-Has-Options"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load \
perl-List--MoreUtils \
perl-Package--Stash \
perl-String--RewritePrefix"

inherit rpm
