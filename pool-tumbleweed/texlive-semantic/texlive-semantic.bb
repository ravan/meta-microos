SUMMARY = "Help for writing programming language semantics"
DESCRIPTION = "Eases the typesetting of notation of semantics and compilers. \
Includes T-diagrams, various derivation symbols and inference \
trees."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-semantic-2026.226.2.0svn15878-60.2.noarch.rpm"
RPM_HASH = "1808b71b484ea2ee5f87d55be6891901a385ab107255c8b45a557961c68087490362a8d35a208b722c882c16fe35ab665eb47c81e4201755f482255dd3a000b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-infernce.sty \
tex-ligature.sty \
tex-reserved.sty \
tex-semantic.sty \
tex-shrthand.sty \
tex-tdiagram.sty \
texlive-semantic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathbbol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
