SUMMARY = "Documentation for texlive-showlabels"
DESCRIPTION = "This package includes the documentation for texlive-showlabels"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.3svn77682"

RPM_NAME = "texlive-showlabels-doc-2026.226.1.9.3svn77682-60.2.noarch.rpm"
RPM_HASH = "b99276b8a2e51d7740334753baab0a063f097509d981d947642e56469cc30911075a2e0ccaa75616139a809b52d195a3b0f88e8b0c293e62b8d7d87fb46ad782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showlabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
