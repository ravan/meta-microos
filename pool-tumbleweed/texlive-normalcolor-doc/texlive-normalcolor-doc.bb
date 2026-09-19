SUMMARY = "Documentation for texlive-normalcolor"
DESCRIPTION = "This package includes the documentation for texlive-normalcolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.r11svn77682"

RPM_NAME = "texlive-normalcolor-doc-2026.226.r11svn77682-61.2.noarch.rpm"
RPM_HASH = "e30b095b422791641e52689863a8fc63bc6ec6114546414af5655d00e2924e8f0631309ade2de8fecc3d971b5c8b5266ddf27648385d6cc96b68c77033535f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-normalcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
