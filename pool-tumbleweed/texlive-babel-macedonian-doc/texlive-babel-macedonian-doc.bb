SUMMARY = "Documentation for texlive-babel-macedonian"
DESCRIPTION = "This package includes the documentation for texlive-babel-macedonian"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn39587"

RPM_NAME = "texlive-babel-macedonian-doc-2026.226.svn39587-60.2.noarch.rpm"
RPM_HASH = "498575fd9954a3ef8b4e03a931c2d027f1980038ec1b978ac66f45c1a35b492144596fcdee44070fd316110b7dbb8553c2bd20e3f9a7786a52eadaef6736db80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-macedonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
