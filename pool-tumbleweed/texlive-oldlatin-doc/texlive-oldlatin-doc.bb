SUMMARY = "Documentation for texlive-oldlatin"
DESCRIPTION = "This package includes the documentation for texlive-oldlatin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn17932"

RPM_NAME = "texlive-oldlatin-doc-2026.226.1.00svn17932-61.2.noarch.rpm"
RPM_HASH = "2347bdbc6537b9bb4793d64b3a8b3008ba6fd8688bd9e25db4e1b6eae16919bee158f97e54b7e041eb55445a5f9c09c72b8654cd91fc8d3b0b9155372e0817b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldlatin-doc"

RDEPENDS:${PN} += ""

inherit rpm
