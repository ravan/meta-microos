SUMMARY = "Documentation for texlive-junicode"
DESCRIPTION = "This package includes the documentation for texlive-junicode"
LICENSE = "OFL-1.1"

PV = "2026.226.2.218svn77682"

RPM_NAME = "texlive-junicode-doc-2026.226.2.218svn77682-63.2.noarch.rpm"
RPM_HASH = "2f5874a171d87f3e7428d6e7d809cacc333c62dd3844ac0d4ecd7123e7c469a3c189689a1306a0cca9bfb168cb5d4ba40d2ce49169683c176979fc741d1fff74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-junicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
