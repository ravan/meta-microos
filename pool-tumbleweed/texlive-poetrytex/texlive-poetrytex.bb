SUMMARY = "Typeset anthologies of poetry"
DESCRIPTION = "The package is designed to aid in the management and formatting \
of anthologies of poetry and other writings; it does not \
concern itself with actually typesetting the verse itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.1svn76924"

RPM_NAME = "texlive-poetrytex-2026.226.3.0.1svn76924-59.2.noarch.rpm"
RPM_HASH = "b92961900b3f132dd91f17ff2497a92527f6929fe0c4517a53c1899ce86330e0509e1e64ba551656655f45f8b008a48bd7dd794f6111b1a17ac17e5ee6a590ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poetrytex.sty \
texlive-poetrytex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
