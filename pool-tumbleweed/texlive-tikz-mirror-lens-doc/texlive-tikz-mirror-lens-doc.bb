SUMMARY = "Documentation for texlive-tikz-mirror-lens"
DESCRIPTION = "This package includes the documentation for texlive-tikz-mirror-lens"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn65500"

RPM_NAME = "texlive-tikz-mirror-lens-doc-2026.226.1.0.2svn65500-59.2.noarch.rpm"
RPM_HASH = "a3ae07a4e702d3de2a88d9ad0d3e715b0c98f1f008e886d6ac68f6221916cd34f6ce00f036f64c051b31190d65a3b8a6cfbc98862113aa5005797655dc0fe071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikz-mirror-lens-doc-pt-BR \
texlive-tikz-mirror-lens-doc"

RDEPENDS:${PN} += ""

inherit rpm
