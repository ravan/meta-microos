SUMMARY = "Create forms containing field for manual entry"
DESCRIPTION = "When typesetting forms there often arises the need for defining \
fields which consist of one or more lines where the customer \
can write something down manually. This package offers some \
commands for defining such fields in a distinctive way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn15878"

RPM_NAME = "texlive-formular-2026.226.1.0asvn15878-60.2.noarch.rpm"
RPM_HASH = "d966bd9df7f933a6daf734a943026038c2738f79db7dce2682ddad1134051aa6ffb0fbd63e24d760e4ac37037494594b6bffccd997d14e16c2a88259dbe9579e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-formular.sty \
texlive-formular"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
