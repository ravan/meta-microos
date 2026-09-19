SUMMARY = "A LaTeX document class for writing lab reports"
DESCRIPTION = "The package provides physics students at the University of \
Oldenburg with a prepared document class for writing laboratory \
reports for the laboratory courses conducted by the Institute \
of Physics. The document class consists of predefined margins \
and heading formats. Furthermore, it presets the headers of the \
pages and excludes the titlepage and table of contents from the \
page numbering."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-uol-physics-report-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "064b0d86cc47d229cfbc92f0f5b81a7a0a01d8941e50b1e4442311799d021c6090a513eeb228343e57e9b59a99f241dc410340a85c6a6d013dc1df7d21ac79c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uol-physics-report.cls \
texlive-uol-physics-report"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-arrayjobx.sty \
tex-article.cls \
tex-babel.sty \
tex-caption.sty \
tex-circuitikz.sty \
tex-cleveref.sty \
tex-datetime2.sty \
tex-esdiff.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-mathtools.sty \
tex-multido.sty \
tex-parskip.sty \
tex-pdfpages.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tcolorbox.sty \
tex-titleref.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
