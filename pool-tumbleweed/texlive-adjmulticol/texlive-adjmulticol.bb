SUMMARY = "Adjusting margins for multicolumn and single column output"
DESCRIPTION = "The package adds, to the multicol package, the option to change \
the margins for multicolumn and unicolumn layout. The package \
understands the difference between the even and odd margins for \
two side printing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-adjmulticol-2026.226.1.5svn77682-61.2.noarch.rpm"
RPM_HASH = "4a6e09a8806bf475cdec052c66c0933dddc0681bedf9baae75cf10d55111450bc388229f5c4d0ef78a79372d800a8b64db9ec37c994abe9b852c6ac0a89d7908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adjmulticol.sty \
texlive-adjmulticol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
