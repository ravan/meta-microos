SUMMARY = "Build a format based on the preamble of a LaTeX file"
DESCRIPTION = "The use of formats helps to speed up compilations: packages \
which have been dumped in the format are loaded at very high \
speed. This is useful when a document loads many packages \
(including large packages such as pgf-TikZ). The package was \
developed from the work in mylatex, and eliminates many of the \
limitations and problems of that package."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4svn21392"

RPM_NAME = "texlive-mylatexformat-2026.226.3.4svn21392-61.2.noarch.rpm"
RPM_HASH = "93c2d1d4f0ab8a62bcacb635f9f68ebe3e4511a3b710f61b5a5c9a4861e38477851881b5508a7707914fe2a0045c1c350688f8cbb9681adfb4995385602b16cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatexformat"

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
