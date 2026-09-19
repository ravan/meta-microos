SUMMARY = "Typeset flipbook animations, in the corners of documents"
DESCRIPTION = "The package provides techniques for adding flip book animations \
in the corner of your LaTeX documents (using images or ASCII \
art). Animations are defined as a set of numbered files (e.g., \
im1.pdf, im2.pdf, im3.pdf, ...). The package relies on fancyhdr \
to control the corners."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn75878"

RPM_NAME = "texlive-flipbook-2026.226.0.0.2svn75878-59.2.noarch.rpm"
RPM_HASH = "6cfa763886d32e0613dd40422bc984e2a0512a95b39e01c9bc100bfdce3c0bfdaf1db2f6e15a1c219f4f91a6547175b210a2a4439f986b26f7d5826ad3dc3c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flipbook.sty \
texlive-flipbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-scalefnt.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
