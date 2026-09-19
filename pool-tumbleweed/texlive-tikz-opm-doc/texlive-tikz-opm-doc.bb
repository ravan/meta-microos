SUMMARY = "Documentation for texlive-tikz-opm"
DESCRIPTION = "This package includes the documentation for texlive-tikz-opm"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn32769"

RPM_NAME = "texlive-tikz-opm-doc-2026.226.0.0.1.1svn32769-59.2.noarch.rpm"
RPM_HASH = "66d5fb44ef110be5f50f037bc9900c50e7d34b2f20115bfe8d135a2d883820c1e03811e55467c3e927080c485a5ba6e4940ef96dcf5f56dab74f206b3532d938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-opm-doc"

RDEPENDS:${PN} += ""

inherit rpm
