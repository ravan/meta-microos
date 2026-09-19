SUMMARY = "Class for UIUC thesis red-bordered forms"
DESCRIPTION = "The class offers a means of filling out the 'red-bordered form' \
that gets signed by the department head, your advisor, and -- \
for doctoral dissertations -- your thesis committee members."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn29974"

RPM_NAME = "texlive-uiucredborder-2026.226.1.00svn29974-60.2.noarch.rpm"
RPM_HASH = "72944dfad1f813d15269f0eddea0887ed955d29176f887f99d473cfe1738f9b1f597a6d8251554e6f8c4ce517b3461f1677c1f53c694692e559cb509e389d3cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uiucredborder.cls \
texlive-uiucredborder"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
