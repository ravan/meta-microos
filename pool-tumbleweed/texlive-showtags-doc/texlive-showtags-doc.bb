SUMMARY = "Documentation for texlive-showtags"
DESCRIPTION = "This package includes the documentation for texlive-showtags"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.05svn77682"

RPM_NAME = "texlive-showtags-doc-2026.226.1.05svn77682-60.2.noarch.rpm"
RPM_HASH = "a0712787c2a35d3cc139f31f03c416b4a1f96d1c22bc542342be8ac83f4a17d58ddc9dbc6349789e9e13aef4692af04d504d94a7ba67ba09e04ce4b9912027c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showtags-doc"

RDEPENDS:${PN} += ""

inherit rpm
