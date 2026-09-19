SUMMARY = "Identify draft copies"
DESCRIPTION = "Places the word DRAFT (or other words) in light grey diagonally \
across the background (or at the bottom) of each (or selected) \
pages of the document. The package uses PostScript \\special \
commands, and may not therefore be used with pdfLaTeX. For that \
usage, consider the wallpaper or draftwatermark packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn15878"

RPM_NAME = "texlive-draftcopy-2026.226.2.16svn15878-59.2.noarch.rpm"
RPM_HASH = "bd6b20dd524afea2ae76178c430d0eafb83f347a65ede8e746dab70fed8207a26e169d8f084b44c760a5622203539321f26d85de48ba14fb89dc82f2ba0b847a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-draftcopy.cfg \
tex-draftcopy.sty \
texlive-draftcopy"

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
