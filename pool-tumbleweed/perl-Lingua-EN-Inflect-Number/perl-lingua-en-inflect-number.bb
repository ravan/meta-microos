SUMMARY = "Force number of words to singular or plural"
DESCRIPTION = "This module extends the functionality of Lingua::EN::Inflect with three new \
functions available for export:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.12"

RPM_NAME = "perl-Lingua-EN-Inflect-Number-1.12-1.42.noarch.rpm"
RPM_HASH = "bc7aac2f686363b3cc6eecdc43ce3da9351bdbb4c55d31b309b3b77634b2c5cd5557e71fd924a0aebb9b29de54580fc9de783b78e668a02259880b1fb67a4cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Inflect--Number \
perl-Lingua-EN-Inflect-Number"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Lingua--EN--Inflect"

inherit rpm
