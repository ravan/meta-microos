SUMMARY = "Documentation for texlive-tikz-planets"
DESCRIPTION = "This package includes the documentation for texlive-tikz-planets"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.4svn75210"

RPM_NAME = "texlive-tikz-planets-doc-2026.226.1.0.4svn75210-59.2.noarch.rpm"
RPM_HASH = "fc3c2d962059c0469d599cebbc0423034d9bb878e57170c8e369144a5ab8354ebf5a5fa3d5f837c18c7a74cbad2165e9a78758070b50903c26a50b0f5c1683e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-planets-doc"

RDEPENDS:${PN} += ""

inherit rpm
