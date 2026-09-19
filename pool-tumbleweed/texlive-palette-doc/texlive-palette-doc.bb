SUMMARY = "Documentation for texlive-palette"
DESCRIPTION = "This package includes the documentation for texlive-palette"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn60119"

RPM_NAME = "texlive-palette-doc-2026.226.1.1.0svn60119-58.2.noarch.rpm"
RPM_HASH = "d0e46ca0c02bdbd6df610154e0ef9b6ae809d075f0398ceeb9026f63470b72313a0cc0235245db45e707028efdbae7239e317f1840eaee0e0725d173df7321af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-palette-doc"

RDEPENDS:${PN} += ""

inherit rpm
