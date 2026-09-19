SUMMARY = "Documentation for texlive-pagecont"
DESCRIPTION = "This package includes the documentation for texlive-pagecont"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-pagecont-doc-2026.226.1.0svn15878-58.2.noarch.rpm"
RPM_HASH = "7aa47c970c1cabc3188acbefe4b8411ff11f6c2eab91c0da756a51f62ad1f16e4cb45faf766cb81605359ee0e30d7378fbbea208288df0f41a4cb15ee2db7516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagecont-doc"

RDEPENDS:${PN} += ""

inherit rpm
