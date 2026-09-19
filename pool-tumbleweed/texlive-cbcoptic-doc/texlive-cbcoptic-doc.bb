SUMMARY = "Documentation for texlive-cbcoptic"
DESCRIPTION = "This package includes the documentation for texlive-cbcoptic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn16666"

RPM_NAME = "texlive-cbcoptic-doc-2026.226.0.0.2svn16666-59.2.noarch.rpm"
RPM_HASH = "eafb93fb5e8106a072ea33412e06a7d860b8cd066f32d6647c87b2fa7ff8bf6ba1b5168a4282fd45dc26a986d94a60e7b91316993bb6fae72498babf96f14e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbcoptic-doc"

RDEPENDS:${PN} += ""

inherit rpm
