SUMMARY = "Documentation for texlive-moremath"
DESCRIPTION = "This package includes the documentation for texlive-moremath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn76924"

RPM_NAME = "texlive-moremath-doc-2026.226.0.0.5.0svn76924-61.2.noarch.rpm"
RPM_HASH = "e29ba2a8148c32d4c7061817cb70c17f09cf6cd104d4a319f212b3900c33f0d9916f11cf70d3df3db209f15fe47ca9e642a20bc3e7f784b00d2de8dfe3abdc61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moremath-doc"

RDEPENDS:${PN} += ""

inherit rpm
