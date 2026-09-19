SUMMARY = "A bash wrapper for pdfTeX limiting its output to relevant errors"
DESCRIPTION = "This package provides a bash script aiming at reducing pdfTeX's \
output to relevant errors, which are displayed in a red bold \
font. The project originally started as a TeX StackExchange \
answer."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.0svn49169"

RPM_NAME = "texlive-pdftex-quiet-2026.226.1.1.0svn49169-58.2.noarch.rpm"
RPM_HASH = "9c043004cd632ce7dbe6d9003248eea75ce20537afed850ebc481825ad16346c4fc042443557d617f2a07ff49d969be062011828b6735648d6a19a7696e36fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftex-quiet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftex-quiet-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
