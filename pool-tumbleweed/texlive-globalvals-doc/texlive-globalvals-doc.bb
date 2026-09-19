SUMMARY = "Documentation for texlive-globalvals"
DESCRIPTION = "This package includes the documentation for texlive-globalvals"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn49962"

RPM_NAME = "texlive-globalvals-doc-2026.226.1.1svn49962-60.4.noarch.rpm"
RPM_HASH = "9ea225fa2e551219dbb777c3880e73d20503ddcd6a6f548639e9c8150cd5a1db5dd6968782add49a63a65908d8fc31a59829ba53eddcb44c239373cf9c52764e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-globalvals-doc"

RDEPENDS:${PN} += ""

inherit rpm
