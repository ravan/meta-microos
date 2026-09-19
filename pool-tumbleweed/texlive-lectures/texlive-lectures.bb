SUMMARY = "A document class for quickly drafting nice looking lecture notes"
DESCRIPTION = "This LaTeX documentclass provides a number of gimmicks to draft \
nice looking lecture notes, such as a number of theorem \
environments, automatic spacing and alignment of figures and \
much more. More information is available in the package readme."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.7svn74632"

RPM_NAME = "texlive-lectures-2026.226.1.0.7svn74632-61.2.noarch.rpm"
RPM_HASH = "1120e56c05b01f4c38c8d3ad78605f083c3cbe59c8289b8c8f160f30e049733c7251c54896c99079ef19bcd874c265bc07c5b3fcba9a5b7419eb567dfd996e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lectures.cls \
texlive-lectures"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adigraph.sty \
tex-algorithm2e.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-biblatex.sty \
tex-bm.sty \
tex-bodegraph.sty \
tex-cancel.sty \
tex-caption.sty \
tex-centernot.sty \
tex-circuitikz.sty \
tex-csquotes.sty \
tex-diagbox.sty \
tex-emptypage.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fourier.sty \
tex-fp.sty \
tex-framed.sty \
tex-gensymb.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-marvosym.sty \
tex-microtype.sty \
tex-minted.sty \
tex-multicol.sty \
tex-paralist.sty \
tex-parskip.sty \
tex-pgfplots.sty \
tex-quotchap.sty \
tex-relsize.sty \
tex-report.cls \
tex-sectsty.sty \
tex-silence.sty \
tex-soul.sty \
tex-stmaryrd.sty \
tex-subcaption.sty \
tex-subfiles.sty \
tex-tcolorbox.sty \
tex-tikz-qtree.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
