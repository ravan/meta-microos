SUMMARY = "Typesets pseudocode as in Introduction to Algorithms"
DESCRIPTION = "This package allows you to typeset pseudocode in the style of \
Introduction to Algorithms, Third edition, by Cormen, \
Leiserson, Rivest, and Stein. The package was written by the \
authors. Use the commands the same way the package's author did \
when writing the book, and your output will look just like the \
pseudocode in the text."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51137"

RPM_NAME = "texlive-clrscode3e-2026.226.svn51137-60.2.noarch.rpm"
RPM_HASH = "c06603324a14ee080c37173ada3d80c12f733c7d1e0cec76a929a0b59c9b994f90d443e42014cc71e84891fd6ab475eaa8dee3db48e3f99a3544684f55f076bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrscode3e.sty \
texlive-clrscode3e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
