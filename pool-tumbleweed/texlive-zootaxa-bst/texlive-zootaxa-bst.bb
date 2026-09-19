SUMMARY = "A BibTeX style for the journal Zootaxa"
DESCRIPTION = "This package provides a .bst reference style file for the \
journal Zootaxa that publishes contributions in zoology and \
classification. This is a fork of apa.bst as provided by TeX \
Live since this style file resembled the most Zootaxa's own \
style. Further modifications were made to the code in order to \
generate in-text citations and bibliography sections \
appropriately."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-zootaxa-bst-2026.226.1.0svn76790-59.4.noarch.rpm"
RPM_HASH = "0b6778f88405c28657de1fbf1189479c1431db3cf1ee44a20a8ba6fe3de85f88c860921b605929ffcd63a631143b16edb92fcc65c80cfb5ce46f832c32236404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst"

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
