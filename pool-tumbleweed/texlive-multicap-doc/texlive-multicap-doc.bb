SUMMARY = "Documentation for texlive-multicap"
DESCRIPTION = "This package includes the documentation for texlive-multicap"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-multicap-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "f350787d36050a5930e472f73709193fed5af964fda9cbb22ac95ec1dbb5101343e18d54c581d45135186648cd96a17d0046ddd59b84c2125889c0c036308e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multicap-doc"

RDEPENDS:${PN} += ""

inherit rpm
