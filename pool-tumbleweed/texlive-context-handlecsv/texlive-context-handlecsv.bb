SUMMARY = "Data merging for automatic document creation"
DESCRIPTION = "The package handles csv data merging for automatic document \
creation."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76721"

RPM_NAME = "texlive-context-handlecsv-2026.226.svn76721-61.2.noarch.rpm"
RPM_HASH = "db4718d8b4712a2d1197533ab25d0a5649b101df140f5b88a72739c90e5159c46a22df22b15fae973ec8c5b265a7757fa6ffc96f9a8b092c22d21b5c2bd79d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-handlecsv.tex \
texlive-context-handlecsv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
