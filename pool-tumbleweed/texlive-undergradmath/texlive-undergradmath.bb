SUMMARY = "LaTeX Math for Undergraduates cheat sheet"
DESCRIPTION = "This is a cheat sheet for writing mathematics with LaTeX. It is \
aimed at US undergraduates."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn57286"

RPM_NAME = "texlive-undergradmath-2026.226.svn57286-60.2.noarch.rpm"
RPM_HASH = "e4282627e7c6aea5de03a4d8b73c687f5e4c1bc143a0a6e725977cba6c2cb617603b2175568fe5f00e068c2a65b58296639b7e372d1b3b686f9ec8523a1ba1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-undergradmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
