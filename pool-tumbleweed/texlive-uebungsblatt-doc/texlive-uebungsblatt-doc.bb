SUMMARY = "Documentation for texlive-uebungsblatt"
DESCRIPTION = "This package includes the documentation for texlive-uebungsblatt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.0svn15878"

RPM_NAME = "texlive-uebungsblatt-doc-2026.226.1.5.0svn15878-60.2.noarch.rpm"
RPM_HASH = "8a7c401ef284cc1299b5d3137a93b34da577a82ddaa018c2fb3df57d768de92005cf1a60e80340141766c4c7cd0cba6739247dd977e2eab43e8a738af9d2894d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uebungsblatt-doc-de \
texlive-uebungsblatt-doc"

RDEPENDS:${PN} += ""

inherit rpm
