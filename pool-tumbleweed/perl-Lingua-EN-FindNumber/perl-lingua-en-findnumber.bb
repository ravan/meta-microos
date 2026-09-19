SUMMARY = "Locate (written) numbers in English text"
DESCRIPTION = "This module provides a regular expression for finding numbers in English \
text. It also provides functions for extracting and manipulating such \
numbers."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.32"

RPM_NAME = "perl-Lingua-EN-FindNumber-1.32-1.41.noarch.rpm"
RPM_HASH = "b226281a4d74796a6bb97a9a683bd7c9dbb97c5ee6768d0107731ab4deb9419b270aa0553a9fc9356f3c4fb674eb6e23c9b2bc7dc7d5f23f7805b9ffbe10d7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--FindNumber \
perl-Lingua-EN-FindNumber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Lingua--EN--Words2Nums"

inherit rpm
