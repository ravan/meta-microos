SUMMARY = "Notre Dame Dissertation format class"
DESCRIPTION = "This class file conforms to the requirements of the Graduate \
School of the University of Notre Dame; with it a user can \
format a thesis or dissertation in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2017.2svn45107"

RPM_NAME = "texlive-nddiss-2026.226.3.2017.2svn45107-61.2.noarch.rpm"
RPM_HASH = "d58cc51a7a789ac23c5014c9dd1a8eef4f7c38ba43bc519fadea69dd3d49bc335af12f403561f24e7e1cd3eb85b29f98ef38c39f9142d1ba309d6da44495fc06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nddiss2e.cls \
texlive-nddiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-book.cls \
tex-booktabs.sty \
tex-color.sty \
tex-enumerate.sty \
tex-epsfig.sty \
tex-etoolbox.sty \
tex-exscale.sty \
tex-float.sty \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-indentfirst.sty \
tex-latexsym.sty \
tex-longtable.sty \
tex-metalogo.sty \
tex-natbib.sty \
tex-pdflscape.sty \
tex-pdfx.sty \
tex-rotating.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textcase.sty \
tex-threeparttable.sty \
tex-threeparttablex.sty \
tex-url.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
