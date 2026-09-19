SUMMARY = "Multiple bibliographies in one document"
DESCRIPTION = "The package provide a mechanism to generate separate \
bibliographies for different units (chapters, sections or \
bibunit-environments) of a text. The package separates the \
citations of each unit of text into a separate file to be \
processed by BibTeX. The global bibliography section produced \
by LaTeX may also appear in the document and citations can be \
placed in both the local unit and the global bibliographies at \
the same time. The package is compatible with koma-script and \
with the babel French option frenchb."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-bibunits-2026.226.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "2660a3242cc872340977e43fc759834f561ba14bb9da75cd0093b4823653d617bc8bfdf503386cb6ff8fb7f6a38f9f8bfc6765af252626afafcb035a3ffc7b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibunits.sty \
texlive-bibunits"

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
