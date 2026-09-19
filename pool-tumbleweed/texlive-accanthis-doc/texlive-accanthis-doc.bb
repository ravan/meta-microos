SUMMARY = "Documentation for texlive-accanthis"
DESCRIPTION = "This package includes the documentation for texlive-accanthis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-accanthis-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "ae1e2915b66d95b2bd63b60947c354393f725fe8116b9bb03bcf6b1e7f0fae9fc43018b834af86d250cecc715e5d20d6223c3791f60a8325f06783ac3ab819a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-accanthis-doc-fr \
texlive-accanthis-doc"

RDEPENDS:${PN} += ""

inherit rpm
