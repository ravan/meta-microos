SUMMARY = "Perl French Stemming"
DESCRIPTION = "This module use the a modified version of the Porter Stemming Algorithm to \
return a stemmed words."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Lingua-Stem-Fr-0.02-9.40.noarch.rpm"
RPM_HASH = "fd1a7e6942cbd89285d4b2f5c295e0d4ca1b4bc14a8c2ecd14234778fcdab809bb18b8c50257ce5074264bcf1dab18b763a7d9f97268b6a23f349f9818d1ddf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Fr \
perl-Lingua-Stem-Fr"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
