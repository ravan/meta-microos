SUMMARY = "Documentation for texlive-caladea"
DESCRIPTION = "This package includes the documentation for texlive-caladea"
LICENSE = "Apache-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-caladea-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "c01af9840befe389913186e838551ca7b0beb3c441f2a8bb2a38b9acaf31b6f182eb0f6166bd6c5fb756a704829ab037027db83f293b887b62c4a6f97aaf0bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-caladea-doc"

RDEPENDS:${PN} += ""

inherit rpm
