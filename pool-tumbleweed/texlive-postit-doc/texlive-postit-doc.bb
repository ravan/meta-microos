SUMMARY = "Documentation for texlive-postit"
DESCRIPTION = "This package includes the documentation for texlive-postit"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.5svn75925"

RPM_NAME = "texlive-postit-doc-2026.226.0.0.1.5svn75925-59.2.noarch.rpm"
RPM_HASH = "7c2592cfa7c46f754d7dbecb5f27b8be36bd401ee7961861db9b8bafb759b1178f601fcfb3e79c5bad1c440705165cff2e64f07fc751ca8e7764ac6df101b1fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-postit-doc-fr \
texlive-postit-doc"

RDEPENDS:${PN} += ""

inherit rpm
