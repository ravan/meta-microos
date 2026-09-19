SUMMARY = "Tables with captions and notes all the same width"
DESCRIPTION = "Provides a scheme for tables that have a structured note \
section, after the caption. This scheme provides an answer to \
the old problem of putting footnotes in tables -- by making \
footnotes entirely unnecessary. Note that a threeparttable is \
not a float of itself; but you can place it in a table or a \
table* environment, if necessary."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77682"

RPM_NAME = "texlive-threeparttable-2026.227.svn77682-62.2.noarch.rpm"
RPM_HASH = "8d8065774cced8f61848a3de4ba9418a2b71595f4dbfe53fd147ce411837791d7adedd6f6394a1316b38cf3f01416f0331e9229731b2b2ae09838fa44e0f4f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-3parttable.sty \
tex-threeparttable.sty \
texlive-threeparttable"

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
