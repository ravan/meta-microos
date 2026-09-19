SUMMARY = "Track skills of classroom checks"
DESCRIPTION = "This package is an attempt to track skills assessed during a \
classroom check. Each question can be associated with one or \
more skills and be assigned a number of points to be earned. At \
the end of the text, a table set summarizes the skills \
assessed, and in what proportions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47573"

RPM_NAME = "texlive-competences-2026.226.1.0svn47573-60.2.noarch.rpm"
RPM_HASH = "4303f2b331c813f1eefbfd140d5522a43968012f09250be46cfae88a16b2cb3a6516db2aea6de91487dfd17e28a9cec720fb39a8f2f906cc64862e9780bae016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-competences.sty \
texlive-competences"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-etoolbox.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
