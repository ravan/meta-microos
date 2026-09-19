SUMMARY = "Documentation for texlive-babel-greek"
DESCRIPTION = "This package includes the documentation for texlive-babel-greek"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn78101"

RPM_NAME = "texlive-babel-greek-doc-2026.226.1.15svn78101-60.2.noarch.rpm"
RPM_HASH = "a43c104db0a6b39ea6e1af0b6b7f44488cdde817f75007ab2c78761633aed677db7581ad566674ff02d1e48673c946128dfbec3b80a746bc80a8fee87c5d4771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
