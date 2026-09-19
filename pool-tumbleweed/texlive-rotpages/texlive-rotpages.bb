SUMMARY = "Typeset sets of pages upside-down and backwards"
DESCRIPTION = "The rotpages package allows you to format documents where small \
sets of pages are rotated by 180 degrees and rearranged, so \
that they can be read by turning the printed copy upside-down. \
It was developed for collecting exercises and solutions: using \
the package, you can print the exercise text normally and the \
solutions rotated."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-rotpages-2026.226.3.0svn77682-60.2.noarch.rpm"
RPM_HASH = "a17bab832109af38f62f6c001685427c5dbd6ab508d684d1c0cb7f31fae42538ff0ad3768ea7b6581ef198fcadad61a1f99518130f938504814665ee955de400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rotpages.sty \
texlive-rotpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphics.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
