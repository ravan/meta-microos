SUMMARY = "Documentation for texlive-xcomment"
DESCRIPTION = "This package includes the documentation for texlive-xcomment"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.40svn77682"

RPM_NAME = "texlive-xcomment-doc-2026.226.1.40svn77682-59.4.noarch.rpm"
RPM_HASH = "e18dc916045670d720a831a17e533de7df09f77f85fc69286348f1d97a76dff1c18b06767312a81d93b0f87e6775c27482579a1b467acf0628480ae763e49163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcomment-doc"

RDEPENDS:${PN} += ""

inherit rpm
