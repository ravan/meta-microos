SUMMARY = "Documentation for texlive-pst-rputover"
DESCRIPTION = "This package includes the documentation for texlive-pst-rputover"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-doc-2026.226.1.0svn44724-60.4.noarch.rpm"
RPM_HASH = "d1ed9be1a8eb91e1c40ed319af10eca3a3f70eacc95159b9a5df7a75c15918cf0ec82cf4eacc64026f6ec4505087ead159e8df9a4b18f2396ce73850dc47423f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rputover-doc"

RDEPENDS:${PN} += ""

inherit rpm
