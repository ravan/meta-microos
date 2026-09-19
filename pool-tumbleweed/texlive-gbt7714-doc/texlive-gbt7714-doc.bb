SUMMARY = "Documentation for texlive-gbt7714"
DESCRIPTION = "This package includes the documentation for texlive-gbt7714"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.9svn77401"

RPM_NAME = "texlive-gbt7714-doc-2026.226.2.1.9svn77401-60.2.noarch.rpm"
RPM_HASH = "8e00640ab76890ab556f64639f18610ab231043512aebb37e24ca38e02d364e500583962161cdc48514f54cfaddc81f0b12658325f9c0c8c529540cc94345b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gbt7714-doc-zh \
texlive-gbt7714-doc"

RDEPENDS:${PN} += ""

inherit rpm
