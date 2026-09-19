SUMMARY = "Unicode small caps with Lua/XeLaTeX"
DESCRIPTION = "LaTeX produces small caps with \\textsc{text} or {\\scshape \
text}. Neither of these commands produce small caps in Unicode. \
If the output text is copied and pasted somewhere it shows the \
same characters as used in the input. This package aims to \
internally convert all the characters provided to the commands \
mentioned above. It assumes that the file using this package is \
compiled with Lua/XeLaTeX and a good Unicode font which has the \
small caps characters, e.g., Charis SIL."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn63178"

RPM_NAME = "texlive-unisc-2026.226.0.0.2svn63178-60.2.noarch.rpm"
RPM_HASH = "f63dcf798acc6d081ff2f0b0076aa24249d745648bb7816f06d2c73a2946f2b26d00bfc64d9e27f11d0409649500b8ba08d1492f26ecc2d750d7f719d5af73aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unisc.sty \
texlive-unisc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfparser.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
