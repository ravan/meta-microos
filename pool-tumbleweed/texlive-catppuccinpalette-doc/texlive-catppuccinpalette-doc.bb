SUMMARY = "Documentation for texlive-catppuccinpalette"
DESCRIPTION = "This package includes the documentation for texlive-catppuccinpalette"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn75934"

RPM_NAME = "texlive-catppuccinpalette-doc-2026.226.1.2.0svn75934-59.2.noarch.rpm"
RPM_HASH = "87f7d833667ac37a1524ee3ecb881cd5a053b873b550f34ac860a7736f14a1d938f48e14dc7e32b6d0b94a78b3cf8a255bb3d05aa0723115d908b3b7b04ec396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catppuccinpalette-doc"

RDEPENDS:${PN} += ""

inherit rpm
