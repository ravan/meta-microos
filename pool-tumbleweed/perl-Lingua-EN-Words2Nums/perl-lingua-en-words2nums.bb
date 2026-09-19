SUMMARY = "convert English text to numbers"
DESCRIPTION = "This module converts English text into numbers. It supports both ordinal \
and cardinal numbers, negative numbers, and very large numbers. \
 \
The main subroutine, which is exported by default, is words2nums(). This \
subroutine, when fed a string, will attempt to convert it into a number. If \
it succeeds, the number will be returned. If it fails, it returns undef."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.18"

RPM_NAME = "perl-Lingua-EN-Words2Nums-0.18-1.42.noarch.rpm"
RPM_HASH = "0bc099505d1d479e57b71d94c84c6bd7209e99483dde5bbb6f29168c3394d01ed2dc629e66a9c9a2ff8930dfe411b4b09f51340243499dd966de843adec1cf7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Words2Nums \
perl-Lingua-EN-Words2Nums"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
