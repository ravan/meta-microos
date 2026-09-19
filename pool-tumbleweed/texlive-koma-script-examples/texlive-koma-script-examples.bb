SUMMARY = "Examples from the KOMA-Script book"
DESCRIPTION = "This package contains some examples from the 6th edition of the \
book >>KOMA-Script<<, >>Eine Sammlung von Klassen und Paketen \
fur LaTeX2e<< by Markus Kohm, published by Lehmanns Media. \
There are no further descriptions of these examples."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63833"

RPM_NAME = "texlive-koma-script-examples-2026.226.svn63833-63.2.noarch.rpm"
RPM_HASH = "7e4807eeb983d85f95c35a1e974f036956d165647474a21c2c38baa89514a7f5c82657d074ecded644516e106bc264fa9af3af0c05e29097ee44af5d15d14f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-examples"

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
