SUMMARY = "Documentation for texlive-bxdpx-beamer"
DESCRIPTION = "This package includes the documentation for texlive-bxdpx-beamer"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn41813"

RPM_NAME = "texlive-bxdpx-beamer-doc-2026.226.0.0.3svn41813-59.2.noarch.rpm"
RPM_HASH = "dc7e5630fda2f3029bcbeac0b9bc0f2984b85eb503829c1b96b4a06ff1edca5cd44710657d3040d0a3782cafc751ef628bb7df5c7115383862f331bc42c3a9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxdpx-beamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
