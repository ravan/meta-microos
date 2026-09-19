SUMMARY = "Graphical representation of keys on a standard scientific calculator"
DESCRIPTION = "This package provides commands to draw scientific calculator \
keys with the help of TikZ. It also provides commands to draw \
the content of screens and of menu items."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn36306"

RPM_NAME = "texlive-ticollege-2026.227.1.0svn36306-62.2.noarch.rpm"
RPM_HASH = "4b4cf56ea2fcb5f270f8e5b99399994956e143fc4e878a807045921b12cfaf9bb36187190d0615be5768e0e406d657b17dfa31fa837040d10f09307156eea09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ticollege.sty \
texlive-ticollege"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-multido.sty \
tex-multirow.sty \
tex-newtxtt.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
