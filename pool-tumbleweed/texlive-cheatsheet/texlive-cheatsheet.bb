SUMMARY = "A simple cheatsheet class"
DESCRIPTION = "The package provides a clean, multi-column design intended for \
cheat sheets. It imports the most useful packages and encloses \
the document in a multicol environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn45069"

RPM_NAME = "texlive-cheatsheet-2026.226.0.0.8svn45069-60.2.noarch.rpm"
RPM_HASH = "91f43655bf9daa0c22cbcb63c9c2473a33afa5141abd727948026e5cb3b86905b15b67bf2ae528ab8a48cfc8956ddd5afd17032467071de66691d1058ce33b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cheatsheet.cls \
texlive-cheatsheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-libertine.sty \
tex-listings.sty \
tex-mdframed.sty \
tex-multicol.sty \
tex-suffix.sty \
tex-xcolor.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
