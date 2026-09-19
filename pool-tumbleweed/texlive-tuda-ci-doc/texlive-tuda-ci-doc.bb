SUMMARY = "Documentation for texlive-tuda-ci"
DESCRIPTION = "This package includes the documentation for texlive-tuda-ci"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.05svn76863"

RPM_NAME = "texlive-tuda-ci-doc-2026.226.4.05svn76863-59.2.noarch.rpm"
RPM_HASH = "5dff1159fa1172e4bdbaa8554930ff690f30b8827bc15b49c8eea802df11671c93151cc242cfd0e330ddbbac588a2a4e6b9c26419d841a276e00c418709296cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tuda-ci-doc"

RDEPENDS:${PN} += ""

inherit rpm
