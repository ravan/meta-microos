SUMMARY = "Creating Venn diagrams with TikZ"
DESCRIPTION = "The package assists generation of simple two- and three-set \
Venn diagrams for lectures or assignment sheets. The package \
requires the TikZ package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn47952"

RPM_NAME = "texlive-venndiagram-2026.226.1.2svn47952-60.2.noarch.rpm"
RPM_HASH = "c8da9429ac35886fa372c063115ff83aa471ef454fabd42b919fb6c3f0e156f41d3cdb496303c25fc20a9cefe2733132cab396a37705ce176476fbe24dff76b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-venndiagram.sty \
texlive-venndiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
