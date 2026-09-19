SUMMARY = "Perl extension for rounding numbers"
DESCRIPTION = "*Math::Round* supplies functions that will round numbers in different ways. \
The functions *round* and *nearest* are exported by default; others are \
available as described below. 'use ... qw(:all)' exports all functions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.80.0"

RPM_NAME = "perl-Math-Round-0.80.0-2.12.noarch.rpm"
RPM_HASH = "211ba9e6de7c18d63886e02472341f6923db8e8e310856e70069392c7ee1e69e1940e73f571e91d86bcfecba43ac2d353a14a4e683ddebf411a73afd34d339d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Round \
perl-Math-Round"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
