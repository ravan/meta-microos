SUMMARY = "Documentation for texlive-convbkmk"
DESCRIPTION = "This package includes the documentation for texlive-convbkmk"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.30svn49252"

RPM_NAME = "texlive-convbkmk-doc-2026.226.0.0.30svn49252-61.2.noarch.rpm"
RPM_HASH = "65345493bdd3e016470102024a444f4d7f3743944deea3b1b638f2e51c6b21ce4e5221285bd3c5dbdc09a66cc7a3915d63cd147ab9631863f266eac7d124ecda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-convbkmk-doc"

RDEPENDS:${PN} += ""

inherit rpm
