SUMMARY = "Documentation for texlive-libris"
DESCRIPTION = "This package includes the documentation for texlive-libris"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-libris-doc-2026.226.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "d0c4507c0dcfe68cc9a142fcd9be8748a7075e4ce8bf8918afda83839c89e3619023e3b3d3b0eaf3387d2a6daa308e06e0cf984faf19b87a257d7538fd076a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libris-doc"

RDEPENDS:${PN} += ""

inherit rpm
