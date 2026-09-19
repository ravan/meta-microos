SUMMARY = "Documentation for texlive-pygmentex"
DESCRIPTION = "This package includes the documentation for texlive-pygmentex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-doc-2026.226.0.0.11svn64131-60.4.noarch.rpm"
RPM_HASH = "94c4e87fbb280c732351bd87fca98d6327ae697b7cad4c29713fe684163010d621ddf41ee07e0f7fcce211e03ea50822c49e081d21157a04c72fcf13d9a83dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
