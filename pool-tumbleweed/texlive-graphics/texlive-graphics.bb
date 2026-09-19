SUMMARY = "The LaTeX standard graphics bundle"
DESCRIPTION = "This is a collection of LaTeX packages for: producing colour \
including graphics (eg PostScript) files rotation and scaling \
of text in LaTeX documents. It comprises the packages color, \
graphics, graphicx, trig, epsfig, keyval, and lscape."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75374"

RPM_NAME = "texlive-graphics-2026.226.svn75374-60.4.noarch.rpm"
RPM_HASH = "381538eb7289946a4d9545d4407f4fe64a7a83faf56d7de9a965dfeb6fde588557b2b5fc4f74abedb94db43baf59aa9dcd300ce38aba5ed97d93d246d4771001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color.sty \
tex-dvipdf.def \
tex-dvipsnam.def \
tex-dvipsone.def \
tex-dviwin.def \
tex-emtex.def \
tex-epsfig.sty \
tex-graphics-2017-06-25.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-lscape.sty \
tex-pctex32.def \
tex-pctexhp.def \
tex-pctexps.def \
tex-pctexwin.def \
tex-rotating.sty \
tex-tcidvi.def \
tex-trig.sty \
tex-truetex.def \
texlive-graphics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.cfg \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-graphics-cfg \
texlive-graphics-def \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
