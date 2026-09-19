SUMMARY = "Documentation for texlive-sasnrdisplay"
DESCRIPTION = "This package includes the documentation for texlive-sasnrdisplay"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.95svn63255"

RPM_NAME = "texlive-sasnrdisplay-doc-2026.226.0.0.95svn63255-60.2.noarch.rpm"
RPM_HASH = "3c95af80e5be7d698fba4883c77dfc5f325d174adfe54a803cd2dbc46ef993a5161ee2216e03b753121c0839ac7f41e45d15f41d5b6a7dc78590f83d872e0bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sasnrdisplay-doc"

RDEPENDS:${PN} += ""

inherit rpm
