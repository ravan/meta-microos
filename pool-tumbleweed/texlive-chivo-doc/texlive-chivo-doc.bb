SUMMARY = "Documentation for texlive-chivo"
DESCRIPTION = "This package includes the documentation for texlive-chivo"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2svn65029"

RPM_NAME = "texlive-chivo-doc-2026.226.2.2svn65029-60.2.noarch.rpm"
RPM_HASH = "db8b631bf62793b157a75155e9b153a969f6fd12a71e2713f39e96a378c11915ee48b139c73d1126824aacfc2645c02e3ec744ea78a8ebfdd2fa8d1ba33782e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chivo-doc"

RDEPENDS:${PN} += ""

inherit rpm
