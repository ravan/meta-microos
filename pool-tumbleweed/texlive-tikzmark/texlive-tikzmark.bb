SUMMARY = "Use TikZ's method of remembering a position on a page"
DESCRIPTION = "The tikzmark package defines a command to 'remember' a position \
on a page for later (or earlier) use, primarily (but not \
exclusively) with TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn64819"

RPM_NAME = "texlive-tikzmark-2026.226.1.15svn64819-59.2.noarch.rpm"
RPM_HASH = "c2cf017f00fa710c81a2c8aa90a5fc340b4bb80b8f5eca1fa608bac002d216b2f9d95f8689ca7d6b92e04e614f4ac611f43e988416aecb77c03f17143e4016e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarytikzmark.code.tex \
tex-tikzmarklibraryams.code.tex \
tex-tikzmarklibraryhighlighting.code.tex \
tex-tikzmarklibrarylistings.code.tex \
texlive-tikzmark"

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
