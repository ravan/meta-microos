SUMMARY = "Perl module to generate random data"
DESCRIPTION = "A module used to generate random data. Useful mostly for test programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.150.0"

RPM_NAME = "perl-Data-Random-0.150.0-1.3.noarch.rpm"
RPM_HASH = "1303a59fac997f11ab7b79795549cfb638f9f126a84ab43f7f0754b955e132419e8e3e5b685a257f56efec74d1867373a30a3f64907948ce5244c66d4e720442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Random \
perl-Data--Random--WordList \
perl-Data-Random"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Time--Piece"

inherit rpm
