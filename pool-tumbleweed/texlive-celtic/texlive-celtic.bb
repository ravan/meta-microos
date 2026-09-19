SUMMARY = "A TikZ library for drawing celtic knots"
DESCRIPTION = "The package provides a TikZ library for drawing celtic knots."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn39797"

RPM_NAME = "texlive-celtic-2026.226.1.1svn39797-59.2.noarch.rpm"
RPM_HASH = "65889581bd3589cca873b7b87fd3b8fb3524c8e8b7767aba196780486a1566b303401d671b235388de09bfc7d90c416787bef2ffedb56d59a4420fe16585a1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryceltic.code.tex \
texlive-celtic"

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
