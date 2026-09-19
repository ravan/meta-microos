SUMMARY = "Documentation for texlive-namedtensor"
DESCRIPTION = "This package includes the documentation for texlive-namedtensor"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn65346"

RPM_NAME = "texlive-namedtensor-doc-2026.226.0.0.4svn65346-61.2.noarch.rpm"
RPM_HASH = "aa2b5d89ba3f1d4f6d43fd5d65786854b8748dcbc0dcdd1971239e57bb41dfe23a8d6f6429209b2d17b01216df69ae445c0c4ded2619daa7c7e9fe4d1acebeeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namedtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
