SUMMARY = "Testing hyphenation patterns"
DESCRIPTION = "The package may be used for testing hyphenation patterns or for \
controlling that specific words are hyphenated as expected. \
This package implements some old TUGboat code to adapt it to \
LaTeX with some enhancements. It differs form \\showhyphens, \
because it typesets its output on the document's output file. \
It also works with xelatex, where \\showhyphens requires a \
workaround."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn73486"

RPM_NAME = "texlive-testhyphens-2026.227.1.0svn73486-62.2.noarch.rpm"
RPM_HASH = "00943183fddbd44e692e39931dc86d0d21b6044abc6dd0bd03a0be8045a6b0386f09c1a02419a8341091afb8cfaac89cac2c45b5ba777912266fe094ab9b1b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-testhyphens.sty \
texlive-testhyphens"

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
