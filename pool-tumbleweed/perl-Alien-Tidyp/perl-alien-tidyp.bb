SUMMARY = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
DESCRIPTION = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.4.7"

RPM_NAME = "perl-Alien-Tidyp-1.4.7-8.44.noarch.rpm"
RPM_HASH = "c9ea3d8cc2ca3ad7d60a0d28cc338428a71c4964884b2221607feda5f263a63100d32a924e648946b7b8f0799c91ed797bd011560870256b1e9387539b28e438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Alien--Tidyp \
perl-Alien--Tidyp--ConfigData \
perl-Alien-Tidyp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir"

inherit rpm
