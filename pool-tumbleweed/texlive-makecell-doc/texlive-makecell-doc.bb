SUMMARY = "Documentation for texlive-makecell"
DESCRIPTION = "This package includes the documentation for texlive-makecell"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1esvn78101"

RPM_NAME = "texlive-makecell-doc-2026.226.0.0.1esvn78101-59.2.noarch.rpm"
RPM_HASH = "e7249c2903a24866b0937036f4ad2b59d06b0f42c2cb88af4dcc4c8d613de517ffc8e4741a1e31330056a2db5d5c3e390e8295535de4562582e75098d8934943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makecell-doc-ru;en \
texlive-makecell-doc"

RDEPENDS:${PN} += ""

inherit rpm
