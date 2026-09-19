SUMMARY = "Documentation for texlive-tkz-graph"
DESCRIPTION = "This package includes the documentation for texlive-tkz-graph"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn57484"

RPM_NAME = "texlive-tkz-graph-doc-2026.226.2.0svn57484-59.2.noarch.rpm"
RPM_HASH = "e4414e4c3980cc542ac49bcec76f6b3f8f5fb7d37d08e22632a56e1fc3a1a63b7ecf43a3627362ecf7b204095da42c1a9ff17c5e479d2a56c077a39de73c1588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-graph-doc-fr \
texlive-tkz-graph-doc"

RDEPENDS:${PN} += ""

inherit rpm
