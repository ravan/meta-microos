SUMMARY = "Create dynamic online presentations with LaTeX"
DESCRIPTION = "TeXPower is a bundle of packages intended to provide an \
all-inclusive environment for designing pdf screen \
presentations to be viewed in full-screen mode, especially for \
projecting `online' with a video beamer. For some of its core \
functions, it uses code derived from ppower4 packages. It is, \
however, not a complete environment in itself: it relies on an \
existing class for preparing slides (such as foiltex or \
seminar) or another package such as pdfslide."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.2svn29349"

RPM_NAME = "texlive-texpower-2026.227.0.0.2svn29349-62.2.noarch.rpm"
RPM_HASH = "180171dcb9449436a9af8f6aa312e7d6d9ec8579408e9bb133f10e3af160487816ab7d9ba4cd145673c043cc88211b263fe45d3d6a96186861fec52a9832273b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-automata.sty \
tex-fixseminar.sty \
tex-powersem.cls \
tex-texpower.sty \
tex-tpcolors.cfg \
tex-tplists.sty \
tex-tpoptions.cfg \
tex-tppstcol.sty \
tex-tpsem-a4.sty \
tex-tpsettings.cfg \
texlive-texpower"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-graphics.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-pstricks.sty \
tex-relsize.sty \
tex-sem-page.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tpslifonts"

inherit rpm
