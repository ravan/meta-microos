SUMMARY = "Minipages with marginal notes"
DESCRIPTION = "This package allows \\marginpar-commands inside of minipages and \
other boxes. (It takes another approach than marginnote by \
Markus Kohm: it saves all \\marginpar-commands and typesets them \
outside (i.e., after) the box.) The package defines an \
environment minipagewithmarginpars (to be used like \
minipage)--and the internal commands may be used by other \
packages to define similar environments or commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-minipage-marginpar-2026.226.0.0.2svn15878-61.2.noarch.rpm"
RPM_HASH = "38c8cfb99117e2204f888ba4df38a2178767634da032bffd9589d4e64275c3115b8c90f03fd6c999eaf603220aa9d17109ec6747276a30c4c0aa4befce6bf76c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minipage-marginpar.sty \
tex-mpgmpar.sty \
texlive-minipage-marginpar"

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
