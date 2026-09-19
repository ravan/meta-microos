SUMMARY = "A Canadian words dictionary"
DESCRIPTION = "This package contains a Canadian words dictionary which will be installed as \
 \
/usr/share/dict/canadian \
 \
For a description see the package words."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.02.25"

RPM_NAME = "words-canadian-2026.02.25-1.1.noarch.rpm"
RPM_HASH = "523b0c3b863b896dbb939673f467832f6d18f2dfaae1dc2f6387ba56995fb19176904ff7ef5f91b3895c8415798d0c8c49c5cacc7734f9562277f7ee76efbeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "words-canadian"

RDEPENDS:${PN} += "words"

inherit rpm
