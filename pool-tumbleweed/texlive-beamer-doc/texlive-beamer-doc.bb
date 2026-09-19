SUMMARY = "Documentation for texlive-beamer"
DESCRIPTION = "This package includes the documentation for texlive-beamer"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.77svn78101"

RPM_NAME = "texlive-beamer-doc-2026.226.3.77svn78101-61.2.noarch.rpm"
RPM_HASH = "de69da50ed584fc25350690dfcce812efda44e33623a1c333ceba269a1f38926902c655cb0ad474a75fe58b61e065cbe28379b6f07a5d6becd24c65ba046bd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
