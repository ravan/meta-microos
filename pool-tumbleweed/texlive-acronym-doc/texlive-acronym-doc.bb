SUMMARY = "Documentation for texlive-acronym"
DESCRIPTION = "This package includes the documentation for texlive-acronym"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.50svn78101"

RPM_NAME = "texlive-acronym-doc-2026.226.1.50svn78101-61.2.noarch.rpm"
RPM_HASH = "25ef01773f597683cd75699d52e8f43dd6e15daef46dea39df94cf758c681d7283cbde7736f3e5cf089f8ae322b097cf2d4ebf680b4bab1c3e7baf98a5a71b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acronym-doc"

RDEPENDS:${PN} += ""

inherit rpm
