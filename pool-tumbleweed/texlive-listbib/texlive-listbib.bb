SUMMARY = "Lists contents of BibTeX files"
DESCRIPTION = "Generates listings of bibliographic data bases in BibTeX format \
-- for example for archival purposes. Included is a listbib.bst \
which is better suited for this purpose than the standard \
styles."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.2svn29349"

RPM_NAME = "texlive-listbib-2026.226.2.2svn29349-61.2.noarch.rpm"
RPM_HASH = "b159a9727b72f212e03a32fa5d4645f2a6e19ac9d57de853c3bd05846a37ba15901dddd3964b3b47626c4477a19ef58bd20dad2b24603387ef451de841137fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listbib.cfg \
tex-listbib.sty \
tex-listbib.tex \
texlive-listbib"

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
texlive-listbib-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
