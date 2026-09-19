SUMMARY = "Shell script interface to pdfpages"
DESCRIPTION = "The package makes available the pdfjam shell script that \
provides a simple interface to much of the functionality of the \
excellent pdfpages package (by Andreas Matthias) for LaTeX. The \
pdfjam script takes one or more PDF (and/or JPG/PNG) files as \
input, and produces one or more PDF files as output. It is \
useful for joining files together, selecting pages, reducing \
several source pages onto one output page, etc., etc."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.2svn75152"

RPM_NAME = "texlive-pdfjam-2026.226.4.2svn75152-58.2.noarch.rpm"
RPM_HASH = "ac53f0ab0f05e7ab3787a064315be9a85426b98e3496467c67fb4db887780dff8601d04f806139d09c9371999a50ed9f34f91f81b3de35993439b03bb0877cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfjam"

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
texlive-pdfjam-bin \
texlive-pdfpages \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
