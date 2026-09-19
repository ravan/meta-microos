SUMMARY = "Porter's stemming algorithm for Russian (KOI8-R only)"
DESCRIPTION = "This module applies the Porter Stemming Algorithm to its parameters, \
returning the stemmed words. \
 \
The algorithm is implemented exactly as described in: \
 \
    http://snowball.tartarus.org/algorithms/russian/stemmer.html \
 \
The code is carefully crafted to work in conjunction with the Lingua::Stem \
module by Benjamin Franz. This stemmer is also based on the work of Aldo \
Capini, see Lingua::Stem::It."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Lingua-Stem-Ru-0.04-1.40.noarch.rpm"
RPM_HASH = "e0ae93572a89ccaff5403220112b31c41fcd35f0fde8816638c395b244c8cde132064a5af0e52bb014c60937101e78d564c5ecbe711a2afe0c182f0a043c928c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Ru \
perl-Lingua-Stem-Ru"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
