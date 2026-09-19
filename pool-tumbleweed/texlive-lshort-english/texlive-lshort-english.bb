SUMMARY = "A (Not So) Short Introduction to LaTeX2e"
DESCRIPTION = "The document derives from a German introduction ('lkurz'), \
which was translated and updated; it continues to be updated. \
This translation has, in its turn, been translated into several \
other languages; see the lshort catalogue entry for the current \
list."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.6.4svn58309"

RPM_NAME = "texlive-lshort-english-2026.226.6.4svn58309-61.2.noarch.rpm"
RPM_HASH = "cdb561dabda6838a108edd3c1d8fa6cdc13784bbec3de0122325cc953e646120114631f3c22946c78f74caa7c562a3173c1218a8fa017e1333f8c7a88fcb1479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-english"

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
