SUMMARY = "Extensions of the \\listfiles concept"
DESCRIPTION = "The package provides a file list (similar to that offered by \
\\listfiles), neatly laid out as a table. The main document can \
be included in the list, and a command is available for \
providing RCS-maintained data for printing in the file list."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn27974"

RPM_NAME = "texlive-dateiliste-2026.226.0.0.6svn27974-61.2.noarch.rpm"
RPM_HASH = "d4e088ae24a9d4a7f6821108c35a382e729a0844ea27388dc4a6f9893b8ff2e4384bec83e2f3399c51e766664322093dec557216ed18de68fcfffddd515eb193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dateiliste.sty \
texlive-dateiliste"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxtable.sty \
tex-rcsinfo.sty \
tex-svninfo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
