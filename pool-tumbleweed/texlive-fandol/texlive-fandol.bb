SUMMARY = "Four basic fonts for Chinese typesetting"
DESCRIPTION = "Fandol fonts designed for Chinese typesetting. The current \
version contains four styles: Song, Hei, Kai, Fang. All fonts \
are in OpenType format."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn37889"

RPM_NAME = "texlive-fandol-2026.226.0.0.3svn37889-59.2.noarch.rpm"
RPM_HASH = "1a50c2a4673affb97bbc91de2b1faf08214230191cc394dba96a7543e27b6f63b49ef1188a2827bc315b52eb1acb1337833c9b43b03aa25315844caec2fe8ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fandol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-fandol-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
