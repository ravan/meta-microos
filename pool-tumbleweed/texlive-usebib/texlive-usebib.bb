SUMMARY = "A simple bibliography processor"
DESCRIPTION = "The package is described by its author as 'a poor person's \
replacement for the more powerful methods provided by BibLaTeX \
to access data from a .bib file'. Its principle commands are \
\\bibinput (which specifies a database to use) and \\usebibdata \
(which typesets a single field from a specified entry in that \
database."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-usebib-2026.226.1.0asvn77682-60.2.noarch.rpm"
RPM_HASH = "db81c566ceb32aa44aaf4f1f799daef1411e7d398aa05631fd8b7e9b583f00253dc6e83c82989bb8f7a15aa4592c4372330f0183d8fd00f1ee7f3224c6de19a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-usebib.sty \
texlive-usebib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
