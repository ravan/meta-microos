SUMMARY = "Documentation for texlive-kpfonts"
DESCRIPTION = "This package includes the documentation for texlive-kpfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.36svn77682"

RPM_NAME = "texlive-kpfonts-doc-2026.226.3.36svn77682-63.2.noarch.rpm"
RPM_HASH = "e739978863e65b314e5ba6ad62a93cdaad757c9f6b24d252f4eea7dbbdc1212c4d0429e3fd38708b1d9d5b390b9673b47148141ba8b370155e661b397add3698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kpfonts-doc-en \
texlive-kpfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
