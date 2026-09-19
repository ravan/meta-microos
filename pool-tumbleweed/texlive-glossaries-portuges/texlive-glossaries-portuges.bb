SUMMARY = "Portuges language module for glossaries package"
DESCRIPTION = "Portuges language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-2026.226.1.1svn36064-60.4.noarch.rpm"
RPM_HASH = "5445f2fdc58539f8de12bae8afc3ea1b0c99f8ae69f9168d278a0e381af792d9ab8011c9116b6f54b44287306183cee45ccb595bbe80468c2b9e1ec3589907eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-portuges-noenc.ldf \
tex-glossaries-portuges-utf8.ldf \
tex-glossaries-portuges.ldf \
tex-glossaries-pt-BR.ldf \
texlive-glossaries-portuges"

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
