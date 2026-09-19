SUMMARY = "Typeset autosegmental representations for linguists"
DESCRIPTION = "The package allows the user to typeset autosegmental \
representations. It uses the PStricks, and xkeyval packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn22138"

RPM_NAME = "texlive-pst-asr-2026.226.1.3svn22138-59.2.noarch.rpm"
RPM_HASH = "cb324bad5dcb1641e70eb0cb7a07d8c34ed8d5708355f6bdf0b5e5ecd300d4175ea2adde022c8a02803f168f7f41e12fadff257225742f4a694c955af63621aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-asr.sty \
tex-pst-asr.tex \
texlive-pst-asr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
