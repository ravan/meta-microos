SUMMARY = "Typeset a curriculum vitae"
DESCRIPTION = "Currvita is a package rather than a class (like most other \
curriculum vitae offerings). The author considers that a \
curriculum vitae can quite reasonably form part of another \
document (such as a letter, or a dissertation)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-currvita-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "43e641eaf7c29ececf33891450b9c41003e5b23b23a875222c5a967a7b3432ca66fd681e82a3c0ccbad0795b4cdc8c7ae93f7c02e787d4339969db12308e1fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-currvita.sty \
texlive-currvita"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
