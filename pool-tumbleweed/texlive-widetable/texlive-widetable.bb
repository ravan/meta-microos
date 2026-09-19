SUMMARY = "An environment for typesetting tables of specified width"
DESCRIPTION = "The package defines a new environment that, unlike tabularX, \
typesets a table of specified width by working on the \
inter-column glue; the tabular cells will all be stretched (or \
shrunk) according to need. The package will use the e-TeX \
arithmetic extensions if they are available (they are, in most \
modern distributions)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-widetable-2026.226.2.1svn77682-60.2.noarch.rpm"
RPM_HASH = "244027ff92279ae9e17c492523b320bd5098f5a4bab9ca2d4106d823809db46b667359e6509310219de78ce8700c880b8d5c112954e8f49029a0bf78218ea2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-widetable.sty \
texlive-widetable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
