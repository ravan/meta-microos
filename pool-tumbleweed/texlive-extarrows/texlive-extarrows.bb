SUMMARY = "Extra Arrows beyond those provided in amsmath"
DESCRIPTION = "Arrows are provided to supplement \\xleftarrow and \\xrightarrow \
of the amsath package: \\xlongequal, \\xLongleftarrow, \
\\xLongrightarrow, \\xLongleftrightarrow, \\xLeftrightarrow. \
\\xlongleftrightarrow, \\xleftrightarrow, \\xlongleftarrow and \
\\xlongrightarrow."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.2.0svn77682"

RPM_NAME = "texlive-extarrows-2026.226.1.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "7538cf3c28186a80e7243fbda328f18e437c7ce21fe6ba480c3f51ccebc074a33ecc347a22cd66987b0476b5374935c9804adb09d24c94e5898e991386607af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extarrows.sty \
texlive-extarrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
