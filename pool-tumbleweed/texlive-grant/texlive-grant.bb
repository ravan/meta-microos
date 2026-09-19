SUMMARY = "Classes for formatting federal grant proposals"
DESCRIPTION = "LaTeX classes for formatting federal grant proposals: grant: \
Base class for formatting grant proposals grant-arl: Army \
Research Laboratory grant-darpa: Defense Advanced Research \
Projects Agency grant-doe: Department of Energy grant-nih: \
National Institutes of Health grant-nrl: Naval Research \
Laboratory grant-nsf: National Science Foundation grant-onr: \
Office of Naval Research"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.5svn56852"

RPM_NAME = "texlive-grant-2026.226.0.0.0.5svn56852-60.4.noarch.rpm"
RPM_HASH = "90ea8b4077d647a844d26247640003c40c89abeb8413d9a3bb0af5a155360d69708fcebe4de47b35c3bdce69501da4920d29c4de4b9d659fec69bb5236c8842b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grant-afosr.cls \
tex-grant-aro.cls \
tex-grant-darpa.cls \
tex-grant-doe.cls \
tex-grant-nih.cls \
tex-grant-nrl.cls \
tex-grant-nsf.cls \
tex-grant-onr.cls \
tex-grant.cls \
texlive-grant"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-book.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-chappg.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-longtable.sty \
tex-ltxtable.sty \
tex-multicol.sty \
tex-paralist.sty \
tex-pdfcomment.sty \
tex-pdfpages.sty \
tex-placeins.sty \
tex-setspace.sty \
tex-soul.sty \
tex-tabularx.sty \
tex-times.sty \
tex-titlesec.sty \
tex-ulem.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
