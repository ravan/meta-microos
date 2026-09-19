SUMMARY = "Spell numbers in words (Italian)"
DESCRIPTION = "Sometimes we need to say 'Capitolo primo' or 'Capitolo uno' \
instead of 'Capitolo 1', that is, spelling the number in words \
instead of the usual digit form. This package provides support \
for spelling out numbers in Italian words, both in cardinal and \
in ordinal form."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-itnumpar-2026.226.1.0svn15878-63.2.noarch.rpm"
RPM_HASH = "13660e9b2ed863a8730cb48d4e725416950e0dd11cfe91e057c43b7563c56f03c8168bf6c130eaf866e777cc7a6d4728cbb1c3674e773e819de67994258eb0df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-itnumpar.sty \
texlive-itnumpar"

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
