SUMMARY = "German language module for glossaries package"
DESCRIPTION = "German language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "9bc508e037962431cecf57aa7e7899ded4b68d7aa502a0949bc5c909a36c2424d54be0b9530de0ca82f918c87e8fd3d0d4b87e7ce432fff176ba777e007ac316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-german.ldf \
texlive-glossaries-german"

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
