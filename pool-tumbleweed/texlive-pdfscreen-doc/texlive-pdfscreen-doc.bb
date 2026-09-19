SUMMARY = "Documentation for texlive-pdfscreen"
DESCRIPTION = "This package includes the documentation for texlive-pdfscreen"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn42428"

RPM_NAME = "texlive-pdfscreen-doc-2026.226.1.5svn42428-58.2.noarch.rpm"
RPM_HASH = "0de6e22470561e6b13fd00af72f66ce2af0724d214de671bbe03196ab7cf161f0fd9caad51f9dce745dd0680d52ad8043ce71394c0ac055aca3f20717a93d927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfscreen-doc"

RDEPENDS:${PN} += ""

inherit rpm
