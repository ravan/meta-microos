SUMMARY = "Nynorsk language module for the glossaries package"
DESCRIPTION = "Norwegian Nynorsk language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67201"

RPM_NAME = "texlive-glossaries-nynorsk-2026.226.1.0svn67201-60.4.noarch.rpm"
RPM_HASH = "66db76a9c40e490335f1028efc40d8b4638cfdee9c06e4d82c0819980c1077a3a4bdac1997075800074193a8208b5dcc68c7888da1de21e608e935312b872f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-nynorsk.ldf \
texlive-glossaries-nynorsk"

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
