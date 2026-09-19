SUMMARY = "Porter's stemming algorithm for Italian"
DESCRIPTION = "This module applies the Porter Stemming Algorithm to its parameters, \
returning the stemmed words. \
 \
The algorithm is implemented exactly (I hope :-) as described in: \
 \
    http://snowball.tartarus.org/algorithms/italian/stemmer.html \
 \
The code is carefully crafted to work in conjunction with the the \
Lingua::Stem manpage module by Benjamin Franz, from which I've also \
borrowed some functionalities (caching and exception list)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Lingua-Stem-It-0.02-1.42.noarch.rpm"
RPM_HASH = "461bd79d128cacbd1270a3f59791bd5a7966f3d73e122954e205212f53d71c2b9688111e458649004e4c4f33dca95de588e367f0c1b98ce66b1da36075739d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--It \
perl-Lingua-Stem-It"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
