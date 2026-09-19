SUMMARY = "LaTeX laboratory"
DESCRIPTION = "This bundle holds optional files that are loaded in certain \
situations by kernel code (if available). While this code is \
still in development and the use is experimental, it is stored \
outside the format so that there can be intermediate releases \
not affecting the production use of LaTeX. Once the code is \
finalized and properly tested it will eventually move to the \
kernel and the corresponding file in this bundle will vanish. \
Note that none of these files are directly user accessible in \
documents (i.e., they aren't packages), so the process is \
transparent to documents already using the new functionality."
LICENSE = "LPPL-1.0"

PV = "2026.226.20251101asvn76739"

RPM_NAME = "texlive-latex-lab-2026.226.20251101asvn76739-63.2.noarch.rpm"
RPM_HASH = "0d8a1164a24bc41ab45ec96a304b1988159b7e74654a4855ecdefd9a45012a4e02851d4bb07b78e89cc655eaf4b81f3b8e032e752db7a893d03e696297e89b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glyphtounicode-cmex.tex \
tex-latex-lab-kernel-changes.sty \
tex-latex-lab-testphase-bib.sty \
tex-latex-lab-testphase-block.sty \
tex-latex-lab-testphase-context.sty \
tex-latex-lab-testphase-firstaid.sty \
tex-latex-lab-testphase-float.sty \
tex-latex-lab-testphase-graphic.sty \
tex-latex-lab-testphase-l3doc.sty \
tex-latex-lab-testphase-latest.sty \
tex-latex-lab-testphase-marginpar.sty \
tex-latex-lab-testphase-math.sty \
tex-latex-lab-testphase-minipage.sty \
tex-latex-lab-testphase-names.sty \
tex-latex-lab-testphase-new-or-1.sty \
tex-latex-lab-testphase-new-or-2.sty \
tex-latex-lab-testphase-sec.sty \
tex-latex-lab-testphase-table.sty \
tex-latex-lab-testphase-text.sty \
tex-latex-lab-testphase-tikz.sty \
tex-latex-lab-testphase-title.sty \
tex-latex-lab-testphase-toc.sty \
tex-tagpdf-ns-latex-lab.def \
texlive-latex-lab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-graphicx.sty \
tex-tagpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
