SUMMARY = "Documentation for texlive-biblatex-swiss-legal"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-swiss-legal"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2asvn78219"

RPM_NAME = "texlive-biblatex-swiss-legal-doc-2026.226.1.1.2asvn78219-61.2.noarch.rpm"
RPM_HASH = "cfbc58fc36aa5a1e0d3b95b5c55d899ce5c9b1af34c3457fffb7156d124a76d233b2be94b2cdcbfaa7e19ccc174eb8e9614ecec739ebce07282a3a4393c6e8c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-swiss-legal-doc-fr \
texlive-biblatex-swiss-legal-doc"

RDEPENDS:${PN} += ""

inherit rpm
