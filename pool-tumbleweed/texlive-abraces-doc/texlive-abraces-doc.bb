SUMMARY = "Documentation for texlive-abraces"
DESCRIPTION = "This package includes the documentation for texlive-abraces"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-abraces-doc-2026.226.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "3cbfc7e67834971ef9fd87ad35f12cceec3d02fadf749bfe0a773c6a3da434146196271d9c1b2c02db5977624a10f99c8a2bc8af91cc0ea558d7988f3496316a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abraces-doc"

RDEPENDS:${PN} += ""

inherit rpm
