SUMMARY = "Colorful edits for multiple authors of a shared document"
DESCRIPTION = "This package provides a fairly light-weight solution for \
annotating LaTeX source code with color to show \
additions/changes, replacements, deletions, and comments. This \
is particularly useful when a document is being edited by \
multiple authors. Two package options allow the quick \
suppression of all colorful edits and comments, and showing \
text whose deletion was proposed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56707"

RPM_NAME = "texlive-color-edits-2026.226.1.1svn56707-60.2.noarch.rpm"
RPM_HASH = "7d9ce5e2f5174df257072a9d8c4347136a261d156e8de554b7dcb9be0d82bdb4be10303a775822d4950c32f2cfc81d8dbc614224aefbe236741450d3dc4ff09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color-edits.sty \
texlive-color-edits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
