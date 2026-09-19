SUMMARY = "Documentation for texlive-kotex-oblivoir"
DESCRIPTION = "This package includes the documentation for texlive-kotex-oblivoir"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5svn78115"

RPM_NAME = "texlive-kotex-oblivoir-doc-2026.226.3.5svn78115-63.2.noarch.rpm"
RPM_HASH = "a6dcc59d5d11650f76c8acbfa01e4de1c009b11f0f91cf8224f64ddabb86e936ee43963a7b1549478a3ccf6ef3c3c62c4f7d50ed91141637ba79cf8144847ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kotex-oblivoir-doc-ko \
texlive-kotex-oblivoir-doc"

RDEPENDS:${PN} += ""

inherit rpm
