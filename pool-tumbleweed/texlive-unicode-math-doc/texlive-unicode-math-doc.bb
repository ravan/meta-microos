SUMMARY = "Documentation for texlive-unicode-math"
DESCRIPTION = "This package includes the documentation for texlive-unicode-math"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8rsvn77682"

RPM_NAME = "texlive-unicode-math-doc-2026.226.0.0.8rsvn77682-60.2.noarch.rpm"
RPM_HASH = "71318027a789f681a96df5ee3fc3cfa1f74b680d60e2cfc0ce8be2b9b14fec471371b8f5f020351719a03d6f342a391b4f2135283caadff8bbe2d36e94a399ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
