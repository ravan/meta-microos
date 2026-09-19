SUMMARY = "Various BibTeX formats for journals in Chemistry"
DESCRIPTION = "Various BibTeX formats for journals in Chemistry, including \
Reviews in Computational Chemistry, Journal of Physical \
Chemistry, Journal of Computational Chemistry, and Physical \
Chemistry Chemical Physics."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-chem-journal-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "ff9fc38fd3be40321938122feaaaac0331550f5e2b3c16856997b7d2dcd4e1a31bfcbbadca1c60d07f6d2deb10a15ef2185c92044d5b9009c20f8afd6e45e840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chem-journal"

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
