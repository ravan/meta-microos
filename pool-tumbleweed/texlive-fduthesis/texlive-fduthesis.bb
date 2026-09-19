SUMMARY = "LaTeX thesis template for Fudan University"
DESCRIPTION = "This package is a LaTeX thesis template package for Fudan \
University. It can make it easy to write theses both in Chinese \
and English."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9asvn67231"

RPM_NAME = "texlive-fduthesis-2026.226.0.0.9asvn67231-59.2.noarch.rpm"
RPM_HASH = "82e352177f29da4fcd2ffec890a5c6301d71dd29160053332abed759a5929d82a6d2d7e5f4f77c6f90d8ef72ab413ad6ae523d81d112301bb01f87c09720b6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fdudoc.cls \
tex-fdulogo.sty \
tex-fduthesis-en.cls \
tex-fduthesis.cls \
tex-fduthesis.def \
texlive-fduthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-ctex.sty \
tex-gbt7714.sty \
tex-hyperref.sty \
tex-l3doc.cls \
tex-l3keys2e.sty \
tex-luatex85.sty \
tex-natbib.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
