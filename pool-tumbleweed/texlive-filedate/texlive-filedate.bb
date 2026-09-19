SUMMARY = "Access and compare info and modification dates"
DESCRIPTION = "The package provides basic access to the date of a LaTeX source \
file according to its \\Provides... entry (the 'info date') as \
well as to its modification date according to \\pdffilemoddate \
if the latter is available."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29529"

RPM_NAME = "texlive-filedate-2026.226.svn29529-59.2.noarch.rpm"
RPM_HASH = "09dcb33c3e8743ea087df1fc2ba5c1fce51e23fcb57dd5b7799999a18a56c35ccfc3cf5e346c68e9a1d37d8fd77ad4eb60faf2aa23551e4e8bf7ceebd5c05bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filedate.sty \
texlive-filedate"

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
