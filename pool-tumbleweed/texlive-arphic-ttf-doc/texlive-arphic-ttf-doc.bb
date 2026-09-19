SUMMARY = "Documentation for texlive-arphic-ttf"
DESCRIPTION = "This package includes the documentation for texlive-arphic-ttf"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42675"

RPM_NAME = "texlive-arphic-ttf-doc-2026.226.svn42675-60.2.noarch.rpm"
RPM_HASH = "f64f79bed9b8a37429f9afb46738dc8a03a62cc92963ac9fb61875bc88c14e78feb6b98238ce2ed3306ef1a77165a556b24e33ff30a2cbe1ea95eac3fb6d9685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-ttf-doc"

RDEPENDS:${PN} += ""

inherit rpm
