SUMMARY = "A Australian words dictionary"
DESCRIPTION = "This package contains a Australian words dictionary which will be installed as \
 \
/usr/share/dict/australian \
 \
For a description see the package words."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.02.25"

RPM_NAME = "words-australian-2026.02.25-1.1.noarch.rpm"
RPM_HASH = "eabc427592090f5f84f9694beb1ca812697f565e588bb146db8765d273563458042dd959f9ac8aa5545ff6030a7b2f67f0e592db0e659e3034da261dec92be80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "words-australian"

RDEPENDS:${PN} += "words"

inherit rpm
