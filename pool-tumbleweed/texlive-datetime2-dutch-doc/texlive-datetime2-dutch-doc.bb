SUMMARY = "Documentation for texlive-datetime2-dutch"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-dutch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47355"

RPM_NAME = "texlive-datetime2-dutch-doc-2026.226.1.1svn47355-59.2.noarch.rpm"
RPM_HASH = "7189cb9b666da889d64fe2d9dfcc312a05dfc105d142a150e8c05866a8976f13190f3fb067d36f53d27ee7505834909cb893d600c8644f18d1ad196ae744be3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
