SUMMARY = "Include PDF documents in LaTeX"
DESCRIPTION = "This package simplifies the inclusion of external multi-page \
PDF documents in LaTeX documents. Pages may be freely selected \
and similar to psnup it is possible to put several logical \
pages onto each sheet of paper. Furthermore a lot of hypertext \
features like hyperlinks and article threads are provided. The \
package supports pdfTeX (pdfLaTeX) and VTeX. With VTeX it is \
even possible to use this package to insert PostScript files, \
in addition to PDF files."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6gsvn77682"

RPM_NAME = "texlive-pdfpages-2026.226.0.0.6gsvn77682-58.2.noarch.rpm"
RPM_HASH = "4d20cfe41b7533dbffe442ea7beeef169f18d660526f3ca2cb4d54f8ab747c53fc0013b4d34049600ded2b4bf1f20691f123c94191f1241d510f122cd786d6c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpages.sty \
tex-ppdvipdfmx.def \
tex-ppdvips.def \
tex-ppluatex.def \
tex-ppnull.def \
tex-pppdftex.def \
tex-ppvtex.def \
tex-ppxetex.def \
texlive-pdfpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-count1to.sty \
tex-dvipdfmx.def \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-pdflscape.sty \
texlive \
texlive-eso-pic \
texlive-filesystem \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm
