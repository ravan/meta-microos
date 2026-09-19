SUMMARY = "Documentation for texlive-nowidow"
DESCRIPTION = "This package includes the documentation for texlive-nowidow"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-nowidow-doc-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "2366b0036888a78a56d1be3db86fd2820e569396ceef37bd963af97d1e64b705a364211f21d54cd6d6fc265a423adf7a694c60c675be4260c0cf187e448ccb8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nowidow-doc"

RDEPENDS:${PN} += ""

inherit rpm
