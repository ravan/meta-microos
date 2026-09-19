SUMMARY = "Typeset method and variable declarations"
DESCRIPTION = "The package supports typesetting of programming language method \
and variable declarations. It supports declarations in German, \
French and English."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn17485"

RPM_NAME = "texlive-method-2026.226.2.0bsvn17485-61.2.noarch.rpm"
RPM_HASH = "faa3e1765164491228d4e6e3f022176bec125bdb908ef3ddd5b1b704f2f3f47e8de7e5d9bc8a1468a6e2be55b39b20f2c240a3ac98cd2552bbe8f36dd0857534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-method.sty \
texlive-method"

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
