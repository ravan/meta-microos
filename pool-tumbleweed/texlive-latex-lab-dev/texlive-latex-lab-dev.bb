SUMMARY = "LaTeX laboratory: Development pre-release"
DESCRIPTION = "This package provides a testing release for upcoming changes to \
the latex-lab bundle, which provides a route for additions to \
the LaTeX kernel to be stabilised. It accompanies the \
pre-testing kernel code (latex-base-dev), and is intended for \
testing by knowledgeable users."
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1asvn77531"

RPM_NAME = "texlive-latex-lab-dev-2026.226.pre_release_1asvn77531-63.2.noarch.rpm"
RPM_HASH = "1c5c30a90fadb389a67cd7d70b0871f49abc24f74e6e05ddfa493c9c7a8ad114932831c70d20bdd1d5052e2b42dfe26790ff67267236c97123486bb3a78d9090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-glyphtounicode-cmex.tex \
texdev-latex-lab-enumitem.sty \
texdev-latex-lab-kernel-changes.sty \
texdev-latex-lab-testphase-bib.sty \
texdev-latex-lab-testphase-block.sty \
texdev-latex-lab-testphase-context.sty \
texdev-latex-lab-testphase-firstaid.sty \
texdev-latex-lab-testphase-float.sty \
texdev-latex-lab-testphase-graphic.sty \
texdev-latex-lab-testphase-l3doc.sty \
texdev-latex-lab-testphase-latest.sty \
texdev-latex-lab-testphase-marginpar.sty \
texdev-latex-lab-testphase-math.sty \
texdev-latex-lab-testphase-minipage.sty \
texdev-latex-lab-testphase-names.sty \
texdev-latex-lab-testphase-new-or-1.sty \
texdev-latex-lab-testphase-new-or-2.sty \
texdev-latex-lab-testphase-sec-template.sty \
texdev-latex-lab-testphase-sec.sty \
texdev-latex-lab-testphase-table.sty \
texdev-latex-lab-testphase-text.sty \
texdev-latex-lab-testphase-tikz.sty \
texdev-latex-lab-testphase-title.sty \
texdev-latex-lab-testphase-toc.sty \
texdev-tagpdf-ns-latex-lab.def \
texlive-latex-lab-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tagpdf.sty \
texdev-array.sty \
texdev-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
