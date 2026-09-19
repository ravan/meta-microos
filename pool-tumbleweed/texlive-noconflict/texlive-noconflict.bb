SUMMARY = "Resolve macro name conflict between packages"
DESCRIPTION = "The package provides several commands to prefix (and hence \
obscure) a macro's (or a sequence of macros') name, and to \
restore the original macro(s) at places in a document where \
they are needed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn30140"

RPM_NAME = "texlive-noconflict-2026.226.1.0svn30140-61.2.noarch.rpm"
RPM_HASH = "1a412092660935d4fe17e4cdd817e89c811d98128d6fe324e37ecdf659ebd08aaa483ccefc6cc831b32223d34656ca43a37170a8833207b0c956b63f82e0f825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-noconflict.sty \
texlive-noconflict"

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
