SUMMARY = "Formatting indexes"
DESCRIPTION = "This package provides a way to generate the format of index \
entries from within LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn52311"

RPM_NAME = "texlive-gindex-2026.226.0.0.2svn52311-60.2.noarch.rpm"
RPM_HASH = "08df93c2b6d0059b09737e4981f1f5695812bab60ac8f5a5569179a58ca90b3c2d85d2dbc323164aa910b27fa3522287c8c091da926267a1085d5ad1f1db0ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gindex.sty \
texlive-gindex"

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
