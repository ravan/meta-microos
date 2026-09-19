SUMMARY = "Documentation for texlive-ksp-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ksp-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn39080"

RPM_NAME = "texlive-ksp-thesis-doc-2026.226.1.0.2svn39080-63.2.noarch.rpm"
RPM_HASH = "2f8d96f2f9c21d6b550112379b3a46a20c2dc2772a5fce196e331d20f343dc938328097f40d262e8ebd41f52853887c2ce2717dd6f202b21fd6f51f30f26839e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ksp-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
