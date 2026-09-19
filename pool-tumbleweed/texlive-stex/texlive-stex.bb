SUMMARY = "An infrastructure for semantic preloading of LaTeX documents"
DESCRIPTION = "The sTeX package collection is a version of TeX/LaTeX that \
allows to markup TeX/LaTeX documents semantically without \
leaving the document format, essentially turning it into a \
document format for mathematical knowledge management (MKM)."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.0svn76825"

RPM_NAME = "texlive-stex-2026.226.4.0.0svn76825-64.2.noarch.rpm"
RPM_HASH = "6d89dc5eedc2daae7241b7f3854b978739a6a97dc4e606fb8a3230ef180b2e8a02b2373a67723efd217e93b8cd6ba084488e6c504fd0f90e159a8387c5254df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemesTeX.sty \
tex-document-structure-ngerman.ldf \
tex-hwexam-english.ldf \
tex-hwexam-finnish.ldf \
tex-hwexam-french.ldf \
tex-hwexam-ngerman.ldf \
tex-hwexam-russian.ldf \
tex-hwexam.sty \
tex-lststex.sty \
tex-notesslides.cls \
tex-notesslides.sty \
tex-problem-english.ldf \
tex-problem-finnish.ldf \
tex-problem-french.ldf \
tex-problem-ngerman.ldf \
tex-problem-russian.ldf \
tex-problem.sty \
tex-rustex.sty \
tex-stex-backend-latexml.cfg \
tex-stex-backend-pdflatex.cfg \
tex-stex-backend-rustex.cfg \
tex-stex-backend-tex4ht.cfg \
tex-stex-en.ldf \
tex-stex-highlighting.sty \
tex-stex-logo.sty \
tex-stex.cls \
tex-stex.sty \
tex-stexthm-english.ldf \
tex-stexthm-finnish.ldf \
tex-stexthm-ngerman.ldf \
tex-stexthm.sty \
tex-tikzinput.sty \
texlive-stex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-article.cls \
tex-beamer.cls \
tex-beamerarticle.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-ltxcmds.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-pdfcomment.sty \
tex-qrcode.sty \
tex-standalone.sty \
tex-thmtools.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
