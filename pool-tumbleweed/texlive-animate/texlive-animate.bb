SUMMARY = "Create PDF and SVG animations from graphics files and inline graphics"
DESCRIPTION = "The package provides an interface to create portable, \
JavaScript driven PDF and SVG animations from sets of graphics \
files or from inline graphics, such as LaTeX picture \
environment, PSTricks or pgf/TikZ generated pictures, or just \
from typeset text."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72548"

RPM_NAME = "texlive-animate-2026.226.svn72548-61.2.noarch.rpm"
RPM_HASH = "ac859c520de04c505b0320a065c1e9b563432a7e761c563df9a6fdf95cd99e835081fc9e395eaa5491ae9eddd3f929f52e8457adc58285dce304f750bd593940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-animate.sty \
texlive-animate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphics.sty \
tex-ifdraft.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-ocgbase.sty \
tex-pdfbase.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
