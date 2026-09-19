SUMMARY = "Unofficial reference manual covering LaTeX2e"
DESCRIPTION = "The manual is provided as Texinfo source (which was originally \
derived from the VMS help file in the DECUS TeX distribution of \
1990, with many subsequent changes). This is a collaborative \
development, and details of getting involved are to be found on \
the package home page. A Spanish translation is included here, \
and a French translation is available as a separate package. \
All the other formats in the distribution are derived from the \
Texinfo source, as usual."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-latex2e-help-texinfo-spanish-2026.226.svn75712-61.2.noarch.rpm"
RPM_HASH = "bada3887d3f5b76f1fd3372089dc49452978c75bd50ed5f22a06f10d3886366d905738bd148c23b7431fd490b22e7d0d6d8157584b8c6fab66a2256240d20447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo-spanish"

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
